<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="map-container">

	<ul class="list-unstyled">
		<c:forEach items="${flights}" var="flight">
			<li>
				<button class="btn btn-default btn-xs get-flight-data" data-flight="${flight}">${flight} Flight</button>
			</li>
		</c:forEach>
	</ul>
	
	<div id="map" class="map"></div>
	
</div>


<div class="range">
	<div class="min">
		<div class="type">Min</div>
		<div class="value">0</div>
	</div>
	<div class="slider">
		<input id="range" type="range" min="0" max="0" value="0" autocomplete="off" />
		<div class="value">0</div>
	</div>
	<div class="max">
		<div class="type">Max</div>
		<div class="value">0</div>
	</div>
	<div class="step">
		<button class="btn btn-success play" disabled>
			<span class="glyphicon glyphicon-play"></span>
		</button>
	</div>
</div>


<div class="data-box-container">

	<div class="data-box w2" data-type="flightTime">
		<label>Flight Time</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w6" data-type="latitude" data-digits="8">
		<label>Latitude</label>
		<span class="value">-</span>
	</div>

	<div class="data-box w6" data-type="longitude" data-digits="8">
		<label>Longitude</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w1" data-type="numSats">
		<label>Satellites</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w2" data-type="gpsHealth">
		<label>GPS Health</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w4" data-type="gpsAltitude">
		<label>GPS Altitude</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w5" data-type="baroAlt">
		<label>Barometer Altitude</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w4" data-type="relativeHeight">
		<label>Relative Height</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w4" data-type="accelX" data-digits="4">
		<label>accelX</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w4" data-type="accelY" data-digits="4">
		<label>accelY</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w4" data-type="accelZ" data-digits="4">
		<label>accelZ</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w4" data-type="accel">
		<label>accel</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w6" data-type="gyroX">
		<label>gyroX</label>
		<span class="value">-</span>
	</div>

	<div class="data-box w6" data-type="gyroY">
		<label>gyroY</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w6" data-type="gyroZ">
		<label>gyroZ</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w6" data-type="gyro">
		<label>gyro</label>
		<span class="value">-</span>
	</div>
	
</div>

<div class="data-box-container">
	
	<div class="data-box w1" data-type="errorX" data-digits="4">
		<label>errorX</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w1" data-type="errorY" data-digits="4">
		<label>errorY</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w1" data-type="errorZ" data-digits="4">
		<label>errorZ</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w1" data-type="error" data-digits="4">
		<label>error</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w1" data-type="magX">
		<label>magX</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w1" data-type="magY">
		<label>magY</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w1" data-type="magZ">
		<label>magZ</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w1" data-type="magMod">
		<label>magMod</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w1" data-type="velN" data-digits="4">
		<label>velN</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w1" data-type="velE" data-digits="4">
		<label>velE</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w1" data-type="velD" data-digits="4">
		<label>velD</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w1" data-type="vel" data-digits="4">
		<label>vel</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w1" data-type="velH" data-digits="4">
		<label>velH</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w2" data-type="velGPSvelH" data-digits="4">
		<label>velGPSvelH</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w1" data-type="quatW" data-digits="4">
		<label>quatW</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w1" data-type="quatX" data-digits="4">
		<label>quatX</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w1" data-type="quatY" data-digits="4">
		<label>quatY</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w1" data-type="quatZ" data-digits="4">
		<label>quatZ</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w1" data-type="roll" data-digits="4">
		<label>roll</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w1" data-type="pitch" data-digits="4">
		<label>pitch</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w2" data-type="yaw" data-digits="4">
		<label>yaw</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w2" data-type="yaw360" data-digits="4">
		<label>yaw360</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w3" data-type="totalGyroZ" data-digits="4">
		<label>totalGyroZ</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w2" data-type="magYaw" data-digits="4">
		<label>magYaw</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w2" data-type="thrustAngle">
		<label>thrustAngle</label>
		<span class="value">-</span>
	</div>
	
</div>

<div class="data-box-container">
	
	<div class="data-box w6" data-type="homePointLongitude" data-digits="4">
		<label>homePointLongitude</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w6" data-type="homePointLatitude" data-digits="4">
		<label>homePointLatitude</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w6" data-type="homePointAltitude">
		<label>homePointAltitude</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w6" data-type="geoMagDeclination" data-digits="6">
		<label>geoMagDeclination</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w6" data-type="geoMagInclination" data-digits="6">
		<label>geoMagInclination</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w4" data-type="distancHP" data-digits="4">
		<label>distancHP</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w6" data-type="distanceTravelled" data-digits="4">
		<label>distanceTravelled</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w6" data-type="directionOfTravel" data-digits="4">
		<label>directionOfTravel</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w7" data-type="directionOfTravelTrue" data-digits="4">
		<label>directionOfTravelTrue</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w1" data-type="imuTemp">
		<label>imuTemp</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w1" data-type="flyCState">
		<label>flyCState</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w4" data-type="flyCStateString">
		<label>flyCStateString</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w4" data-type="nonGPSCause">
		<label>nonGPSCause</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w6" data-type="nonGPSCauseString">
		<label>nonGPSCauseString</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w4" data-type="dwFlyCState">
		<label>dwFlyCState</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w4" data-type="connectedToRC">
		<label>connectedToRC</label>
		<span class="value">-</span>
	</div>
	
</div>

<div class="data-box-container">
	
	<div class="data-box w1" data-type="current">
		<label>current</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w1" data-type="volt1">
		<label>volt1</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w1" data-type="volt2">
		<label>volt2</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w1" data-type="volt3">
		<label>volt3</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w1" data-type="volt4">
		<label>volt4</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w1" data-type="volt5">
		<label>volt5</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w1" data-type="volt6">
		<label>volt6</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w1" data-type="totalVolts">
		<label>totalVolts</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w5" data-type="voltSpread">
		<label>voltSpread</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w4" data-type="watts">
		<label>watts</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w3" data-type="minCurrent">
		<label>minCurrent</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w3" data-type="maxCurrent">
		<label>maxCurrent</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w3" data-type="avgCurrent">
		<label>avgCurrent</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w3" data-type="minVolts">
		<label>minVolts</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w3" data-type="maxVolts">
		<label>maxVolts</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w3" data-type="avgVolts">
		<label>avgVolts</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w3" data-type="minWatts">
		<label>minWatts</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w3" data-type="maxWatts">
		<label>maxWatts</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w3" data-type="avgWatts">
		<label>avgWatts</label>
		<span class="value">-</span>
	</div>
	
</div>

<div class="data-box-container">

	<div class="data-box w3" data-type="batteryTemp">
		<label>batteryTemp</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w3" data-type="ratedCapacity">
		<label>ratedCapacity</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w5" data-type="remaingCapacity">
		<label>remaingCapacity</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w6" data-type="percentageCapacity">
		<label>percentageCapacity</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w3" data-type="usefulTime">
		<label>usefulTime</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w5" data-type="percentageVolts">
		<label>percentageVolts</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w7" data-type="batteryCycleCount">
		<label>batteryCycleCount</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w7" data-type="batteryLifePercentage">
		<label>batteryLifePercentage</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w8" data-type="batteryBarCode">
		<label>batteryBarCode</label>
		<span class="value">-</span>
	</div>
	
</div>

<div class="data-box-container">
	
	<div class="data-box w4" data-type="gimbalRoll" data-digits="6">
		<label>gimbalRoll</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w4" data-type="gimbalPitch" data-digits="6">
		<label>gimbalPitch</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w4" data-type="gimbalYaw" data-digits="6">
		<label>gimbalYaw</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w4" data-type="gimbalXRoll" data-digits="6">
		<label>gimbalXRoll</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w4" data-type="gimbalXPitch" data-digits="6">
		<label>gimbalXPitch</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w4" data-type="gimbalXYaw" data-digits="6">
		<label>gimbalXYaw</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w3" data-type="controlAileron">
		<label>controlAileron</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w3" data-type="controlElevator">
		<label>controlElevator</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w3" data-type="controlThrottle">
		<label>controlThrottle</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w3" data-type="controlRudder">
		<label>controlRudder</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w6" data-type="controlModeSwitch">
		<label>controlModeSwitch</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w5" data-type="tabletLongitude">
		<label>tabletLongitude</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w5" data-type="tabletLatitude">
		<label>tabletLatitude</label>
		<span class="value">-</span>
	</div>
	
</div>

<div class="data-box-container">
	
	<div class="data-box w5" data-type="motorCmndRFront">
		<label>motorCmndRFront</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w5" data-type="motorCmndLFront">
		<label>motorCmndLFront</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w5" data-type="motorCmndLBack">
		<label>motorCmndLBack</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w5" data-type="motorCmndRBack">
		<label>motorCmndRBack</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w5" data-type="motorSpeedRFront">
		<label>motorSpeedRFront</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w5" data-type="motorSpeedLFront">
		<label>motorSpeedLFront</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w5" data-type="motorSpeedLBack">
		<label>motorSpeedLBack</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w5" data-type="motorSpeedRBack">
		<label>motorSpeedRBack</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w5" data-type="motorLoadRFront">
		<label>motorLoadRFront</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w5" data-type="motorLoadLFront">
		<label>motorLoadLFront</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w5" data-type="motorLoadLBack">
		<label>motorLoadLBack</label>
		<span class="value">-</span>
	</div>
	
	<div class="data-box w5" data-type="motorLoadRBack">
		<label>motorLoadRBack</label>
		<span class="value">-</span>
	</div>
	
</div>

