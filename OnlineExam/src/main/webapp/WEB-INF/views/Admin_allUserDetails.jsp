
<%@page import="java.util.* ,com.OnlineExam.deloitte.model.Question "%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Data</title>
</head>
<body>

	<br>
	<h3>Admin Retrieve user data</h3>
	<form align="center">
		<select name="email">
				<c:forEach items="${allIds}" var="id">
					<option value="${id}">${id}</option>
				</c:forEach>
			</select>
			<br><br>
			<input type=submit value="RETRIVE USER LOG" formaction="admin_retrieveUserData">
	</form>
	
	
	<table border=2 align="center">
		<caption>SCORE CARD</caption>
			<tr>
				<th>SNo.</th>
				<th>Exam Date</th>
				<th>Name</th>
				<th>Exam Category</th>
				<th>Marks Scored</th>
			</tr>

			<c:forEach items="${userStat}" var="stat" varStatus="it">
				<tr>
					<th>${it.count}</th>
					<th align="left"><c:out value="${stat.statDateTime}"></c:out></th>
					<th align="left"><c:out value="${stat.stateName}"></c:out></th>
					<th align="left"><c:out value="${stat.statCategory}"></c:out></th>
					<th align="left"><c:out value="${stat.statScore}"></c:out></th>
			</c:forEach>
		</table>
	


</body>
</html>