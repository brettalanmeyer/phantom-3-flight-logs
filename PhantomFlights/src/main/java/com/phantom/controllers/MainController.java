package com.phantom.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.phantom.ingestion.Coordinate;
import com.phantom.service.DataService;

@Controller
public class MainController {
	
	@Autowired
	private DataService dataService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
		List<String> tags = this.dataService.getTags();
		model.addAttribute("tags", tags);
		return "main";
	}
	
	@ResponseBody
	@RequestMapping(value = "/data.json", method = RequestMethod.GET)
	public List<Coordinate> data(@RequestParam("flight") String flight) {
		return this.dataService.getFlightCoordinates(flight);
	}
	
}
