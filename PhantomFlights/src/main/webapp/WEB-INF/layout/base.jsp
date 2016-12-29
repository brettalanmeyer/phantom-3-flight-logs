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
		
		<a href="/" class="pull-left">
			<span class="glyphicon glyphicon-home"></span>
		</a>
		
		<div class="container-fluid">
			<tiles:insertAttribute name="body" />
		</div>
	
		<script src="/webjars/jquery/2.2.4/jquery.min.js"></script>
		<script src="/webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
		<script src="/assets/javascripts/all.js"></script>
		
	</body>
</html>