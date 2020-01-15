<%@page import="java.util.* ,com.OnlineExam.deloitte.model.Question "%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Questions</title>
</head>
<body align="center">
	
	
	<form action="listQuestionCategoryWise">
		<select name="category">
			<option value = "Plants">Plants</option>
			<option value = "Animals">Animals</option>
		</select>
		<br><br>
		<input type = "submit" value="Retrive Questions"/>
	</form>
	
	
	<br><br>
	
	<table border=2 align = "center">
		<tr>
			<th>Qn No</th>
			<th>Question</th>
			<th>Answer</th>
			<th>Delete</th>
		</tr>

		<c:forEach items="${allQuestions}" var="qn" varStatus="it">
			<tr>
				<th>${it.count}</th>
				<th><c:out value="${qn.question}"></c:out></th>
				<th><c:out value="${qn.questionAnswer}"></c:out></th>
				<th><a href ="<c:url value='/deleteQuestion/${qn.question}'></c:url>">Delete</a></th>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>