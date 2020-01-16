<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">User Login</h1>
	<form align="center">
		<table align="center" cellspacing="4" cellpadding="4">
			<tr>
				<td>User Name</td>
				<td><input name="userName" id="userName" required></td>
			</tr>
			<tr>
				<td>User Email</td>
				<td><input name="userEmail" id="userEmail" required></td>
			</tr>

			<tr>
				<td>User Password</td>
				<td><input name="userPassword"
						type="password" id="userPassword" required></td>
			</tr>
			<td align="center"><input type="submit" value="Log in"
				formaction="checkUser"> </td>
			<td>New user ?? <a href="userSignup.jsp">Click here to Sign up</a></td>
		</table>
	</form>
	
	<c:if test="${error eq 1}">
		<h5 align = "center" style="color: red">Email id does not exist ! Please signup to continue...</h5>
	</c:if>
</body>
</html>