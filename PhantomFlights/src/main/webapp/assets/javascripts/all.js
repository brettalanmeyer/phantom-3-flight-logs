$(function(){
	
	$("form").on("submit", function(){
		$(this).find("button").text("Processing...");
		$("button").prop("disabled", true);
	});
	
});
