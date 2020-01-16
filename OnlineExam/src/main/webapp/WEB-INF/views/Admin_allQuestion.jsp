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
	
	<h3>Admin module view questions category wise</h3>
	<form action="admin_listQuestionCategoryWise">
		<select name="category">
			<option value = "Plants">Plants</option>
			<option value = "Animals">Animals</option>
		</select>
		<br><br>
		<input type = "submit" value="Retrive Questions"/>
	</form>
	
	
	<br><br>
	<c:if test = "${flag eq 1}">
		<table border=2 align="center">
			<tr>
				<th>Qn No</th>
				<th>Question</th>
				<th>Delete Question</th>
			</tr>

			<c:forEach items="${allQuestions}" var="qn" varStatus="it">
				<tr>
					<th>${it.count}</th>
					<th align="left"><c:out value="${qn.question}"></c:out></th>
					<th><a href="<c:url value='/admin_deleteQuestion/${qn.question}'></c:url>">Delete</a></th>
				</tr>
			</c:forEach>
		</table>
	</c:if>
	 <br>
	<button onclick="window.location.href = 'admin_welcome';">Admin Homepage</button>
	
	
</body>
</html>