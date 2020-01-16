<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body align="center">

	<h3>Hi <%= session.getAttribute("username") %> Welcome to the Online Exam</h3>
	<form action="beginTest">
		<h5> Choose your Exam Category </h5>
		<select name="category">
			<option value = "Plants">Plants</option>
			<option value = "Animals">Animals</option>
		</select>
		<br><br>
		<input type = "submit" value="START TEST"/>
	</form>
</body>
</html>