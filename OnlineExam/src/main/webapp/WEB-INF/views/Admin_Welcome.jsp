<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>INDEX</title>
<style type="text/css">
#btn1 {
	position: relative;
	top: 70px;
}
</style>
</head>
<body align="center">
	<h2>Admin Operations</h2>
	<div id="btn1">
		<button onclick="window.location.href = 'admin_addquestion';">ADD
			QUESTIONS</button>
		<br> <br>
		<button onclick="window.location.href = 'admin_question';">VIEW
			QUESTIONS</button>
		<br> <br>
		<button onclick="window.location.href = 'admin_retrieveUser';">VIEW
			USER DETAILS</button>
		<br> <br>
		<button onclick="window.location.href = 'admin';">LOG OUT</button>
	</div>
</body>
</html>
</body>
</html>