package com.phantom.ingestion;

import java.util.Arrays;
import java.util.List;

public class LogEntry {
	
	private Integer tick;
	private Double offsetTime;
	private Integer flightTime;
	private Double longitude;
	private Double latitude;
	private Integer numSats;
	private Integer gpsHealth;
	private Double gpsAltitude;
	private Double baroAlt;
	private Double vpsHeight;
	private Double relativeHeight;
	private Double accelX;
	private Double accelY;
	private Double accelZ;
	private Double accel;
	private Double gyroX;
	private Double gyroY;
	private Double gyroZ;
	private Double gyro;
	private Double errorX;
	private Double errorY;
	private Double errorZ;
	private Double error;
	private Integer magX;
	private Integer magY;
	private Integer magZ;
	private Double magMod;
	private Double velN;
	private Double velE;
	private Double velD;
	private Double vel;
	private Double velH;
	private Double velGPSvelH;
	private Double quatW;
	private Double quatX;
	private Double quatY;
	private Double quatZ;
	private Double roll;
	private Double pitch;
	private Double yaw;
	private Double yaw360;
	private Double totalGyroZ;
	private Double magYaw;
	private Double thrustAngle;
	private Double homePointLongitude;
	private Double homePointLatitude;
	private Double homePointAltitude;
	private Double geoMagDeclination;
	private Double geoMagInclination;
	private Double distancHP;
	private Double distanceTravelled;
	private Double directionOfTravel;
	private Double directionOfTravelTrue;
	private Integer imuTemp;
	private Integer flyCState;
	private String flyCStateString;
	private Integer nonGPSCause;
	private String nonGPSCauseString;
	private Integer dwFlyCState;
	private Boolean connectedToRC;
	private Double current;
	private Double volt1;
	private Double volt2;
	private Double volt3;
	private Double volt4;
	private Double volt5;
	private Double volt6;
	private Double totalVolts;
	private Double voltSpread;
	private Double watts;
	private Double batteryTemp;
	private Double ratedCapacity;
	private Double remaingCapacity;
	private Integer percentageCapacity;
	private Integer usefulTime;
	private Integer percentageVolts;
	private Integer batteryCycleCount;
	private Integer batteryLifePercentage;
	private String batteryBarCode;
	private Double minCurrent;
	private Double maxCurrent;
	private Double avgCurrent;
	private Double minVolts;
	private Double maxVolts;
	private Double avgVolts;
	private Double minWatts;
	private Double maxWatts;
	private Double avgWatts;
	private Double gimbalRoll;
	private Double gimbalPitch;
	private Double gimbalYaw;
	private Double gimbalXRoll;
	private Double gimbalXPitch;
	private Double gimbalXYaw;
	private Integer motorCmndRFront;
	private Integer motorCmndLFront;
	private Integer motorCmndLBack;
	private Integer motorCmndRBack;
	private Double motorSpeedRFront;
	private Double motorSpeedLFront;
	private Double motorSpeedLBack;
	private Double motorSpeedRBack;
	private Double motorLoadRFront;
	private Double motorLoadLFront;
	private Double motorLoadLBack;
	private Double motorLoadRBack;
	private Integer controlAileron;
	private Integer controlElevator;
	private Integer controlThrottle;
	private Integer controlRudder;
	private Integer controlModeSwitch;
	private Double tabletLongitude;
	private Double tabletLatitude;
	
	public List<? extends Object> toArray() {
		return Arrays.asList(
			this.tick,
			this.offsetTime,
			this.flightTime,
			this.longitude,
			this.latitude,
			this.numSats,
			this.gpsHealth,
			this.gpsAltitude,
			this.baroAlt,
			this.vpsHeight,
			this.relativeHeight,
			this.accelX,
			this.accelY,
			this.accelZ,
			this.accel,
			this.gyroX,
			this.gyroY,
			this.gyroZ,
			this.gyro,
			this.errorX,
			this.errorY,
			this.errorZ,
			this.error,
			this.magX,
			this.magY,
			this.magZ,
			this.magMod,
			this.velN,
			this.velE,
			this.velD,
			this.vel,
			this.velH,
			this.velGPSvelH,
			this.quatW,
			this.quatX,
			this.quatY,
			this.quatZ,
			this.roll,
			this.pitch,
			this.yaw,
			this.yaw360,
			this.totalGyroZ,
			this.magYaw,
			this.thrustAngle,
			this.homePointLongitude,
			this.homePointLatitude,
			this.homePointAltitude,
			this.geoMagDeclination,
			this.geoMagInclination,
			this.distancHP,
			this.distanceTravelled,
			this.directionOfTravel,
			this.directionOfTravelTrue,
			this.imuTemp,
			this.flyCState,
			this.flyCStateString,
			this.nonGPSCause,
			this.nonGPSCauseString,
			this.dwFlyCState,
			this.connectedToRC,
			this.current,
			this.volt1,
			this.volt2,
			this.volt3,
			this.volt4,
			this.volt5,
			this.volt6,
			this.totalVolts,
			this.voltSpread,
			this.watts,
			this.batteryTemp,
			this.ratedCapacity,
			this.remaingCapacity,
			this.percentageCapacity,
			this.usefulTime,
			this.percentageVolts,
			this.batteryCycleCount,
			this.batteryLifePercentage,
			this.batteryBarCode,
			this.minCurrent,
			this.maxCurrent,
			this.avgCurrent,
			this.minVolts,
			this.maxVolts,
			this.avgVolts,
			this.minWatts,
			this.maxWatts,
			this.avgWatts,
			this.gimbalRoll,
			this.gimbalPitch,
			this.gimbalYaw,
			this.gimbalXRoll,
			this.gimbalXPitch,
			this.gimbalXYaw,
			this.motorCmndRFront,
			this.motorCmndLFront,
			this.motorCmndLBack,
			this.motorCmndRBack,
			this.motorSpeedRFront,
			this.motorSpeedLFront,
			this.motorSpeedLBack,
			this.motorSpeedRBack,
			this.motorLoadRFront,
			this.motorLoadLFront,
			this.motorLoadLBack,
			this.motorLoadRBack,
			this.controlAileron,
			this.controlElevator,
			this.controlThrottle,
			this.controlRudder,
			this.controlModeSwitch,
			this.tabletLongitude,
			this.tabletLatitude
		);
	}
	
	public List<String> getColumns() {
		return Arrays.asList(
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
	}
	
	public Integer getTick() {
		return tick;
	}
	
	public void setTick(Integer tick) {
		this.tick = tick;
	}
	
	public Double getOffsetTime() {
		return offsetTime;
	}
	
	public void setOffsetTime(Double offsetTime) {
		this.offsetTime = offsetTime;
	}
	
	public Integer getFlightTime() {
		return flightTime;
	}
	
	public void setFlightTime(Integer flightTime) {
		this.flightTime = flightTime;
	}
	
	public Double getLongitude() {
		return longitude;
	}
	
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	
	public Double getLatitude() {
		return latitude;
	}
	
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	
	public Integer getNumSats() {
		return numSats;
	}
	
	public void setNumSats(Integer numSats) {
		this.numSats = numSats;
	}
	
	public Integer getGpsHealth() {
		return gpsHealth;
	}
	
	public void setGpsHealth(Integer gpsHealth) {
		this.gpsHealth = gpsHealth;
	}
	
	public Double getGpsAltitude() {
		return gpsAltitude;
	}
	
	public void setGpsAltitude(Double gpsAltitude) {
		this.gpsAltitude = gpsAltitude;
	}
	
	public Double getBaroAlt() {
		return baroAlt;
	}
	
	public void setBaroAlt(Double baroAlt) {
		this.baroAlt = baroAlt;
	}
	
	public Double getVpsHeight() {
		return vpsHeight;
	}
	
	public void setVpsHeight(Double vpsHeight) {
		this.vpsHeight = vpsHeight;
	}
	
	public Double getRelativeHeight() {
		return relativeHeight;
	}
	
	public void setRelativeHeight(Double relativeHeight) {
		this.relativeHeight = relativeHeight;
	}
	
	public Double getAccelX() {
		return accelX;
	}
	
	public void setAccelX(Double accelX) {
		this.accelX = accelX;
	}
	
	public Double getAccelY() {
		return accelY;
	}
	
	public void setAccelY(Double accelY) {
		this.accelY = accelY;
	}
	
	public Double getAccelZ() {
		return accelZ;
	}
	
	public void setAccelZ(Double accelZ) {
		this.accelZ = accelZ;
	}
	
	public Double getAccel() {
		return accel;
	}
	
	public void setAccel(Double accel) {
		this.accel = accel;
	}
	
	public Double getGyroX() {
		return gyroX;
	}
	
	public void setGyroX(Double gyroX) {
		this.gyroX = gyroX;
	}
	
	public Double getGyroY() {
		return gyroY;
	}
	
	public void setGyroY(Double gyroY) {
		this.gyroY = gyroY;
	}
	
	public Double getGyroZ() {
		return gyroZ;
	}
	
	public void setGyroZ(Double gyroZ) {
		this.gyroZ = gyroZ;
	}
	
	public Double getGyro() {
		return gyro;
	}
	
	public void setGyro(Double gyro) {
		this.gyro = gyro;
	}
	
	public Double getErrorX() {
		return errorX;
	}
	
	public void setErrorX(Double errorX) {
		this.errorX = errorX;
	}
	
	public Double getErrorY() {
		return errorY;
	}
	
	public void setErrorY(Double errorY) {
		this.errorY = errorY;
	}
	
	public Double getErrorZ() {
		return errorZ;
	}
	
	public void setErrorZ(Double errorZ) {
		this.errorZ = errorZ;
	}
	
	public Double getError() {
		return error;
	}
	
	public void setError(Double error) {
		this.error = error;
	}
	
	public Integer getMagX() {
		return magX;
	}
	
	public void setMagX(Integer magX) {
		this.magX = magX;
	}
	
	public Integer getMagY() {
		return magY;
	}
	
	public void setMagY(Integer magY) {
		this.magY = magY;
	}
	
	public Integer getMagZ() {
		return magZ;
	}
	
	public void setMagZ(Integer magZ) {
		this.magZ = magZ;
	}
	
	public Double getMagMod() {
		return magMod;
	}
	
	public void setMagMod(Double magMod) {
		this.magMod = magMod;
	}
	
	public Double getVelN() {
		return velN;
	}
	
	public void setVelN(Double velN) {
		this.velN = velN;
	}
	
	public Double getVelE() {
		return velE;
	}
	
	public void setVelE(Double velE) {
		this.velE = velE;
	}
	
	public Double getVelD() {
		return velD;
	}
	
	public void setVelD(Double velD) {
		this.velD = velD;
	}
	
	public Double getVel() {
		return vel;
	}
	
	public void setVel(Double vel) {
		this.vel = vel;
	}
	
	public Double getVelH() {
		return velH;
	}
	
	public void setVelH(Double velH) {
		this.velH = velH;
	}
	
	public Double getVelGPSvelH() {
		return velGPSvelH;
	}
	
	public void setVelGPSvelH(Double velGPSvelH) {
		this.velGPSvelH = velGPSvelH;
	}
	
	public Double getQuatW() {
		return quatW;
	}
	
	public void setQuatW(Double quatW) {
		this.quatW = quatW;
	}
	
	public Double getQuatX() {
		return quatX;
	}
	
	public void setQuatX(Double quatX) {
		this.quatX = quatX;
	}
	
	public Double getQuatY() {
		return quatY;
	}
	
	public void setQuatY(Double quatY) {
		this.quatY = quatY;
	}
	
	public Double getQuatZ() {
		return quatZ;
	}
	
	public void setQuatZ(Double quatZ) {
		this.quatZ = quatZ;
	}
	
	public Double getRoll() {
		return roll;
	}
	
	public void setRoll(Double roll) {
		this.roll = roll;
	}
	
	public Double getPitch() {
		return pitch;
	}
	
	public void setPitch(Double pitch) {
		this.pitch = pitch;
	}
	
	public Double getYaw() {
		return yaw;
	}
	
	public void setYaw(Double yaw) {
		this.yaw = yaw;
	}
	
	public Double getYaw360() {
		return yaw360;
	}
	
	public void setYaw360(Double yaw360) {
		this.yaw360 = yaw360;
	}
	
	public Double getTotalGyroZ() {
		return totalGyroZ;
	}
	
	public void setTotalGyroZ(Double totalGyroZ) {
		this.totalGyroZ = totalGyroZ;
	}
	
	public Double getMagYaw() {
		return magYaw;
	}
	
	public void setMagYaw(Double magYaw) {
		this.magYaw = magYaw;
	}
	
	public Double getThrustAngle() {
		return thrustAngle;
	}
	
	public void setThrustAngle(Double thrustAngle) {
		this.thrustAngle = thrustAngle;
	}
	
	public Double getHomePointLongitude() {
		return homePointLongitude;
	}
	
	public void setHomePointLongitude(Double homePointLongitude) {
		this.homePointLongitude = homePointLongitude;
	}
	
	public Double getHomePointLatitude() {
		return homePointLatitude;
	}
	
	public void setHomePointLatitude(Double homePointLatitude) {
		this.homePointLatitude = homePointLatitude;
	}
	
	public Double getHomePointAltitude() {
		return homePointAltitude;
	}
	
	public void setHomePointAltitude(Double homePointAltitude) {
		this.homePointAltitude = homePointAltitude;
	}
	
	public Double getGeoMagDeclination() {
		return geoMagDeclination;
	}
	
	public void setGeoMagDeclination(Double geoMagDeclination) {
		this.geoMagDeclination = geoMagDeclination;
	}
	
	public Double getGeoMagInclination() {
		return geoMagInclination;
	}
	
	public void setGeoMagInclination(Double geoMagInclination) {
		this.geoMagInclination = geoMagInclination;
	}
	
	public Double getDistancHP() {
		return distancHP;
	}
	
	public void setDistancHP(Double distancHP) {
		this.distancHP = distancHP;
	}
	
	public Double getDistanceTravelled() {
		return distanceTravelled;
	}
	
	public void setDistanceTravelled(Double distanceTravelled) {
		this.distanceTravelled = distanceTravelled;
	}
	
	public Double getDirectionOfTravel() {
		return directionOfTravel;
	}
	
	public void setDirectionOfTravel(Double directionOfTravel) {
		this.directionOfTravel = directionOfTravel;
	}
	
	public Double getDirectionOfTravelTrue() {
		return directionOfTravelTrue;
	}
	
	public void setDirectionOfTravelTrue(Double directionOfTravelTrue) {
		this.directionOfTravelTrue = directionOfTravelTrue;
	}
	
	public Integer getIMUTemp() {
		return imuTemp;
	}
	
	public void setIMUTemp(Integer imuTemp) {
		this.imuTemp = imuTemp;
	}
	
	public Integer getFlyCState() {
		return flyCState;
	}
	
	public void setFlyCState(Integer flyCState) {
		this.flyCState = flyCState;
	}
	
	public String getFlyCStateString() {
		return flyCStateString;
	}
	
	public void setFlyCStateString(String flyCStateString) {
		this.flyCStateString = flyCStateString;
	}
	
	public Integer getNonGPSCause() {
		return nonGPSCause;
	}
	
	public void setNonGPSCause(Integer nonGPSCause) {
		this.nonGPSCause = nonGPSCause;
	}
	
	public String getNonGPSCauseString() {
		return nonGPSCauseString;
	}
	
	public void setNonGPSCauseString(String nonGPSCauseString) {
		this.nonGPSCauseString = nonGPSCauseString;
	}
	
	public Integer getDWFlyCState() {
		return dwFlyCState;
	}
	
	public void setDWFlyCState(Integer dwFlyCState) {
		this.dwFlyCState = dwFlyCState;
	}
	
	public Boolean getConnectedToRC() {
		return connectedToRC;
	}
	
	public void setConnectedToRC(Boolean connectedToRC) {
		this.connectedToRC = connectedToRC;
	}
	
	public Double getCurrent() {
		return current;
	}
	
	public void setCurrent(Double current) {
		this.current = current;
	}
	
	public Double getVolt1() {
		return volt1;
	}
	
	public void setVolt1(Double volt1) {
		this.volt1 = volt1;
	}
	
	public Double getVolt2() {
		return volt2;
	}
	
	public void setVolt2(Double volt2) {
		this.volt2 = volt2;
	}
	
	public Double getVolt3() {
		return volt3;
	}
	
	public void setVolt3(Double volt3) {
		this.volt3 = volt3;
	}
	
	public Double getVolt4() {
		return volt4;
	}
	
	public void setVolt4(Double volt4) {
		this.volt4 = volt4;
	}
	
	public Double getVolt5() {
		return volt5;
	}
	
	public void setVolt5(Double volt5) {
		this.volt5 = volt5;
	}
	
	public Double getVolt6() {
		return volt6;
	}
	
	public void setVolt6(Double volt6) {
		this.volt6 = volt6;
	}
	
	public Double getTotalVolts() {
		return totalVolts;
	}
	
	public void setTotalVolts(Double totalVolts) {
		this.totalVolts = totalVolts;
	}
	
	public Double getVoltSpread() {
		return voltSpread;
	}
	
	public void setVoltSpread(Double voltSpread) {
		this.voltSpread = voltSpread;
	}
	
	public Double getWatts() {
		return watts;
	}
	
	public void setWatts(Double watts) {
		this.watts = watts;
	}
	
	public Double getBatteryTemp() {
		return batteryTemp;
	}
	
	public void setBatteryTemp(Double batteryTemp) {
		this.batteryTemp = batteryTemp;
	}
	
	public Double getRatedCapacity() {
		return ratedCapacity;
	}
	
	public void setRatedCapacity(Double ratedCapacity) {
		this.ratedCapacity = ratedCapacity;
	}
	
	public Double getRemaingCapacity() {
		return remaingCapacity;
	}
	
	public void setRemaingCapacity(Double remaingCapacity) {
		this.remaingCapacity = remaingCapacity;
	}
	
	public Integer getPercentageCapacity() {
		return percentageCapacity;
	}
	
	public void setPercentageCapacity(Integer percentageCapacity) {
		this.percentageCapacity = percentageCapacity;
	}
	
	public Integer getUsefulTime() {
		return usefulTime;
	}
	
	public void setUsefulTime(Integer usefulTime) {
		this.usefulTime = usefulTime;
	}
	
	public Integer getPercentageVolts() {
		return percentageVolts;
	}
	
	public void setPercentageVolts(Integer percentageVolts) {
		this.percentageVolts = percentageVolts;
	}
	
	public Integer getBatteryCycleCount() {
		return batteryCycleCount;
	}
	
	public void setBatteryCycleCount(Integer batteryCycleCount) {
		this.batteryCycleCount = batteryCycleCount;
	}
	
	public Integer getBatteryLifePercentage() {
		return batteryLifePercentage;
	}
	
	public void setBatteryLifePercentage(Integer batteryLifePercentage) {
		this.batteryLifePercentage = batteryLifePercentage;
	}
	
	public String getBatteryBarCode() {
		return batteryBarCode;
	}
	
	public void setBatteryBarCode(String batteryBarCode) {
		this.batteryBarCode = batteryBarCode;
	}
	
	public Double getMinCurrent() {
		return minCurrent;
	}
	
	public void setMinCurrent(Double minCurrent) {
		this.minCurrent = minCurrent;
	}
	
	public Double getMaxCurrent() {
		return maxCurrent;
	}
	
	public void setMaxCurrent(Double maxCurrent) {
		this.maxCurrent = maxCurrent;
	}
	
	public Double getAvgCurrent() {
		return avgCurrent;
	}
	
	public void setAvgCurrent(Double avgCurrent) {
		this.avgCurrent = avgCurrent;
	}
	
	public Double getMinVolts() {
		return minVolts;
	}
	
	public void setMinVolts(Double minVolts) {
		this.minVolts = minVolts;
	}
	
	public Double getMaxVolts() {
		return maxVolts;
	}
	
	public void setMaxVolts(Double maxVolts) {
		this.maxVolts = maxVolts;
	}
	
	public Double getAvgVolts() {
		return avgVolts;
	}
	
	public void setAvgVolts(Double avgVolts) {
		this.avgVolts = avgVolts;
	}
	
	public Double getMinWatts() {
		return minWatts;
	}
	
	public void setMinWatts(Double minWatts) {
		this.minWatts = minWatts;
	}
	
	public Double getMaxWatts() {
		return maxWatts;
	}
	
	public void setMaxWatts(Double maxWatts) {
		this.maxWatts = maxWatts;
	}
	
	public Double getAvgWatts() {
		return avgWatts;
	}
	
	public void setAvgWatts(Double avgWatts) {
		this.avgWatts = avgWatts;
	}
	
	public Double getGimbalRoll() {
		return gimbalRoll;
	}
	
	public void setGimbalRoll(Double gimbalRoll) {
		this.gimbalRoll = gimbalRoll;
	}
	
	public Double getGimbalPitch() {
		return gimbalPitch;
	}
	
	public void setGimbalPitch(Double gimbalPitch) {
		this.gimbalPitch = gimbalPitch;
	}
	
	public Double getGimbalYaw() {
		return gimbalYaw;
	}
	
	public void setGimbalYaw(Double gimbalYaw) {
		this.gimbalYaw = gimbalYaw;
	}
	
	public Double getGimbalXRoll() {
		return gimbalXRoll;
	}
	
	public void setGimbalXRoll(Double gimbalXRoll) {
		this.gimbalXRoll = gimbalXRoll;
	}
	
	public Double getGimbalXPitch() {
		return gimbalXPitch;
	}
	
	public void setGimbalXPitch(Double gimbalXPitch) {
		this.gimbalXPitch = gimbalXPitch;
	}
	
	public Double getGimbalXYaw() {
		return gimbalXYaw;
	}
	
	public void setGimbalXYaw(Double gimbalXYaw) {
		this.gimbalXYaw = gimbalXYaw;
	}
	
	public Integer getMotorCmndRFront() {
		return motorCmndRFront;
	}
	
	public void setMotorCmndRFront(Integer motorCmndRFront) {
		this.motorCmndRFront = motorCmndRFront;
	}
	
	public Integer getMotorCmndLFront() {
		return motorCmndLFront;
	}
	
	public void setMotorCmndLFront(Integer motorCmndLFront) {
		this.motorCmndLFront = motorCmndLFront;
	}
	
	public Integer getMotorCmndLBack() {
		return motorCmndLBack;
	}
	
	public void setMotorCmndLBack(Integer motorCmndLBack) {
		this.motorCmndLBack = motorCmndLBack;
	}
	
	public Integer getMotorCmndRBack() {
		return motorCmndRBack;
	}
	
	public void setMotorCmndRBack(Integer motorCmndRBack) {
		this.motorCmndRBack = motorCmndRBack;
	}
	
	public Double getMotorSpeedRFront() {
		return motorSpeedRFront;
	}
	
	public void setMotorSpeedRFront(Double motorSpeedRFront) {
		this.motorSpeedRFront = motorSpeedRFront;
	}
	
	public Double getMotorSpeedLFront() {
		return motorSpeedLFront;
	}
	
	public void setMotorSpeedLFront(Double motorSpeedLFront) {
		this.motorSpeedLFront = motorSpeedLFront;
	}
	
	public Double getMotorSpeedLBack() {
		return motorSpeedLBack;
	}
	
	public void setMotorSpeedLBack(Double motorSpeedLBack) {
		this.motorSpeedLBack = motorSpeedLBack;
	}
	
	public Double getMotorSpeedRBack() {
		return motorSpeedRBack;
	}
	
	public void setMotorSpeedRBack(Double motorSpeedRBack) {
		this.motorSpeedRBack = motorSpeedRBack;
	}
	
	public Double getMotorLoadRFront() {
		return motorLoadRFront;
	}
	
	public void setMotorLoadRFront(Double motorLoadRFront) {
		this.motorLoadRFront = motorLoadRFront;
	}
	
	public Double getMotorLoadLFront() {
		return motorLoadLFront;
	}
	
	public void setMotorLoadLFront(Double motorLoadLFront) {
		this.motorLoadLFront = motorLoadLFront;
	}
	
	public Double getMotorLoadLBack() {
		return motorLoadLBack;
	}
	
	public void setMotorLoadLBack(Double motorLoadLBack) {
		this.motorLoadLBack = motorLoadLBack;
	}
	
	public Double getMotorLoadRBack() {
		return motorLoadRBack;
	}
	
	public void setMotorLoadRBack(Double motorLoadRBack) {
		this.motorLoadRBack = motorLoadRBack;
	}
	
	public Integer getControlAileron() {
		return controlAileron;
	}
	
	public void setControlAileron(Integer controlAileron) {
		this.controlAileron = controlAileron;
	}
	
	public Integer getControlElevator() {
		return controlElevator;
	}
	
	public void setControlElevator(Integer controlElevator) {
		this.controlElevator = controlElevator;
	}
	
	public Integer getControlThrottle() {
		return controlThrottle;
	}
	
	public void setControlThrottle(Integer controlThrottle) {
		this.controlThrottle = controlThrottle;
	}
	
	public Integer getControlRudder() {
		return controlRudder;
	}
	
	public void setControlRudder(Integer controlRudder) {
		this.controlRudder = controlRudder;
	}
	
	public Integer getControlModeSwitch() {
		return controlModeSwitch;
	}
	
	public void setControlModeSwitch(Integer controlModeSwitch) {
		this.controlModeSwitch = controlModeSwitch;
	}
	
	public Double getTabletLongitude() {
		return tabletLongitude;
	}
	
	public void setTabletLongitude(Double tabletLongitude) {
		this.tabletLongitude = tabletLongitude;
	}
	
	public Double getTabletLatitude() {
		return tabletLatitude;
	}
	
	public void setTabletLatitude(Double tabletLatitude) {
		this.tabletLatitude = tabletLatitude;
	}
	 
}
