package com.phantom.controllers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.phantom.storage.StorageService;

@Controller
public class MainController {
	
	@Autowired
	private StorageService storageService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
		List<String> flights = this.storageService.loadAllJson().map(path -> path.getFileName().toString()).collect(Collectors.toList());
		model.addAttribute("flights", flights);
		return "main";
	}

	@ResponseBody
	@RequestMapping(value = "/flight-data.json", method = RequestMethod.GET)
	public String flightData(@RequestParam("flight") String flight) throws IOException {
		Path path = this.storageService.jsonPath(flight);
		byte[] data = Files.readAllBytes(path);
		return new String(data,  "utf-8").toString();
	}

}
