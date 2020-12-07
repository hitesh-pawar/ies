<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SNAP Income Details</title>
</head>
<body>
	<div align="center">

		<h3 style="text-decoration: underline;">Income Details</h3>

		<form:form action="createIncomeAction" method="POST"
			modelAttribute="dcIncome">
			<table>
				<tr>
					<td>Case Id:</td>
					<td><form:input path="caseId" readonly="true" /></td>
				</tr>
				<tr>
					<td>Name:</td>
					<td><form:input path="name" /></td>
				</tr>
				<tr>
					<td>Working:</td>
					<td><form:radiobutton path="workingStatus" value="Y" />YES <form:radiobutton
							path="workingStatus" value="N" />NO</td>
				</tr>
				<tr>
					<td>Other Income:</td>
					<td><form:input path="otherIncome" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="Next" id="submitBtn"></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>