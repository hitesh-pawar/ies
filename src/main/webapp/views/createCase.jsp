<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Case</title>
</head>
<body>
	<div align="center">
		<form:form action="searchApplicant" method="GET">
			<table>
				<tr>
					<td><input type="applicationId"
						placeholder="Enter Application Number" name="applicationId" /></td>
					<td><input type="submit" value="Search" id="submitBtn"></td>
				</tr>
				<tr>
					<td><font color="red">${errMsg}</font></td>
				</tr>
			</table>
		</form:form>
		<c:if test="${!empty applications}">
			<h2 style="text-decoration: underline;">Create Case</h2>
			<table>
				<tr>
					<td>Application Id:</td>
					<td>${applications.applicationId}</td>
				</tr>
				<tr>
					<td>Name:</td>
					<td>${applications.firstName}  ${applications.lastName}</td>
				</tr>
				<tr>
					<td>Date Of Birth:</td>
					<td>${applications.dateOfBirth}</td>
				</tr>
				<tr>
					<td>Gender:</td>
					<td>${applications.gender}</td>
				</tr>
				<tr>
					<td>SSN:</td>
					<td>${applications.ssn}</td>
				</tr>
				<tr>
					<td>Phone Number:</td>
					<td>${applications.phoneNumber}</td>
				</tr>
				<tr>
					<td>Email:</td>
					<td>${applications.email}</td>
				</tr>
			</table>
			<a href="createCase?applicationId=${applications.applicationId}">Create
				Case</a>
		</c:if>
	</div>
</body>
</html>