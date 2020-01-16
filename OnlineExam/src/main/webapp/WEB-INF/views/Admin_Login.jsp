<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<script type="text/javascript">
	function validate() {

		var adminEmail = document.getElementById("adminEmail").value;
		var adminPassword = document.getElementById("adminPassword").value;

		adminEmail=adminEmail.toUpperCase();
		adminPassword=adminPassword.toUpperCase();
		
		if ((adminEmail == "ADMIN") && (adminPassword == "ADMIN")) 
		{
			return true;
		}
		else
		{
			alert("Only Admin allowed ... ");
			return false;
		}
			
	}
</script>
</head>
<body>
	<h1 align="center">Admin Login</h1>
	<form align="center">
		<table align="center" cellspacing="4" cellpadding="4">

			<tr>
				<td>Email</td>
				<td><input name="adminEmail" id="adminEmail" required></td>
			</tr>

			<tr>
				<td>Password</td>
				<td><input name="adminPassword" type="password"
					id="adminPassword" required></td>
			</tr>
			<td align="center"><input type="submit" value="Log in"
				onclick=validate() formaction="admin_welcome"></td>
		</table>
	</form>
</body>
</html>
