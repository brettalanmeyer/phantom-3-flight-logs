package com.phantom.controllers;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.phantom.converters.CLIDatCon;
import com.phantom.ingestion.DataReader;
import com.phantom.ingestion.FlightLogIngestor;
import com.phantom.ingestion.LogEntry;
import com.phantom.service.DataService;
import com.phantom.storage.StorageService;

@Controller
public class DatController {
	
	private static final Logger logger = LoggerFactory.getLogger(DatController.class);
	
	@Autowired
	private StorageService storageService;
	
	@Autowired
	private DataService dataService;

	@RequestMapping(value = "/dat", method = RequestMethod.GET)
	public String index(Model model) {

		List<Map<String, Object>> dats = new ArrayList<>();
		List<String> datFiles = this.storageService.loadAllDat().map(path -> path.getFileName().toString()).collect(Collectors.toList());
		List<String> datFilesExtensionless = new ArrayList<>();
		for(String datFile : datFiles){
			datFilesExtensionless.add(datFile.substring(0, datFile.indexOf('.')));
		}
		
		List<Map<String, Object>> csvs = new ArrayList<>();
		List<String> csvFiles = this.storageService.loadAllCsv().map(path -> path.getFileName().toString()).collect(Collectors.toList());
		List<String> csvFilesExtensionless = new ArrayList<>();
		for(String csvFile : csvFiles){
			csvFilesExtensionless.add(csvFile.substring(0, csvFile.indexOf('.')));
		}
		
		List<String> tags = this.dataService.getTags();
		
		
		for(int i = 0; i < datFiles.size(); i++){
			Map<String, Object> map = new HashMap<>();
			map.put("name", datFiles.get(i));
			map.put("processed", csvFilesExtensionless.contains(datFilesExtensionless.get(i)));
			dats.add(map);
		}
		
		for(int i = 0; i < csvFiles.size(); i++){
			Map<String, Object> map = new HashMap<>();
			map.put("name", csvFiles.get(i));
			map.put("processed", tags.contains(csvFilesExtensionless.get(i)));
			csvs.add(map);
		}
		
		model.addAttribute("dats", dats);
		model.addAttribute("csvs", csvs);
		
		return "dat.index";
	}
	
	@RequestMapping(value = "/dat/upload", method = RequestMethod.POST)
	public String upload(@RequestParam("file") MultipartFile file) {
		String name = file.getOriginalFilename();
		logger.info("Uploading DAT File '{}'", name);
		
		if(this.storageService.storeDat(file)) {
			logger.info("DAT File '{}' successfully uploaded", name);
		} else {
			logger.info("DAT File '{}' has already been uploaded", name);
		}
		
		return "redirect:/dat";
	}
	
	@RequestMapping(value = "/dat/convert", method = RequestMethod.POST)
	public String convert(@RequestParam("dat") String dat) {
		logger.info("Converting DAT file '{}' to CSV", dat);
		
		if(dat != null && !dat.isEmpty()){
			String csv = dat.substring(0, dat.indexOf(".")) + ".csv";
			
			Path datPath = this.storageService.loadDat(dat);
			Path csvPath = this.storageService.loadCsv(csv);
			
			logger.info("Beginning DAT to CSV Conversion");
			
			CLIDatCon.convert(datPath, csvPath);
			
			logger.info("Completing DAT to CSV Conversion");
		}
		
		return "redirect:/dat";
	}
	
	@RequestMapping(value = "/dat/ingest", method = RequestMethod.POST)
	public String ingest(@RequestParam("csv") String csv) {
		logger.info("Beginning ingestion of CSV file '{}' to influxDB", csv);
		
		if(csv != null && !csv.isEmpty()){
			Path csvPath = this.storageService.loadCsv(csv);

			String tag = csv.substring(0, csv.indexOf("."));
			FlightLogIngestor flightLogIngestor = new FlightLogIngestor(tag);

			List<LogEntry> logData = DataReader.readLogData(csvPath);

			boolean first = true;
			for(LogEntry logEntry : logData){
				if(first){
					first = false;
					continue;
				}
				flightLogIngestor.logEntry(logEntry);
			}
			
			flightLogIngestor.close();
		}
		
		logger.info("Completing ingestion of CSV file '{}' to influxDB", csv);
		
		return "redirect:/dat";
	}
	
	@RequestMapping(value = "/dat/delete", method = RequestMethod.POST)
	public String delete(@RequestParam("file") String file, @RequestParam("type") String type) {
		logger.info("Deleting file '{}'", file);
		
		if(file != null && !file.isEmpty()){
			Path path = null;
			if("dat".equals(type)){
				path = this.storageService.loadDat(file);
			} else if("csv".equals(type)) {
				path = this.storageService.loadCsv(file);
			}
			this.storageService.delete(path);
		}
		
		return "redirect:/dat";
	}
	
}
