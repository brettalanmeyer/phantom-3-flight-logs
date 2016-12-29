package com.phantom.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.influxdb.InfluxDB;
import org.influxdb.dto.Query;
import org.influxdb.dto.QueryResult;
import org.springframework.stereotype.Service;

import com.phantom.influxdb.PhantomInfluxDB;
import com.phantom.ingestion.Coordinate;
import com.phantom.service.DataService;

@Service
public class DataServiceImpl implements DataService {

	@Override
	public List<String> getTags() {
		InfluxDB influxDB = PhantomInfluxDB.connect();
		Query query = PhantomInfluxDB.query("SHOW SERIES");
		QueryResult queryResult = influxDB.query(query);
		influxDB.close();
		
		List<List<Object>> values = PhantomInfluxDB.resultsToList(queryResult);
		
		List<String> tags = new ArrayList<>();
		
		for(List<Object> item : values){
			String row = item.get(0).toString();
			String tag = row.substring(row.indexOf('=') + 1, row.length());
			tags.add(tag);
		}
		
		return tags;
	}

	@Override
	public List<Coordinate> getFlightCoordinates(String flight) {
		InfluxDB influxDB = PhantomInfluxDB.connect();
		Query query = PhantomInfluxDB.query(String.format("SELECT latitude, longitude FROM logs WHERE flight = '%s'", flight));
		QueryResult queryResult = influxDB.query(query);
		influxDB.close();
		
		List<List<Object>> values = PhantomInfluxDB.resultsToList(queryResult);
		List<Coordinate> coords = new ArrayList<>();
		
		for(List<Object> item : values){
			String lat = item.get(1).toString();
			String lng = item.get(2).toString();
			
			if(lat.isEmpty()) continue;
			if(lng.isEmpty()) continue;
			
			coords.add(new Coordinate(lat, lng));
		}
		
		return coords;
	}

}
