package com.phantom.influxdb;

import java.util.ArrayList;
import java.util.List;

import org.influxdb.InfluxDB;
import org.influxdb.InfluxDB.ConsistencyLevel;
import org.influxdb.InfluxDBFactory;
import org.influxdb.dto.BatchPoints;
import org.influxdb.dto.Query;
import org.influxdb.dto.QueryResult;
import org.influxdb.dto.QueryResult.Result;
import org.influxdb.dto.QueryResult.Series;

public class  PhantomInfluxDB {
	
	private final static String DATABASE = "phantom_flight_logs";
	private final static String HOST = "http://localhost:8086";
	private final static String USERNAME = "root";
	private final static String PASSWORD = "root";
	
	public static InfluxDB connect(){
		InfluxDB influxDB = InfluxDBFactory.connect(HOST, USERNAME, PASSWORD);
	
		if(!influxDB.describeDatabases().contains(DATABASE)){
			influxDB.createDatabase(DATABASE);
		}
		
		return influxDB;
	}
	
	public static BatchPoints buildBatchPoints() {
		return BatchPoints.database(DATABASE).retentionPolicy("autogen").consistency(ConsistencyLevel.ALL).build();
	}
	
	public static Query query(String command) {
		return new Query(command, DATABASE);
	}
	
	public static List<List<Object>> resultsToList(QueryResult queryResult) {
		List<Result> results = queryResult.getResults();
		Result result = results.get(0);
		
		List<Series> serieses = result.getSeries();
	
		if(serieses == null || serieses.size() == 0){
			return new ArrayList<>();
		}
		
		Series series = serieses.get(0);
		
		return series.getValues();
	}

}
