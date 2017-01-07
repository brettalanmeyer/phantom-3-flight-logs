function initMap() {
	
	var map;
	var currentFlightPath = null;
	var currentMarker = null;
	var flightCoordinates;
	var flightData;

	var mapElement = document.getElementById("map");
	
	if(mapElement == null){
		return;
	}
	
	map = new google.maps.Map(mapElement, {
		zoom: 18,
		center: {
			lat: 42.01924420474889,
			lng: -93.67347558083532
		},
		mapTypeId: google.maps.MapTypeId.SATELLITE
	});
	
	$(function(){
			
		var flightBtns = $(".btn[data-type=flight]");
		flightBtns.on("click", function(){
			
			var source = $(this);
			flightBtns.prop("disabled", true);
			
			$.get("/flight-data.json", { "flight": source.data("flight") }).done(function(data){
				
				flightData = data;
				
				flightBtns.prop("disabled", false);
				
				if(currentFlightPath != null){
					currentFlightPath.setMap(null);
					currentFlightPath = null;
					currentMarker.setMap(null);
				}
				
				
				flightCoordinates = getCoordinates();
				
				var marker = new google.maps.Marker({
					position: {
						lat: flightCoordinates[0]["lat"],
						lng: flightCoordinates[0]["lng"]
					},
					map: map
				});
					
				var flightPath = new google.maps.Polyline({
					path: flightCoordinates,
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
				for (var i = 0; i < flightCoordinates.length; i++) {
				    bounds.extend(flightCoordinates[i]);
				}
				map.fitBounds(bounds);
				
			});
			
		});
				
		/*$(".btn[data-type=time-data]").on("click", function(){
			
			var time = "1970-01-03T06:23:54.972471234Z";
			
			var values = getValuesByColumn("time", time);
			var latitude = getValue(values, "latitude");
			var longitude = getValue(values, "longitude");
			
			console.log(latitude, longitude, values);
		});*/
		
		function getCoordinates(){
			var values = flightData.values;
			
			var coords = [];
			var latIndex = getColumnIndex("latitude");
			var lngIndex = getColumnIndex("longitude");
			
			for(var i = 0; i < values.length; i++){
				var lat = values[i][latIndex];
				var lng = values[i][lngIndex];
				
				if(lat != null && lng != null){
					coords.push({
						"lat": lat,
						"lng": lng
					});
				}
			}
			
			return coords;
		}
		
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

}