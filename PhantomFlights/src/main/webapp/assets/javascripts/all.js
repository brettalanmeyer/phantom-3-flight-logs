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
	
	var dataBtns = $(".btn[data-type=flight-data]");
	dataBtns.on("click", function(){
		
		var source = $(this);
		dataBtns.prop("disabled", true);
		
		$.get("/flight-data.json", { "flight": source.data("flight") }).done(function(data){
			console.log(data.length);
			console.log(data[25000])
			dataBtns.prop("disabled", false);
		});
		
	});
	
});
