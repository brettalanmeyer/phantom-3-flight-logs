<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<a href="/dat" class="btn btn-primary">Manage Phantom DAT File</a>

<div class="pull-right" style="width: 120px;">

	<c:forEach items="${tags}" var="tag">
		<button class="btn btn-default btn-block" data-type="flight-coordinates" data-flight="${tag}">${tag} Flight</button>
	</c:forEach>
	
	<hr />
	
	<c:forEach items="${tags}" var="tag">
		<button class="btn btn-default btn-block" data-type="flight-data" data-flight="${tag}">${tag} Data</button>
	</c:forEach>
	
</div>

<div id="map" class="map"></div>

<script src="/assets/javascripts/map.js"></script>
<script async defer src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCfh-kFCPhku2UzStFLJNSPExxfdbWdXVo&callback=initMap"></script>
