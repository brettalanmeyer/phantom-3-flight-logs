package com.phantom.ingestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlightData {
	
	private List<List<? extends Object>> values = new ArrayList<>();
	
	private final List<String> columns = Arrays.asList(
		"tick",
		"offsetTime",
		"flightTime",
		"longitude",
		"latitude",
		"numSats",
		"gpsHealth",
		"gpsAltitude",
		"baroAlt",
		"vpsHeight",
		"relativeHeight",
		"accelX",
		"accelY",
		"accelZ",
		"accel",
		"gyroX",
		"gyroY",
		"gyroZ",
		"gyro",
		"errorX",
		"errorY",
		"errorZ",
		"error",
		"magX",
		"magY",
		"magZ",
		"magMod",
		"velN",
		"velE",
		"velD",
		"vel",
		"velH",
		"velGPSvelH",
		"quatW",
		"quatX",
		"quatY",
		"quatZ",
		"roll",
		"pitch",
		"yaw",
		"yaw360",
		"totalGyroZ",
		"magYaw",
		"thrustAngle",
		"homePointLongitude",
		"homePointLatitude",
		"homePointAltitude",
		"geoMagDeclination",
		"geoMagInclination",
		"distancHP",
		"distanceTravelled",
		"directionOfTravel",
		"directionOfTravelTrue",
		"imuTemp",
		"flyCState",
		"flyCStateString",
		"nonGPSCause",
		"nonGPSCauseString",
		"dwFlyCState",
		"connectedToRC",
		"current",
		"volt1",
		"volt2",
		"volt3",
		"volt4",
		"volt5",
		"volt6",
		"totalVolts",
		"voltSpread",
		"watts",
		"batteryTemp",
		"ratedCapacity",
		"remaingCapacity",
		"percentageCapacity",
		"usefulTime",
		"percentageVolts",
		"batteryCycleCount",
		"batteryLifePercentage",
		"batteryBarCode",
		"minCurrent",
		"maxCurrent",
		"avgCurrent",
		"minVolts",
		"maxVolts",
		"avgVolts",
		"minWatts",
		"maxWatts",
		"avgWatts",
		"gimbalRoll",
		"gimbalPitch",
		"gimbalYaw",
		"gimbalXRoll",
		"gimbalXPitch",
		"gimbalXYaw",
		"motorCmndRFront",
		"motorCmndLFront",
		"motorCmndLBack",
		"motorCmndRBack",
		"motorSpeedRFront",
		"motorSpeedLFront",
		"motorSpeedLBack",
		"motorSpeedRBack",
		"motorLoadRFront",
		"motorLoadLFront",
		"motorLoadLBack",
		"motorLoadRBack",
		"controlAileron",
		"controlElevator",
		"controlThrottle",
		"controlRudder",
		"controlModeSwitch",
		"tabletLongitude",
		"tabletLatitude"
	);
	
	public List<String> getColumns() {
		return columns;
	}
	
	public List<List<? extends Object>> getValues() {
		return values;
	}
	
	public void appendLogEntry(LogEntry logEntry) {
		this.values.add(logEntry.toArray());
	}
	
}
