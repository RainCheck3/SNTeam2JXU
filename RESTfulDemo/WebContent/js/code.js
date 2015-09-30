$("#updbtn").click(function() {
	$.ajax({
		url : "rest/date/upd",
		type : "PUT",
		data : {
			year : $("#yr").val(),
			month : $("#mn").val(),
			day : $("#dy").val()
		},
		success : function(result) {
			$("#updateStatus").html(result);
		}
	});
});

$("#delbtn").click(function() {
	$.ajax({
		url : "rest/date/del",
		type : "DELETE",
		data : {
			year : $("#yr").val(),
			month : $("#mn").val(),
			day : $("#dy").val()
		},
		success : function(result) {
			$("#updateStatus").html(result);
		}
	});
});