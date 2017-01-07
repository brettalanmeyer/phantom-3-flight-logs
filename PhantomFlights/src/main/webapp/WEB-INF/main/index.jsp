<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="pull-right" style="width: 220px;">

	<c:forEach items="${flights}" var="flight">
		<button class="btn btn-default btn-block" data-type="flight" data-flight="${flight}">${flight} Flight</button>
	</c:forEach>
	
</div>

<div id="map" class="map"></div>

