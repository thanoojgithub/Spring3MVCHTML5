$(document).ready(function() {

	$('#clear_all').click(function() {
		alert("clear_all");
		$.ajax({
			type : "GET",
			url : "clearAllCustomers",
			data : {},
			async : false,
			success : function(data) {
				alert("clearAllCustomers - success");
				refresh();
			},
			error : function(data) {
				alert(data);
			}
		});
	});

	function refresh() {
		$.ajax({
			type : "GET",
			url : "customers",
			data : {},
			async : false,
			success : function(data) {
				alert(data);
			},
			error : function(data) {
				alert(data);
			}
		});
	}
});