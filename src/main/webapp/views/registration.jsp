<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Account Registration</title>
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

	$(document).ready(function() {
		$("#email").blur(function() {
			$("#errMsg").text("");
			$.ajax({
				type : "GET",
				url : "uniqueMailCheck?email=" + $("#email").val(),
				success : function(data) {
					if (data == 'DUPLICATE') {
						$("#errMsg").text("Duplicate Email");
						$("#submitBtn").prop("disabled", true);
					} else {
						$("#submitBtn").prop("disabled", false);
					}
				}
			});

		});

	});
</script>

</head>
<body>
	<div align="center">

		<h3 style="text-decoration: underline;">Account Registration</h3>

		<font color="green">${succMsg}</font> <font color="red">${failMsg}</font>

		<form:form action="accountRegistration" method="POST"
			modelAttribute="accReg">
			<table>
				<tr>
					<td>First Name:</td>
					<td><form:input path="firstName" /></td>
					<form:hidden path="accountId" />
					</td>
				</tr>
				<tr>
					<td>Last Name:</td>
					<td><form:input path="lastName" /></td>
				</tr>

				<tr>
					<td>Email:</td>
					<td><form:input path="email" id="email" /> <font color="red"><span
							id="errMsg"></span></font></td>
				</tr>
				<tr>
					<td>Password :</td>
					<!-- 	<td><input type="password" name="pazzword"></td> -->
					<td><form:password path="pazzword" /></td>
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
					<td>Role:</td>
					<td><form:select path="role" id="role">
							<form:option value="Select">Select</form:option>
							<form:option value="Case Worker">Case Worker</form:option>
							<form:option value="Admin">Admin</form:option>
						</form:select></td>
				</tr>
				<tr>
					<td><input type="submit" value="Registration" id="submitBtn"></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>