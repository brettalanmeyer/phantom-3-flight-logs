package com.phantom.converters;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Path;

import com.phantom.converters.exceptions.FileEndException;
import com.phantom.converters.exceptions.NotDatFileException;

public class CLIDatCon {
	
	public static void convert(Path dat, Path csv) {
		String datFileName = dat.toAbsolutePath().toString();
		String csvFileName = csv.toAbsolutePath().toString();
		
		File csvFile = new File(csvFileName);
		DatFile datFile;
		long timeOffset = 0;
		
		try {
			datFile = new DatFile(datFileName);
			ConvertDat convertDat = new ConvertDat(datFile);
			datFile.findMarkers();
			
			if (datFile.motorStartTick != 0) {
				timeOffset = datFile.motorStartTick;
			}
			
			if (datFile.flightStartTick != -1) {
				timeOffset = datFile.flightStartTick;
			}
			
			convertDat.timeOffset = timeOffset;
			datFile.reset();
			convertDat.createRecords();
			convertDat.sampleRate = 30;
			PrintStream csvPS = new PrintStream(csvFile);
			convertDat.csvPS = csvPS;
			AnalyzeDatResults results = convertDat.analyze(true);
			csvPS.close();
			System.out.println("OK");
			
		} catch (IOException | NotDatFileException e) {
			e.printStackTrace();
		} catch (FileEndException e) {
			e.printStackTrace();
		}
	}

}
