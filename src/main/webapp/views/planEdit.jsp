<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Plan Update</title>
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
			$("#startDate").datepicker();
			$("#endDate").datepicker();
		});
	});
</script>
</head>
<body>
	<div align="center">

		<h3 style="text-decoration: underline;">Edit Plan</h3>

		<font color="green">${succMsg}</font> <font color="red">${failMsg}</font>

		<form:form action="planEdit" method="POST" modelAttribute="plEdit">
			<table>
				<tr>
					<td>Plan NO:</td>
					<td><form:input path="planId" readonly="true" /></td>
					</td>
				</tr>
				<tr>
					<td>Plan Name:</td>
					<td><form:input path="planName" /></td>
					<form:hidden path="planId" />
					</td>
				</tr>
				<tr>
					<td>Plan Description:</td>
					<td><form:input path="planDesc" /></td>

				</tr>
				<tr>
					<td>Plan Start Date:</td>
					<td><form:input path="startDate" id="startDate" /></td>
				</tr>
				<tr>
					<td>Plan End Date:</td>
					<td><form:input path="endDate" id="endDate" /></td>
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