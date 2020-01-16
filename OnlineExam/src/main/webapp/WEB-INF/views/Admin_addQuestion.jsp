<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>

<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<!DOCTYPE html>

<html>

<head>

<meta charset="ISO-8859-1">

<title>Add question</title>

</head>

<body align="center">

<h3><center>Admin Add Question</center></h3>


	<form>

		<table cellspacing="10" cellpadding="10" border="0" align="center">


			<br/><br/>

			<tr>

				<td>Select Category to add question</td>

				<td>

					<select  name="questionCategory" 

					id="questionCategory">

					<option value="Plants">PLANT</option>

					<option value="Animals">ANIMAL</option>

				</td>

			</tr>

			<tr>

				<td>Question:</td>

				<td><input placeholder="Enter question" 

				name="question" id="question" /></td>

				

			</tr>

			<tr>

				<td>Choice 1:</td>

				<td><input  name="questionChoice1"

					id="questionChoice1" placeholder="Enter answer1"/></td>

				

			</tr>

			<tr>

				<td>Choice 2:</td>

				<td><input name="questionChoice2" 

				id="questionChoice2" placeholder="Enter answer2"/></td>

			</tr>

			<tr>

				<td>Choice 3:</td>

				<td><input name="questionChoice3" 

				id="questionChoice3" placeholder="Enter answer3"/></td>

			</tr>

			<tr>

				<td>Correct Answer :</td>

				<td><input name="questionAnswer" 

				id="questionAnswer" placeholder="Enter correct answer"/></td>

			</tr>

			<tr>

				<td align="center" colspan=2>

					<input type="submit" formaction="saveQuestion" value="Add Question" />

					</td>

			</tr>	

		</table>

		<div id=display align="center"></div>

	</form>
	
	<button onclick="window.location.href = 'admin_welcome';">Admin Homepage</button>


</body>

</html>