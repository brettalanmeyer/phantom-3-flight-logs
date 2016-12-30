var map;
var currentFlightPath = null;
var currentMarker = null;

function initMap() {
	map = new google.maps.Map(document.getElementById("map"), {
		zoom: 18,
		center: {
			lat: 42.01924420474889,
			lng: -93.67347558083532
		},
		mapTypeId: google.maps.MapTypeId.SATELLITE
	});
}

var flightCoordinates;
var flightData;

$(function(){
		
	var flightBtns = $(".btn[data-type=flight-coordinates]");
	flightBtns.on("click", function(){
		
		var source = $(this);
		flightBtns.prop("disabled", true);
		
		$.get("/flight-coordinates.json", { "flight": source.data("flight") }).done(function(coordinates){
			
			console.log(coordinates.length);
			
			flightCoordinates = coordinates;
			
			setTimeout(function(){
				flightBtns.prop("disabled", false);
			}, 1000);
			
			if(currentFlightPath != null){
				currentFlightPath.setMap(null);
				currentFlightPath = null;
				currentMarker.setMap(null);
			}
			
			if(coordinates.length == 0){
				return
			}
			
			var marker = new google.maps.Marker({
				position: {
					lat: coordinates[0]["lat"],
					lng: coordinates[0]["lng"]
				},
				map: map
			});
				
			var flightPath = new google.maps.Polyline({
				path: coordinates,
				geodesic: true,
				strokeColor: '#FF0000',
				strokeOpacity: 1.0,
				strokeWeight: 2,
				map: map
			});
			
			google.maps.event.addListener(flightPath, "click", function(h) {
				console.log(h);
				console.log(h.latLng.lat(), h.latLng.lng());
				console.log(this);
			 });
			
			currentFlightPath = flightPath;
			currentMarker = marker;
			
			var bounds = new google.maps.LatLngBounds();
			for (var i = 0; i < coordinates.length; i++) {
			    bounds.extend(coordinates[i]);
			}
			map.fitBounds(bounds);
			
			enableAnazlye();
		});
		
	});
	
	var dataBtns = $(".btn[data-type=flight-data]");
	dataBtns.on("click", function(){
		
		var source = $(this);
		dataBtns.prop("disabled", true);
		
		$.get("/flight-data.json", { "flight": source.data("flight") }).done(function(data){
			flightData = data;
			
			dataBtns.prop("disabled", false);
			
			enableAnazlye();
		});
		
	});
	
	var btnAnalyze = $(".btn[data-type=time-data]");
	
	function enableAnazlye(){
		if(flightCoordinates.length != null && flightData != null){
			$(".btn[data-type=time-data]").prop("disabled", false);
		}
	}
	
	$(".btn[data-type=time-data]").on("click", function(){
		
		var time = "1970-01-03T06:23:54.972471234Z";
		
		var values = getValuesByColumn("time", time);
		var latitude = getValue(values, "latitude");
		var longitude = getValue(values, "longitude");
		
		console.log(latitude, longitude, values);
	});
	
	function getValuesByColumn(name, value){
		var index = getColumnIndex(name);
		
		var values = flightData.values;
		
		for(var i = 0; i < values.length; i++){
			if(values[i][index] == value){
				return values[i];
			}
		}
	}
	
	function getValue(values, name){
		var index = getColumnIndex(name);
		return values[index];
	}
	
	function getColumnIndex(name){
		var columns = flightData.columns; 
		for(var i = 0; i < columns.length; i++){
			if(columns[i] == name){
				return i;
			}
		}
	}

	
});