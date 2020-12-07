<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Eligibility Determination</title>
</head>
<body>
	<div align="center">

		<h3 style="text-decoration: underline;">Eligibility Determination</h3>

		<form:form action="edFormAction" method="GET"
			modelAttribute="dcIncome">
			<table>
				<tr>
					<td>Case No:</td>
					<td><form:input path="caseId" readonly="true" /></td>
					</td>
				<tr>
					<td><input type="submit" value="ED" id="submitBtn"></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>