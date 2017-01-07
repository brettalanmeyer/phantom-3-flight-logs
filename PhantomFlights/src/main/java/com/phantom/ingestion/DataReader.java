package com.phantom.ingestion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataReader {
	
	private final static int INTERVAL = 10;
	
	public static String convertCsvToJson(Path csv) {
		
		String absolutePath = csv.toAbsolutePath().toString();
		FlightData flightData = new FlightData();
		String line = "";
		String delimiter = ",";
		String serializedData = null;
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(absolutePath))){
			
			boolean first = true;
			int i = 0;
			
			while ((line = bufferedReader.readLine()) != null) {
				
				if(first){
					first = false;
					continue;
				}
				
				i++;
				
				if(i % INTERVAL != 0){
					continue;
				}
				
				String[] row = line.split(delimiter);
				LogEntry logEntry = Mapper.rowToLogEntity(row);
				flightData.appendLogEntry(logEntry);
            }
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			serializedData = new ObjectMapper().writeValueAsString(flightData);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	
		return serializedData;
	}

}
