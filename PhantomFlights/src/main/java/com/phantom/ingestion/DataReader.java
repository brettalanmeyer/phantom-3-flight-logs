package com.phantom.ingestion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class DataReader {
	
	public static List<LogEntry> readLogData(Path path) {
		
		String absolutePath = path.toAbsolutePath().toString();
		List<LogEntry> data = new ArrayList<>();
		String line = "";
		String delimiter = ",";
			
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(absolutePath))){
			
			while ((line = bufferedReader.readLine()) != null) {
				String[] row = line.split(delimiter);
				LogEntry logEntry = Mapper.rowToLogEntity(row);
				data.add(logEntry);
            }
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return data;
	}

}
