package com.phantom.controllers;

import java.nio.file.Path;
import java.util.List;
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
import com.phantom.storage.StorageService;
@Controller
public class DatController {
	
	private static final Logger logger = LoggerFactory.getLogger(DatController.class);
	
	private final StorageService storageService;

	@Autowired
	public DatController(StorageService storageService) {
		this.storageService = storageService;
	}
	
	@RequestMapping(value = "/dat", method = RequestMethod.GET)
	public String index(Model model) {
		
		List<String> datFiles = this.storageService.loadAllDat().map(path -> path.getFileName().toString()).collect(Collectors.toList());
		List<String> csvFiles = this.storageService.loadAllCsv().map(path -> path.getFileName().toString()).collect(Collectors.toList());
		
		model.addAttribute("datFiles", datFiles);
		model.addAttribute("csvFiles", csvFiles);
		
		return "dat.index";
	}
	
	@RequestMapping(value = "/dat/upload", method = RequestMethod.POST)
	public String upload(@RequestParam("file") MultipartFile file) {
		storageService.storeDat(file);
		return "redirect:/dat";
	}
	
	@RequestMapping(value = "/dat/convert", method = RequestMethod.POST)
	public String convert(@RequestParam("dat") String dat) {
		
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
		
		if(csv != null && !csv.isEmpty()){
			
			Path csvPath = this.storageService.loadCsv(csv);
			FlightLogIngestor flightLogIngestor = new FlightLogIngestor();
			List<LogEntry> logData = DataReader.readLogData(csvPath);

			for(LogEntry logEntry : logData){
				flightLogIngestor.logEntry(logEntry);
			}
			
			flightLogIngestor.close();
		}
		
		return "redirect:/dat";
	}
	
	@RequestMapping(value = "/dat/delete", method = RequestMethod.POST)
	public String delete(@RequestParam("file") String file, @RequestParam("type") String type) {
			
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
