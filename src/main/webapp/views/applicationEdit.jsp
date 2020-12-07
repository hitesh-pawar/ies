<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Applicant Update</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript"
	src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script type="text/javascript"
	src="http://code.jquery.com/ui/1.11.0/jquery-ui.js"></script>
<link rel="stylesheet"
	href="http://code.jquery.com/ui/1.11.0/themes/smoothness/jquery-ui.css">
<script type="text/javascript">
	$(document).ready(function() {
		$(function() {
			$("#expenseDate").datepicker();
		});
	});
</script>
</head>
<body>
	<div align="center">

		<h3 style="text-decoration: underline;">Edit Applicant</h3>

		<font color="green">${succMsg}</font> <font color="red">${failMsg}</font>

		<form:form action="applicationEdit" method="POST"
			modelAttribute="appEdit">
			<table>
				<tr>
					<td>Application NO:</td>
					<td><form:input path="applicationId" readonly="true" /></td>
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
					<td>Date Of Birth:</td>
					<td><form:input path="dateOfBirth" id="expenseDate" /></td>
				</tr>
				<tr>
					<td>Gender:</td>
					<td><form:radiobutton path="gender" value="M" />Male <form:radiobutton
							path="gender" value="F" />Fe-Male</td>
				</tr>
				<tr>
					<td>SSN-NO:</td>
					<td><form:input path="ssn" /></td>
				</tr>
				<tr>
					<td>Phone Number:</td>
					<td><form:input path="phoneNumber" /></td>
				</tr>
				<tr>
					<td>Email:</td>
					<td><form:input path="email" id="email" /> <font color="red"><span
							id="errMsg"></span></font></td>
				</tr>
				<tr>
					<td><form:hidden path="accStatus" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="Update" id="submitBtn"></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>