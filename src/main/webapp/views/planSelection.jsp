<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Plan Selection</title>
</head>
<body>
	<div align="center">

		<h3 style="text-decoration: underline;">Select Plan</h3>

		<form:form action="selectionPlanAction" method="POST"
			modelAttribute="casePlan">
			<table>
				<tr>
					<td>Case Id:</td>
					<td><form:input path="caseId" readonly="true" /></td>
				</tr>
				<tr>
					<td>First Name:</td>
					<td><form:input path="firstName" /></td>
				</tr>
				<tr>
					<td>Last Name:</td>
					<td><form:input path="lastName" /></td>
				</tr>
				<tr>
					<td>Select Country:</td>
					<td><form:select path="planName">
							<form:option value="0" label="Select" />
							<form:options items="${plans}" />
						</form:select></td>
				</tr>
				<tr>
					<td><input type="submit" value="Next" id="submitBtn"></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>