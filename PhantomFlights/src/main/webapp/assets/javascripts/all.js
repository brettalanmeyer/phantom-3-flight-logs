$(function(){
	
	$("button").on("click", function(){
		$(this).text("Processing...");
		$("button").prop("disabled", true);
	});
	
});
