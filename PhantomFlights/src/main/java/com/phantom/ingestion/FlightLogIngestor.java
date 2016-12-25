package com.phantom.ingestion;

import java.util.concurrent.TimeUnit;

import org.influxdb.InfluxDB;
import org.influxdb.InfluxDB.ConsistencyLevel;
import org.influxdb.InfluxDBFactory;
import org.influxdb.dto.BatchPoints;
import org.influxdb.dto.Point;
import org.influxdb.dto.Point.Builder;

public class FlightLogIngestor {
	
	private final String database = "phantom_flight_logs";
	private final String host = "http://localhost:8086";
	private final String username = "root";
	private final String password = "root";
	private final String measurement = "logs";
	
	private BatchPoints batchPoints;
	private InfluxDB influxDB;
	
	private boolean isOpen = false;
	
	public FlightLogIngestor() {
		if(!this.isOpen){
			this.open();
		}
	}
	
	private void open() {
		if(this.isOpen) {
			return;
		}
		
		this.influxDB = InfluxDBFactory.connect(this.host, this.username, this.password);
		
		if(!this.influxDB.describeDatabases().contains(this.database)){
			this.influxDB.createDatabase(this.database);
		}
		
		this.setupBatch();
		this.isOpen = true;
	}
	
	private void setupBatch(){
		this.influxDB.enableBatch(2000, 100, TimeUnit.NANOSECONDS);
		this.batchPoints = this.buildBatchPoints();
	}
	
	private BatchPoints buildBatchPoints() {
		return BatchPoints.database(database).retentionPolicy("autogen").consistency(ConsistencyLevel.ALL).build();
	}
	
	public void logEntry(LogEntry logEntry) {
		Builder builder = Point.measurement(this.measurement).time(System.nanoTime(), TimeUnit.NANOSECONDS);
		Mapper.logEntityToPoint(builder, logEntry);
		Point point = builder.build();
		this.batchPoints.point(point);
	}
	
	public void close() {
		this.influxDB.write(this.batchPoints);
		this.influxDB.close();
		this.isOpen = false;
	}

}
