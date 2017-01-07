package com.phantom.ingestion;

public class Mapper {
	
	public static LogEntry rowToLogEntity(String[] row) {
		
		LogEntry logEntry = new LogEntry();
		
		int i = 0;
		
		logEntry.setTick(getInteger(row, i++));
		logEntry.setOffsetTime(getDouble(row, i++));
		logEntry.setFlightTime(getInteger(row, i++));
		logEntry.setLongitude(getDouble(row, i++));
		logEntry.setLatitude(getDouble(row, i++));
		logEntry.setNumSats(getInteger(row, i++));
		logEntry.setGpsHealth(getInteger(row, i++));
		logEntry.setGpsAltitude(getDouble(row, i++));
		logEntry.setBaroAlt(getDouble(row, i++));
		logEntry.setVpsHeight(getDouble(row, i++));
		logEntry.setRelativeHeight(getDouble(row, i++));
		logEntry.setAccelX(getDouble(row, i++));
		logEntry.setAccelY(getDouble(row, i++));
		logEntry.setAccelZ(getDouble(row, i++));
		logEntry.setAccel(getDouble(row, i++));
		logEntry.setGyroX(getDouble(row, i++));
		logEntry.setGyroY(getDouble(row, i++));
		logEntry.setGyroZ(getDouble(row, i++));
		logEntry.setGyro(getDouble(row, i++));
		logEntry.setErrorX(getDouble(row, i++));
		logEntry.setErrorY(getDouble(row, i++));
		logEntry.setErrorZ(getDouble(row, i++));
		logEntry.setError(getDouble(row, i++));
		logEntry.setMagX(getInteger(row, i++));
		logEntry.setMagY(getInteger(row, i++));
		logEntry.setMagZ(getInteger(row, i++));
		logEntry.setMagMod(getDouble(row, i++));
		logEntry.setVelN(getDouble(row, i++));
		logEntry.setVelE(getDouble(row, i++));
		logEntry.setVelD(getDouble(row, i++));
		logEntry.setVel(getDouble(row, i++));
		logEntry.setVelH(getDouble(row, i++));
		logEntry.setVelGPSvelH(getDouble(row, i++));
		logEntry.setQuatW(getDouble(row, i++));
		logEntry.setQuatX(getDouble(row, i++));
		logEntry.setQuatY(getDouble(row, i++));
		logEntry.setQuatZ(getDouble(row, i++));
		logEntry.setRoll(getDouble(row, i++));
		logEntry.setPitch(getDouble(row, i++));
		logEntry.setYaw(getDouble(row, i++));
		logEntry.setYaw360(getDouble(row, i++));
		logEntry.setTotalGyroZ(getDouble(row, i++));
		logEntry.setMagYaw(getDouble(row, i++));
		logEntry.setThrustAngle(getDouble(row, i++));
		logEntry.setHomePointLongitude(getDouble(row, i++));
		logEntry.setHomePointLatitude(getDouble(row, i++));
		logEntry.setHomePointAltitude(getDouble(row, i++));
		logEntry.setGeoMagDeclination(getDouble(row, i++));
		logEntry.setGeoMagInclination(getDouble(row, i++));
		logEntry.setDistancHP(getDouble(row, i++));
		logEntry.setDistanceTravelled(getDouble(row, i++));
		logEntry.setDirectionOfTravel(getDouble(row, i++));
		logEntry.setDirectionOfTravelTrue(getDouble(row, i++));
		logEntry.setIMUTemp(getInteger(row, i++));
		logEntry.setFlyCState(getInteger(row, i++));
		logEntry.setFlyCStateString(getString(row, i++));
		logEntry.setNonGPSCause(getInteger(row, i++));
		logEntry.setNonGPSCauseString(getString(row, i++));
		logEntry.setDWFlyCState(getInteger(row, i++));
		logEntry.setConnectedToRC(getBoolean(row, i++));
		logEntry.setCurrent(getDouble(row, i++));
		logEntry.setVolt1(getDouble(row, i++));
		logEntry.setVolt2(getDouble(row, i++));
		logEntry.setVolt3(getDouble(row, i++));
		logEntry.setVolt4(getDouble(row, i++));
		logEntry.setVolt5(getDouble(row, i++));
		logEntry.setVolt6(getDouble(row, i++));
		logEntry.setTotalVolts(getDouble(row, i++));
		logEntry.setVoltSpread(getDouble(row, i++));
		logEntry.setWatts(getDouble(row, i++));
		logEntry.setBatteryTemp(getDouble(row, i++));
		logEntry.setRatedCapacity(getDouble(row, i++));
		logEntry.setRemaingCapacity(getDouble(row, i++));
		logEntry.setPercentageCapacity(getInteger(row, i++));
		logEntry.setUsefulTime(getInteger(row, i++));
		logEntry.setPercentageVolts(getInteger(row, i++));
		logEntry.setBatteryCycleCount(getInteger(row, i++));
		logEntry.setBatteryLifePercentage(getInteger(row, i++));
		logEntry.setBatteryBarCode(getString(row, i++));
		logEntry.setMinCurrent(getDouble(row, i++));
		logEntry.setMaxCurrent(getDouble(row, i++));
		logEntry.setAvgCurrent(getDouble(row, i++));
		logEntry.setMinVolts(getDouble(row, i++));
		logEntry.setMaxVolts(getDouble(row, i++));
		logEntry.setAvgVolts(getDouble(row, i++));
		logEntry.setMinWatts(getDouble(row, i++));
		logEntry.setMaxWatts(getDouble(row, i++));
		logEntry.setAvgWatts(getDouble(row, i++));
		logEntry.setGimbalRoll(getDouble(row, i++));
		logEntry.setGimbalPitch(getDouble(row, i++));
		logEntry.setGimbalYaw(getDouble(row, i++));
		logEntry.setGimbalXRoll(getDouble(row, i++));
		logEntry.setGimbalXPitch(getDouble(row, i++));
		logEntry.setGimbalXYaw(getDouble(row, i++));
		logEntry.setMotorCmndRFront(getInteger(row, i++));
		logEntry.setMotorCmndLFront(getInteger(row, i++));
		logEntry.setMotorCmndLBack(getInteger(row, i++));
		logEntry.setMotorCmndRBack(getInteger(row, i++));
		logEntry.setMotorSpeedRFront(getDouble(row, i++));
		logEntry.setMotorSpeedLFront(getDouble(row, i++));
		logEntry.setMotorSpeedLBack(getDouble(row, i++));
		logEntry.setMotorSpeedRBack(getDouble(row, i++));
		logEntry.setMotorLoadRFront(getDouble(row, i++));
		logEntry.setMotorLoadLFront(getDouble(row, i++));
		logEntry.setMotorLoadLBack(getDouble(row, i++));
		logEntry.setMotorLoadRBack(getDouble(row, i++));
		logEntry.setControlAileron(getInteger(row, i++));
		logEntry.setControlElevator(getInteger(row, i++));
		logEntry.setControlThrottle(getInteger(row, i++));
		logEntry.setControlRudder(getInteger(row, i++));
		logEntry.setControlModeSwitch(getInteger(row, i++));
		logEntry.setTabletLongitude(getDouble(row, i++));
		logEntry.setTabletLatitude(getDouble(row, i++));
		
		return logEntry;
	}
	
	private static String getString(String[] data, int index) {
		if(data.length > index){
			String value = data[index];
			
			if(!value.trim().isEmpty()){
				return value.trim();
			}
		}
		
		return null;
	}
	
	private static Integer getInteger(String[] data, int index) {
		if(data.length > index){
			String value = data[index].trim();
			
			if(!value.isEmpty()){
				return Integer.valueOf(value);
			}
		}
		
		return null;
	}
	
	private static Double getDouble(String[] data, int index) {
		if(data.length > index){
			String value = data[index].trim();
			
			if(!value.isEmpty()){
				return Double.valueOf(value);
			}
		}
		
		return null;
	}
	
	private static Boolean getBoolean(String[] data, int index) {
		if(data.length > index){
			String value = data[index];
			
			if(!value.isEmpty()){
				return value.equals("1");
			}
		}
		
		return null;
	}

	
}
