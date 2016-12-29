package com.phantom.ingestion;

public class Coordinate {
	
	private Double lat;
	private Double lng;
	private String test = "";
	
	public Coordinate(Double lat, Double lng) {
		this.lat = lat;
		this.lng = lng;
	}
	
	public Coordinate(String lat, String lng) {
		this.lat = Double.valueOf(lat);
		this.lng = Double.valueOf(lng);
	}
	
	public Double getLat() {
		return this.lat;
	}
	
	public void setLat(Double lat) {
		this.lat = lat;
	}
	
	public Double getLng() {
		return this.lng;
	}
	
	public void setLng(Double lng) {
		this.lng = lng;
	}
	
	public String getTest() {
		return this.test;
	}

}
