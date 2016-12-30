$(function(){
	
	$("form").on("submit", function(){
		$(this).find("button").text("Processing...");
		$("button").prop("disabled", true);
	});
	
	$("#file-field").on("change", function(){
		var input = $(this);
		var label = input.val().replace(/\\/g, "/").replace(/.*\//, "");
		input.parents(".input-group").find(":text").val(label);
	});
	
});
