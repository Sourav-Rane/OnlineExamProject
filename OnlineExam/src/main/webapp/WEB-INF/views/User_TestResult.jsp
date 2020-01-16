<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<c:if test = "${finalScore lt 50}">
		<h1>Oops ! Your performance is bad... Good Luck Next Time !!!!!</h1>
	</c:if>
	<c:if test = "${finalScore gt 49}">
		<h1> You seem to be good at this !!! </h1>
	</c:if>
	<h1>Your Score is ${finalScore}%</h1>
	
	
	<a href="../../index">back to Home page</a>
</body>
</html>