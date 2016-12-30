package com.phantom.ingestion;

public class Coordinate {

	private String time;
	private Double lat;
	private Double lng;

	public Coordinate(String time, Double lat, Double lng) {
		this.time = time;
		this.lat = lat;
		this.lng = lng;
	}

	public Coordinate(String time, String lat, String lng) {
		this.time = time;
		this.lat = Double.valueOf(lat);
		this.lng = Double.valueOf(lng);
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
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

}
