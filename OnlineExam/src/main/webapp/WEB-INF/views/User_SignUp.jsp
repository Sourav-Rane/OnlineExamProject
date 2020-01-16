 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login form</title>
</head>
<body align="center">

		<form>
			<table cellspacing="10" cellpadding="10" border="0" align="center">
				<caption>	<h2>Register User </h2></caption>
				<tr>
					<td>User Email :</td>
					<td><input name="userEmail" id="userEmail"
							 required></td>


				</tr>
				<tr>
					<td>User Name :</td>
					<td><input 
							name="userName" id="userName" required></td>
				</tr>
				<tr>
					<td>User Password :</td>
					<td><input type="password" name="userPassword" id="userPassword"
							 required></td>
				</tr>
				
				<tr>
					<td>
				    <input type="submit"  formaction="user_saveExamUser"
					 value="Sign up">
					 </td>
				
					<td>Existing user ?? <a href="user_login">Click here to Login</a></td>
				</tr>
				
				
			</table>
		</form>
		
		<c:if test="${error eq 1}">
		<h5 align = "center" style="color: red">Email id does not exist ! Please signup to continue...</h5>
	</c:if>

</body>
</html>