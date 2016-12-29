function initMap() {
	
	var center = {
		lat: 42.01924420474889,
		lng: -93.67347558083532
	};
	
	var map = new google.maps.Map(document.getElementById("map"), {
		zoom: 18,
		center: center,
		mapTypeId: google.maps.MapTypeId.SATELLITE
	});
	
	var currentFlightPath = null;
	var currentMarker = null;
	
	var flightBtns = $(".btn[data-flight]");
	
	flightBtns.on("click", function(){
		
		var source = $(this);
		flightBtns.prop("disabled", true);
		
		$.get("/data.json", { "flight": source.data("flight") }).done(function(coordinates){
			
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
			
			currentFlightPath = flightPath;
			currentMarker = marker;
			
			var bounds = new google.maps.LatLngBounds();
			for (var i = 0; i < coordinates.length; i++) {
			    bounds.extend(coordinates[i]);
			}
			map.fitBounds(bounds);
		});
		
	});

}
