package com.phantom.service;

import java.util.List;

import org.influxdb.dto.QueryResult.Series;

import com.phantom.ingestion.Coordinate;

public interface DataService {

	public List<String> getTags();

	public List<Coordinate> getFlightCoordinates(String flight);

	public Series getFlightData(String flight);

}
