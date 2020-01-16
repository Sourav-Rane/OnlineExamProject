<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>

<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<!DOCTYPE html>

<html>

<head>

<meta charset="ISO-8859-1">

<title>Add question</title>

</head>

<body>

<h3><center>Admin Add Question</center></h3>

<f:form modelAttribute="question">

	<form >

		<table cellspacing="10" cellpadding="10" border="0" align="center">

			<caption>Add question</caption>

			<br/><br/>

			<tr>

				<td>Select Category to add question</td>

				<td>

					<select path="questionCategory" name="questionCategory" 

					id="questionCategory">

					<option value="Plants">PLANT</option>

					<option value="Animals">ANIMAL</option>

				</td>

			</tr>

			<tr>

				<td>Question:</td>

				<td><f:input path="question" placeholder="Enter question" 

				name="question" id="question" /></td>

				

			</tr>

			<tr>

				<td>Choice 1:</td>

				<td><f:input path="questionChoice1" name="questionChoice1"

					id="questionChoice1" placeholder="Enter answer1"/></td>

				

			</tr>

			<tr>

				<td>Choice 2:</td>

				<td><f:input path="questionChoice2" name="questionChoice2" 

				id="questionChoice2" placeholder="Enter answer2"/></td>

			</tr>

			<tr>

				<td>Choice 3:</td>

				<td><f:input path="questionChoice3" name="questionChoice3" 

				id="questionChoice3" placeholder="Enter answer3"/></td>

			</tr>

			<tr>

				<td>Correct Answer :</td>

				<td><f:input path="questionAnswer" name="questionAnswer" 

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

	</f:form>

</body>

</html>