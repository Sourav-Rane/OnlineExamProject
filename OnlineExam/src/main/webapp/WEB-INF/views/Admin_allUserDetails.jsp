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
<body align="center">
	
	<h3>Admin module</h3>
	<form:form action="/admin_retrieveUser">
        <table>
            <tr>
                <td>Please select:</td>
                <td><form:select path="stats">
                      <form:option value="" label="...." />
                      <form:options items="${stat.statName}" />
                       </form:select>
                                </td>
            </tr>
            <tr>
                <td><input type="submit" name="submit" value="Submit"></td>
            </tr>
            <tr>
        </table>
    </form:form>
	
	
	<br><br>
	<form>
		<table border=2 align="center">
					
			<c:forEach items="${stats}" var="stat" varStatus="it">
					<tr>
						<th>${it.count}</th>
						<th><c:out value="${stat.statDateTime }"></c:out></th>
						<th><c:out value="${stat.statCategory }"></c:out></th>
						<th><c:out value="${stat.statEmail }"></c:out></th>
						<th><c:out value="${stat.statName }"></c:out></th>
						<th><c:out value="${stat.statScore }"></c:out></th>
					</tr>

			</c:forEach>
		</table>
	</form>
	
	
</body>
</html>