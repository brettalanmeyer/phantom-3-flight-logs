package com.phantom.ingestion;

import java.util.concurrent.TimeUnit;

import org.influxdb.InfluxDB;
import org.influxdb.dto.BatchPoints;
import org.influxdb.dto.Point;
import org.influxdb.dto.Point.Builder;

import com.phantom.influxdb.PhantomInfluxDB;

public class FlightLogIngestor {
	
	private final String measurement = "logs";
	
	private BatchPoints batchPoints;
	private InfluxDB influxDB;
	private String tag;
	
	public FlightLogIngestor(String tag) {
		this.tag = tag;
		this.open();
	}
	
	private void open() {
		this.influxDB = PhantomInfluxDB.connect();
		this.setupBatch();
	}
	
	private void setupBatch(){
		this.influxDB.enableBatch(2000, 100, TimeUnit.NANOSECONDS);
		this.batchPoints = PhantomInfluxDB.buildBatchPoints();
	}
	
	public void logEntry(LogEntry logEntry) {
		Builder builder = Point.measurement(this.measurement).tag("flight", this.tag).time(System.nanoTime(), TimeUnit.NANOSECONDS);
		Mapper.logEntityToPoint(builder, logEntry);
		Point point = builder.build();
		this.batchPoints.point(point);
	}
	
	public void close() {
		this.influxDB.write(this.batchPoints);
		this.influxDB.close();
	}

}
