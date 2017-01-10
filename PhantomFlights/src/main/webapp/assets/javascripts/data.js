var map;
var currentMarker = null;
var currentFlightPath = null;

var data = {
	values: [],
	columns: []
};

var range;
var rangeMax;
var rangeValue;

var flightDataBtns;

var playInterval = null;
var playIndex = 0;
var playBtn; 

var dataBoxes;
var dataBoxIndexes = [];

function initMap(){
	
	map = new google.maps.Map(document.getElementById("map"), {
		zoom: 18,
		center: getMarkerPosition(),
		mapTypeId: google.maps.MapTypeId.SATELLITE
	});
	
	setMarker();
	
}

$(function(){
	
	range = $("#range").prop("disabled", true);
	rangeMax = $(".range .max .value");
	rangeValue = $(".range .slider .value");
	
	flightDataBtns = $("button.get-flight-data");
	
	playBtn = $(".btn.play"); 
	
	flightDataBtns.on("click", loadFlightData);
	
	dataBoxes = $(".data-box");
	
	range.on("input", onRange);
	
	playBtn.on("click", playFlight);

});

function loadFlightData(){
	flightDataBtns.prop("disabled", true).removeClass("active");
	
	var source = $(this).addClass("active");
	
	$.get("/flight-data.json", { "flight": source.data("flight") }).done(function(response){
		
		flightDataBtns.prop("disabled", false);
		range.prop("disabled", false).prop("max", response.values.length);
		
		data.values = response.values; 
		data.columns = response.columns; 
		
		resetRange();
		resetPlay();
		setupDataBoxes();
		plotFlightPath();
	});
	
}

function onRange(){
	var rowIndex = range.val();
	rangeValue.html(rowIndex);
	
	for(var i = 0; i < dataBoxIndexes.length; i++){
		var box = dataBoxIndexes[i];
		var value = data.values[rowIndex][box.index];
		
		if(value != null && box.el.attr("data-digits")){
			value = parseFloat(value).toFixed(box.el.attr("data-digits"));
		}
		
		if(value == null){
			value = "-";
		}
		
		box.el.find(".value").html(value);
	}
	
	setMarker(rowIndex);
	playIndex = rowIndex;
}

function setupDataBoxes(){
	dataBoxes.each(function(){
		var source = $(this);
		source.find(".value").html("-");
		
		
		dataBoxIndexes.push({
			el: source,
			index: getColumnIndex(source.data("type"))
		});
	});
}

function resetRange(){
	range.val(0);
	range.attr("max", data.values.length - 1);
	rangeMax.html(data.values.length - 1);
	rangeValue.html(0);
}

function getCoordinates(){
	var coords = [];
	var latIndex = getColumnIndex("latitude");
	var lngIndex = getColumnIndex("longitude");
	
	for(var i = 0; i < data.values.length; i++){
		var lat = data.values[i][latIndex];
		var lng = data.values[i][lngIndex];
		
		if(lat != null && lng != null){
			coords.push({
				"lat": lat,
				"lng": lng
			});
		}
	}
	
	return coords;
}

function plotFlightPath(){
	if(currentFlightPath != null){
		currentFlightPath.setMap(null);
	}
	
	var coordinates = getCoordinates();
		
	currentFlightPath = new google.maps.Polyline({
		path: coordinates,
		geodesic: true,
		strokeColor: '#FF0000',
		strokeOpacity: 1.0,
		strokeWeight: 2,
		map: map
	});
	
	centerMap(coordinates);
}

function centerMap(coordinates){
	var bounds = new google.maps.LatLngBounds();
	
	for (var i = 0; i < coordinates.length; i++) {
	    bounds.extend(coordinates[i]);
	}
	
	map.fitBounds(bounds);
}

function getMarkerPosition(rowIndex){
	var position = {
		lat: 42.01924420474889,
		lng: -93.67347558083532
	};
	
	if(rowIndex == null){
		return position;
	}
	
	var latIndex = getColumnIndex("latitude");
	var lngIndex = getColumnIndex("longitude");
	
	position.lat = data.values[rowIndex][latIndex];
	position.lng = data.values[rowIndex][lngIndex];
	
	return position;
}

function setMarker(rowIndex){
	if(currentMarker == null){
		currentMarker = new google.maps.Marker({
			position: getMarkerPosition(rowIndex),
			map: map
		});
	} else {
		var position = getMarkerPosition(rowIndex);
		currentMarker.setPosition(new google.maps.LatLng(position.lat, position.lng));
	}
}

function getColumnIndex(name){
	for(var i = 0; i < data.columns.length; i++){
		if(data.columns [i] == name){
			return i;
		}
	}
}

function resetPlay(){
	playIndex = 0;
	playInterval == null;
	playBtn.prop("disabled", false);
}

function playFlight(){
	if(playInterval == null){
		startPlay();
	} else {
		pausePlay();
	}
}

function startPlay(){
	playInterval = setInterval(stepFlight, 50);
	playBtn.find(".glyphicon-play").removeClass("glyphicon-play").addClass("glyphicon-pause");
}

function pausePlay(){
	clearInterval(playInterval);
	playInterval = null;
	playBtn.find(".glyphicon-pause").removeClass("glyphicon-pause").addClass("glyphicon-play");
}

function stopPlay(){
	pausePlay();
	playIndex = 0;
}

function stepFlight(){
	playIndex++;
	
	if(playIndex >= data.values.length){
		stopPlay();
	} else {
		range.val(playIndex).trigger("input");
	}
}