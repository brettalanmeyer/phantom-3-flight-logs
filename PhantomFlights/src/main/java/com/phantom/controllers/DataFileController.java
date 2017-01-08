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
import com.phantom.storage.StorageService;

@Controller
public class DataFileController {
	
	private static final Logger logger = LoggerFactory.getLogger(DataFileController.class);
	
	@Autowired
	private StorageService storageService;
	
	@RequestMapping(value = "/data-files", method = RequestMethod.GET)
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
		
		List<String> jsonFiles = this.storageService.loadAllJson().map(path -> path.getFileName().toString()).collect(Collectors.toList());
		List<String> jsonFilesExtensionless = new ArrayList<>();
		for(String jsonFile : jsonFiles){
			jsonFilesExtensionless.add(jsonFile.substring(0, jsonFile.indexOf('.')));
		}
		
		for(int i = 0; i < datFiles.size(); i++){
			Map<String, Object> map = new HashMap<>();
			map.put("name", datFiles.get(i));
			map.put("processed", csvFilesExtensionless.contains(datFilesExtensionless.get(i)));
			dats.add(map);
		}
		
		for(int i = 0; i < csvFiles.size(); i++){
			Map<String, Object> map = new HashMap<>();
			map.put("name", csvFiles.get(i));
			map.put("processed", jsonFilesExtensionless.contains(csvFilesExtensionless.get(i)));
			csvs.add(map);
		}
		
		model.addAttribute("dats", dats);
		model.addAttribute("csvs", csvs);
		model.addAttribute("jsons", jsonFiles);
		
		return "dat.index";
	}
	
	@RequestMapping(value = "/data-files/upload", method = RequestMethod.POST)
	public String upload(@RequestParam("file") MultipartFile file) {
		String name = file.getOriginalFilename();
		logger.info("Uploading DAT File '{}'", name);
		
		if(this.storageService.storeDat(file)) {
			logger.info("DAT File '{}' successfully uploaded", name);
		} else {
			logger.info("DAT File '{}' has already been uploaded", name);
		}
		
		return "redirect:/data-files";
	}
	
	@RequestMapping(value = "/data-files/process-dat", method = RequestMethod.POST)
	public String processDat(@RequestParam("dat") String dat) {
		logger.info("Converting DAT file '{}' to CSV", dat);
		
		if(dat != null && !dat.isEmpty()){
			String csv = dat.substring(0, dat.indexOf(".")) + ".csv";
			
			Path datPath = this.storageService.datPath(dat);
			Path csvPath = this.storageService.csvPath(csv);
			
			logger.info("Beginning DAT to CSV Conversion");
			
			CLIDatCon.convert(datPath, csvPath);
			
			logger.info("Completing DAT to CSV Conversion");
		}
		
		return "redirect:/data-files";
	}
	
	@RequestMapping(value = "/data-files/process-csv", method = RequestMethod.POST)
	public String processCsv(@RequestParam("csv") String csv) {
		logger.info("Converting CSV file '{}' to JSON", csv);
		
		if(csv != null && !csv.isEmpty()){
			String json = csv.substring(0, csv.indexOf(".")) + ".json";
			
			Path csvPath = this.storageService.csvPath(csv);
			Path jsonPath = this.storageService.jsonPath(json);
			
			logger.info("Beginning CSV to JSON Conversion");

			String jsonData = DataReader.convertCsvToJson(csvPath);
			this.storageService.storeJson(jsonPath, jsonData);
			
			logger.info("Completing CSV to JSON Conversion");
		}
		
		return "redirect:/data-files";
	}
	
	@RequestMapping(value = "/data-files/delete", method = RequestMethod.POST)
	public String delete(@RequestParam("file") String file, @RequestParam("type") String type) {
		logger.info("Deleting file '{}'", file);
		
		if(file != null && !file.isEmpty()){
			Path path = null;
			if("dat".equals(type)){
				path = this.storageService.datPath(file);
			} else if("csv".equals(type)) {
				path = this.storageService.csvPath(file);
			} else if("json".equals(type)) {
				path = this.storageService.jsonPath(file);
			}
			this.storageService.delete(path);
		}
		
		return "redirect:/data-files";
	}
	
}
