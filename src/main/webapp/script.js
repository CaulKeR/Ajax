$(document).ready(function() {
	$('#userName').blur(function() {
		$.ajax({
			url : 'userServlet',
			data : {
				userName : $('#userName').val()
			},
			success : function(responseText) {
				$('#ajaxUserServletResponse').text(responseText);
			}
		});
	});
});