<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>view any users stats</title>
</head>
<body align = "center">

	<h3>Your Score Card</h3>
		<table border=2 align="center">
		<caption>SCORE CARD</caption>
			<tr>
				<th>SNo.</th>
				<th>Exam Date</th>
				<th>Exam Category</th>
				<th>Marks Scored</th>
			</tr>

			<c:forEach items="${userStat}" var="stat" varStatus="it">
				<tr>
					<th>${it.count}</th>
					<th align="left"><c:out value="${stat.statDateTime}"></c:out></th>
					<th align="left"><c:out value="${stat.statCategory}"></c:out></th>
					<th align="left"><c:out value="${stat.statScore}"></c:out></th>
			</c:forEach>
		</table>
<br>
	
	
	<button onclick="window.location.href = '../../user_welcome';">Back to Home page</button>
	

</body>
</html>