package com.phantom.ingestion;

public class LogEntry {
	
	private String tick = "";
	private String offsetTime = "";
	private String flightTime = "";
	private String longitude = "";
	private String latitude = "";
	private String numSats = "";
	private String gpsHealth = "";
	private String gpsAltitude = "";
	private String baroAlt = "";
	private String vpsHeight = "";
	private String relativeHeight = "";
	private String accelX = "";
	private String accelY = "";
	private String accelZ = "";
	private String accel = "";
	private String gyroX = "";
	private String gyroY = "";
	private String gyroZ = "";
	private String gyro = "";
	private String errorX = "";
	private String errorY = "";
	private String errorZ = "";
	private String error = "";
	private String magX = "";
	private String magY = "";
	private String magZ = "";
	private String magMod = "";
	private String velN = "";
	private String velE = "";
	private String velD = "";
	private String vel = "";
	private String velH = "";
	private String velGPSvelH = "";
	private String quatW = "";
	private String quatX = "";
	private String quatY = "";
	private String quatZ = "";
	private String roll = "";
	private String pitch = "";
	private String yaw = "";
	private String yaw360 = "";
	private String totalGyroZ = "";
	private String magYaw = "";
	private String thrustAngle = "";
	private String homePointLongitude = "";
	private String homePointLatitude = "";
	private String homePointAltitude = "";
	private String geoMagDeclination = "";
	private String geoMagInclination = "";
	private String distancHP = "";
	private String distanceTravelled = "";
	private String directionOfTravel = "";
	private String directionOfTravelTrue = "";
	private String imuTemp = "";
	private String flyCState = "";
	private String flyCStateString = "";
	private String nonGPSCause = "";
	private String nonGPSCauseString = "";
	private String dwFlyCState = "";
	private String connectedToRC = "";
	private String current = "";
	private String volt1 = "";
	private String volt2 = "";
	private String volt3 = "";
	private String volt4 = "";
	private String volt5 = "";
	private String volt6 = "";
	private String totalVolts = "";
	private String voltSpread = "";
	private String watts = "";
	private String batteryTemp = "";
	private String ratedCapacity = "";
	private String remaingCapacity = "";
	private String percentageCapacity = "";
	private String usefulTime = "";
	private String percentageVolts = "";
	private String batteryCycleCount = "";
	private String batteryLifePercentage = "";
	private String batteryBarCode = "";
	private String minCurrent = "";
	private String maxCurrent = "";
	private String avgCurrent = "";
	private String minVolts = "";
	private String maxVolts = "";
	private String avgVolts = "";
	private String minWatts = "";
	private String maxWatts = "";
	private String avgWatts = "";
	private String gimbalRoll = "";
	private String gimbalPitch = "";
	private String gimbalYaw = "";
	private String gimbalXRoll = "";
	private String gimbalXPitch = "";
	private String gimbalXYaw = "";
	private String motorCmndRFront = "";
	private String motorCmndLFront = "";
	private String motorCmndLBack = "";
	private String motorCmndRBack = "";
	private String motorSpeedRFront = "";
	private String motorSpeedLFront = "";
	private String motorSpeedLBack = "";
	private String motorSpeedRBack = "";
	private String motorLoadRFront = "";
	private String motorLoadLFront = "";
	private String motorLoadLBack = "";
	private String motorLoadRBack = "";
	private String controlAileron = "";
	private String controlElevator = "";
	private String controlThrottle = "";
	private String controlRudder = "";
	private String controlModeSwitch = "";
	private String tabletLongitude = "";
	private String tabletLatitude = "";
	
	public String getTick() {
		return tick;
	}
	
	public void setTick(String tick) {
		this.tick = tick;
	}
	
	public String getOffsetTime() {
		return offsetTime;
	}
	
	public void setOffsetTime(String offsetTime) {
		this.offsetTime = offsetTime;
	}
	
	public String getFlightTime() {
		return flightTime;
	}
	
	public void setFlightTime(String flightTime) {
		this.flightTime = flightTime;
	}
	
	public String getLongitude() {
		return longitude;
	}
	
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	
	public String getLatitude() {
		return latitude;
	}
	
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	
	public String getNumSats() {
		return numSats;
	}
	
	public void setNumSats(String numSats) {
		this.numSats = numSats;
	}
	
	public String getGpsHealth() {
		return gpsHealth;
	}
	
	public void setGpsHealth(String gpsHealth) {
		this.gpsHealth = gpsHealth;
	}
	
	public String getGpsAltitude() {
		return gpsAltitude;
	}
	
	public void setGpsAltitude(String gpsAltitude) {
		this.gpsAltitude = gpsAltitude;
	}
	
	public String getBaroAlt() {
		return baroAlt;
	}
	
	public void setBaroAlt(String baroAlt) {
		this.baroAlt = baroAlt;
	}
	
	public String getVpsHeight() {
		return vpsHeight;
	}
	
	public void setVpsHeight(String vpsHeight) {
		this.vpsHeight = vpsHeight;
	}
	
	public String getRelativeHeight() {
		return relativeHeight;
	}
	
	public void setRelativeHeight(String relativeHeight) {
		this.relativeHeight = relativeHeight;
	}
	
	public String getAccelX() {
		return accelX;
	}
	
	public void setAccelX(String accelX) {
		this.accelX = accelX;
	}
	
	public String getAccelY() {
		return accelY;
	}
	
	public void setAccelY(String accelY) {
		this.accelY = accelY;
	}
	
	public String getAccelZ() {
		return accelZ;
	}
	
	public void setAccelZ(String accelZ) {
		this.accelZ = accelZ;
	}
	
	public String getAccel() {
		return accel;
	}
	
	public void setAccel(String accel) {
		this.accel = accel;
	}
	
	public String getGyroX() {
		return gyroX;
	}
	
	public void setGyroX(String gyroX) {
		this.gyroX = gyroX;
	}
	
	public String getGyroY() {
		return gyroY;
	}
	
	public void setGyroY(String gyroY) {
		this.gyroY = gyroY;
	}
	
	public String getGyroZ() {
		return gyroZ;
	}
	
	public void setGyroZ(String gyroZ) {
		this.gyroZ = gyroZ;
	}
	
	public String getGyro() {
		return gyro;
	}
	
	public void setGyro(String gyro) {
		this.gyro = gyro;
	}
	
	public String getErrorX() {
		return errorX;
	}
	
	public void setErrorX(String errorX) {
		this.errorX = errorX;
	}
	
	public String getErrorY() {
		return errorY;
	}
	
	public void setErrorY(String errorY) {
		this.errorY = errorY;
	}
	
	public String getErrorZ() {
		return errorZ;
	}
	
	public void setErrorZ(String errorZ) {
		this.errorZ = errorZ;
	}
	
	public String getError() {
		return error;
	}
	
	public void setError(String error) {
		this.error = error;
	}
	
	public String getMagX() {
		return magX;
	}
	
	public void setMagX(String magX) {
		this.magX = magX;
	}
	
	public String getMagY() {
		return magY;
	}
	
	public void setMagY(String magY) {
		this.magY = magY;
	}
	
	public String getMagZ() {
		return magZ;
	}
	
	public void setMagZ(String magZ) {
		this.magZ = magZ;
	}
	
	public String getMagMod() {
		return magMod;
	}
	
	public void setMagMod(String magMod) {
		this.magMod = magMod;
	}
	
	public String getVelN() {
		return velN;
	}
	
	public void setVelN(String velN) {
		this.velN = velN;
	}
	
	public String getVelE() {
		return velE;
	}
	
	public void setVelE(String velE) {
		this.velE = velE;
	}
	
	public String getVelD() {
		return velD;
	}
	
	public void setVelD(String velD) {
		this.velD = velD;
	}
	
	public String getVel() {
		return vel;
	}
	
	public void setVel(String vel) {
		this.vel = vel;
	}
	
	public String getVelH() {
		return velH;
	}
	
	public void setVelH(String velH) {
		this.velH = velH;
	}
	
	public String getVelGPSvelH() {
		return velGPSvelH;
	}
	
	public void setVelGPSvelH(String velGPSvelH) {
		this.velGPSvelH = velGPSvelH;
	}
	
	public String getQuatW() {
		return quatW;
	}
	
	public void setQuatW(String quatW) {
		this.quatW = quatW;
	}
	
	public String getQuatX() {
		return quatX;
	}
	
	public void setQuatX(String quatX) {
		this.quatX = quatX;
	}
	
	public String getQuatY() {
		return quatY;
	}
	
	public void setQuatY(String quatY) {
		this.quatY = quatY;
	}
	
	public String getQuatZ() {
		return quatZ;
	}
	
	public void setQuatZ(String quatZ) {
		this.quatZ = quatZ;
	}
	
	public String getRoll() {
		return roll;
	}
	
	public void setRoll(String roll) {
		this.roll = roll;
	}
	
	public String getPitch() {
		return pitch;
	}
	
	public void setPitch(String pitch) {
		this.pitch = pitch;
	}
	
	public String getYaw() {
		return yaw;
	}
	
	public void setYaw(String yaw) {
		this.yaw = yaw;
	}
	
	public String getYaw360() {
		return yaw360;
	}
	
	public void setYaw360(String yaw360) {
		this.yaw360 = yaw360;
	}
	
	public String getTotalGyroZ() {
		return totalGyroZ;
	}
	
	public void setTotalGyroZ(String totalGyroZ) {
		this.totalGyroZ = totalGyroZ;
	}
	
	public String getMagYaw() {
		return magYaw;
	}
	
	public void setMagYaw(String magYaw) {
		this.magYaw = magYaw;
	}
	
	public String getThrustAngle() {
		return thrustAngle;
	}
	
	public void setThrustAngle(String thrustAngle) {
		this.thrustAngle = thrustAngle;
	}
	
	public String getHomePointLongitude() {
		return homePointLongitude;
	}
	
	public void setHomePointLongitude(String homePointLongitude) {
		this.homePointLongitude = homePointLongitude;
	}
	
	public String getHomePointLatitude() {
		return homePointLatitude;
	}
	
	public void setHomePointLatitude(String homePointLatitude) {
		this.homePointLatitude = homePointLatitude;
	}
	
	public String getHomePointAltitude() {
		return homePointAltitude;
	}
	
	public void setHomePointAltitude(String homePointAltitude) {
		this.homePointAltitude = homePointAltitude;
	}
	
	public String getGeoMagDeclination() {
		return geoMagDeclination;
	}
	
	public void setGeoMagDeclination(String geoMagDeclination) {
		this.geoMagDeclination = geoMagDeclination;
	}
	
	public String getGeoMagInclination() {
		return geoMagInclination;
	}
	
	public void setGeoMagInclination(String geoMagInclination) {
		this.geoMagInclination = geoMagInclination;
	}
	
	public String getDistancHP() {
		return distancHP;
	}
	
	public void setDistancHP(String distancHP) {
		this.distancHP = distancHP;
	}
	
	public String getDistanceTravelled() {
		return distanceTravelled;
	}
	
	public void setDistanceTravelled(String distanceTravelled) {
		this.distanceTravelled = distanceTravelled;
	}
	
	public String getDirectionOfTravel() {
		return directionOfTravel;
	}
	
	public void setDirectionOfTravel(String directionOfTravel) {
		this.directionOfTravel = directionOfTravel;
	}
	
	public String getDirectionOfTravelTrue() {
		return directionOfTravelTrue;
	}
	
	public void setDirectionOfTravelTrue(String directionOfTravelTrue) {
		this.directionOfTravelTrue = directionOfTravelTrue;
	}
	
	public String getIMUTemp() {
		return imuTemp;
	}
	
	public void setIMUTemp(String imuTemp) {
		this.imuTemp = imuTemp;
	}
	
	public String getFlyCState() {
		return flyCState;
	}
	
	public void setFlyCState(String flyCState) {
		this.flyCState = flyCState;
	}
	
	public String getFlyCStateString() {
		return flyCStateString;
	}
	
	public void setFlyCStateString(String flyCStateString) {
		this.flyCStateString = flyCStateString;
	}
	
	public String getNonGPSCause() {
		return nonGPSCause;
	}
	
	public void setNonGPSCause(String nonGPSCause) {
		this.nonGPSCause = nonGPSCause;
	}
	
	public String getNonGPSCauseString() {
		return nonGPSCauseString;
	}
	
	public void setNonGPSCauseString(String nonGPSCauseString) {
		this.nonGPSCauseString = nonGPSCauseString;
	}
	
	public String getDWFlyCState() {
		return dwFlyCState;
	}
	
	public void setDWFlyCState(String dwFlyCState) {
		this.dwFlyCState = dwFlyCState;
	}
	
	public String getConnectedToRC() {
		return connectedToRC;
	}
	
	public void setConnectedToRC(String connectedToRC) {
		this.connectedToRC = connectedToRC;
	}
	
	public String getCurrent() {
		return current;
	}
	
	public void setCurrent(String current) {
		this.current = current;
	}
	
	public String getVolt1() {
		return volt1;
	}
	
	public void setVolt1(String volt1) {
		this.volt1 = volt1;
	}
	
	public String getVolt2() {
		return volt2;
	}
	
	public void setVolt2(String volt2) {
		this.volt2 = volt2;
	}
	
	public String getVolt3() {
		return volt3;
	}
	
	public void setVolt3(String volt3) {
		this.volt3 = volt3;
	}
	
	public String getVolt4() {
		return volt4;
	}
	
	public void setVolt4(String volt4) {
		this.volt4 = volt4;
	}
	
	public String getVolt5() {
		return volt5;
	}
	
	public void setVolt5(String volt5) {
		this.volt5 = volt5;
	}
	
	public String getVolt6() {
		return volt6;
	}
	
	public void setVolt6(String volt6) {
		this.volt6 = volt6;
	}
	
	public String getTotalVolts() {
		return totalVolts;
	}
	
	public void setTotalVolts(String totalVolts) {
		this.totalVolts = totalVolts;
	}
	
	public String getVoltSpread() {
		return voltSpread;
	}
	
	public void setVoltSpread(String voltSpread) {
		this.voltSpread = voltSpread;
	}
	
	public String getWatts() {
		return watts;
	}
	
	public void setWatts(String watts) {
		this.watts = watts;
	}
	
	public String getBatteryTemp() {
		return batteryTemp;
	}
	
	public void setBatteryTemp(String batteryTemp) {
		this.batteryTemp = batteryTemp;
	}
	
	public String getRatedCapacity() {
		return ratedCapacity;
	}
	
	public void setRatedCapacity(String ratedCapacity) {
		this.ratedCapacity = ratedCapacity;
	}
	
	public String getRemaingCapacity() {
		return remaingCapacity;
	}
	
	public void setRemaingCapacity(String remaingCapacity) {
		this.remaingCapacity = remaingCapacity;
	}
	
	public String getPercentageCapacity() {
		return percentageCapacity;
	}
	
	public void setPercentageCapacity(String percentageCapacity) {
		this.percentageCapacity = percentageCapacity;
	}
	
	public String getUsefulTime() {
		return usefulTime;
	}
	
	public void setUsefulTime(String usefulTime) {
		this.usefulTime = usefulTime;
	}
	
	public String getPercentageVolts() {
		return percentageVolts;
	}
	
	public void setPercentageVolts(String percentageVolts) {
		this.percentageVolts = percentageVolts;
	}
	
	public String getBatteryCycleCount() {
		return batteryCycleCount;
	}
	
	public void setBatteryCycleCount(String batteryCycleCount) {
		this.batteryCycleCount = batteryCycleCount;
	}
	
	public String getBatteryLifePercentage() {
		return batteryLifePercentage;
	}
	
	public void setBatteryLifePercentage(String batteryLifePercentage) {
		this.batteryLifePercentage = batteryLifePercentage;
	}
	
	public String getBatteryBarCode() {
		return batteryBarCode;
	}
	
	public void setBatteryBarCode(String batteryBarCode) {
		this.batteryBarCode = batteryBarCode;
	}
	
	public String getMinCurrent() {
		return minCurrent;
	}
	
	public void setMinCurrent(String minCurrent) {
		this.minCurrent = minCurrent;
	}
	
	public String getMaxCurrent() {
		return maxCurrent;
	}
	
	public void setMaxCurrent(String maxCurrent) {
		this.maxCurrent = maxCurrent;
	}
	
	public String getAvgCurrent() {
		return avgCurrent;
	}
	
	public void setAvgCurrent(String avgCurrent) {
		this.avgCurrent = avgCurrent;
	}
	
	public String getMinVolts() {
		return minVolts;
	}
	
	public void setMinVolts(String minVolts) {
		this.minVolts = minVolts;
	}
	
	public String getMaxVolts() {
		return maxVolts;
	}
	
	public void setMaxVolts(String maxVolts) {
		this.maxVolts = maxVolts;
	}
	
	public String getAvgVolts() {
		return avgVolts;
	}
	
	public void setAvgVolts(String avgVolts) {
		this.avgVolts = avgVolts;
	}
	
	public String getMinWatts() {
		return minWatts;
	}
	
	public void setMinWatts(String minWatts) {
		this.minWatts = minWatts;
	}
	
	public String getMaxWatts() {
		return maxWatts;
	}
	
	public void setMaxWatts(String maxWatts) {
		this.maxWatts = maxWatts;
	}
	
	public String getAvgWatts() {
		return avgWatts;
	}
	
	public void setAvgWatts(String avgWatts) {
		this.avgWatts = avgWatts;
	}
	
	public String getGimbalRoll() {
		return gimbalRoll;
	}
	
	public void setGimbalRoll(String gimbalRoll) {
		this.gimbalRoll = gimbalRoll;
	}
	
	public String getGimbalPitch() {
		return gimbalPitch;
	}
	
	public void setGimbalPitch(String gimbalPitch) {
		this.gimbalPitch = gimbalPitch;
	}
	
	public String getGimbalYaw() {
		return gimbalYaw;
	}
	
	public void setGimbalYaw(String gimbalYaw) {
		this.gimbalYaw = gimbalYaw;
	}
	
	public String getGimbalXRoll() {
		return gimbalXRoll;
	}
	
	public void setGimbalXRoll(String gimbalXRoll) {
		this.gimbalXRoll = gimbalXRoll;
	}
	
	public String getGimbalXPitch() {
		return gimbalXPitch;
	}
	
	public void setGimbalXPitch(String gimbalXPitch) {
		this.gimbalXPitch = gimbalXPitch;
	}
	
	public String getGimbalXYaw() {
		return gimbalXYaw;
	}
	
	public void setGimbalXYaw(String gimbalXYaw) {
		this.gimbalXYaw = gimbalXYaw;
	}
	
	public String getMotorCmndRFront() {
		return motorCmndRFront;
	}
	
	public void setMotorCmndRFront(String motorCmndRFront) {
		this.motorCmndRFront = motorCmndRFront;
	}
	
	public String getMotorCmndLFront() {
		return motorCmndLFront;
	}
	
	public void setMotorCmndLFront(String motorCmndLFront) {
		this.motorCmndLFront = motorCmndLFront;
	}
	
	public String getMotorCmndLBack() {
		return motorCmndLBack;
	}
	
	public void setMotorCmndLBack(String motorCmndLBack) {
		this.motorCmndLBack = motorCmndLBack;
	}
	
	public String getMotorCmndRBack() {
		return motorCmndRBack;
	}
	
	public void setMotorCmndRBack(String motorCmndRBack) {
		this.motorCmndRBack = motorCmndRBack;
	}
	
	public String getMotorSpeedRFront() {
		return motorSpeedRFront;
	}
	
	public void setMotorSpeedRFront(String motorSpeedRFront) {
		this.motorSpeedRFront = motorSpeedRFront;
	}
	
	public String getMotorSpeedLFront() {
		return motorSpeedLFront;
	}
	
	public void setMotorSpeedLFront(String motorSpeedLFront) {
		this.motorSpeedLFront = motorSpeedLFront;
	}
	
	public String getMotorSpeedLBack() {
		return motorSpeedLBack;
	}
	
	public void setMotorSpeedLBack(String motorSpeedLBack) {
		this.motorSpeedLBack = motorSpeedLBack;
	}
	
	public String getMotorSpeedRBack() {
		return motorSpeedRBack;
	}
	
	public void setMotorSpeedRBack(String motorSpeedRBack) {
		this.motorSpeedRBack = motorSpeedRBack;
	}
	
	public String getMotorLoadRFront() {
		return motorLoadRFront;
	}
	
	public void setMotorLoadRFront(String motorLoadRFront) {
		this.motorLoadRFront = motorLoadRFront;
	}
	
	public String getMotorLoadLFront() {
		return motorLoadLFront;
	}
	
	public void setMotorLoadLFront(String motorLoadLFront) {
		this.motorLoadLFront = motorLoadLFront;
	}
	
	public String getMotorLoadLBack() {
		return motorLoadLBack;
	}
	
	public void setMotorLoadLBack(String motorLoadLBack) {
		this.motorLoadLBack = motorLoadLBack;
	}
	
	public String getMotorLoadRBack() {
		return motorLoadRBack;
	}
	
	public void setMotorLoadRBack(String motorLoadRBack) {
		this.motorLoadRBack = motorLoadRBack;
	}
	
	public String getControlAileron() {
		return controlAileron;
	}
	
	public void setControlAileron(String controlAileron) {
		this.controlAileron = controlAileron;
	}
	
	public String getControlElevator() {
		return controlElevator;
	}
	
	public void setControlElevator(String controlElevator) {
		this.controlElevator = controlElevator;
	}
	
	public String getControlThrottle() {
		return controlThrottle;
	}
	
	public void setControlThrottle(String controlThrottle) {
		this.controlThrottle = controlThrottle;
	}
	
	public String getControlRudder() {
		return controlRudder;
	}
	
	public void setControlRudder(String controlRudder) {
		this.controlRudder = controlRudder;
	}
	
	public String getControlModeSwitch() {
		return controlModeSwitch;
	}
	
	public void setControlModeSwitch(String controlModeSwitch) {
		this.controlModeSwitch = controlModeSwitch;
	}
	
	public String getTabletLongitude() {
		return tabletLongitude;
	}
	
	public void setTabletLongitude(String tabletLongitude) {
		this.tabletLongitude = tabletLongitude;
	}
	
	public String getTabletLatitude() {
		return tabletLatitude;
	}
	
	public void setTabletLatitude(String tabletLatitude) {
		this.tabletLatitude = tabletLatitude;
	}
	 
}
