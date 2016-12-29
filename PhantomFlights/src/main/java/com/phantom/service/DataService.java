package com.phantom.service;

import java.util.List;

import com.phantom.ingestion.Coordinate;

public interface DataService {
	
	public List<String> getTags();
	
	public List<Coordinate> getFlightCoordinates(String flight);

}
