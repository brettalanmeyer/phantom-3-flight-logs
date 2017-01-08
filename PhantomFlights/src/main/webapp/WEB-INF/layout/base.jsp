<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Phantom Flight Utility</title>
		<link rel="stylesheet" href="/webjars/bootstrap/3.3.6/css/bootstrap.min.css" media="screen" />
		<link rel="stylesheet" href="/assets/stylesheets/all.css" media="screen" />
	</head>
	<body>
	
		
		<nav class="navbar navbar-default navbar-fixed-top">
			<div class="container-fluid">
				
				<div class="navbar-header">
					<a class="navbar-brand" href="/">Phantom Flight Utility</a>
				</div>

				<div id="navbar" class="navbar-collapse collapse">
					<ul class="nav navbar-nav">
						<li><a href="/data-files">Manage Phantom Data Files</a></li>
					</ul>
				</div>
        
			</div>
		</nav>
				
		<div class="container-fluid">
			<tiles:insertAttribute name="body" />
		</div>
	
		<script src="/webjars/jquery/2.2.4/jquery.min.js"></script>
		<script src="/webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
		<script src="/assets/javascripts/data.js"></script>
		<script src="/assets/javascripts/all.js"></script>
		<!-- <script src="/assets/javascripts/app.js"></script> -->
		<script async defer src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCfh-kFCPhku2UzStFLJNSPExxfdbWdXVo&callback=initMap"></script>
		
	</body>
</html>