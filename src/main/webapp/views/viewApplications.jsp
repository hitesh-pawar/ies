<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Applicant</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script>
	function deleteConfirm() {
		return confirm("Are you sure, you want to delete ?");
	}
</script>
</head>
<body>
	<font color="green">${delSucc}</font>
	<font color="red">${delFail}</font>
	<h1 style="text-decoration: underline;">View Applicant</h1>

	<table border="1">
		<tr>
			<!-- <td>S.No</td> -->
			<td>Application No</td>
			<td>FIRST NAME</td>
			<td>LAST NAME</td>
			<td>Date Of Birth</td>
			<td>SSN</td>
			<td>ACTION</td>
		</tr>
		<c:forEach items="${applications}" var="application">
			<tr>
				<td>${application.applicationId}</td>
				<td>${application.firstName}</td>
				<td>${application.lastName}</td>
				<td>${application.dateOfBirth}</td>
				<td>${application.ssn}</td>
				<td><a
					href="editApplication?appId=${application.applicationId}">Edit</a>
					<a href="deleteApplication?appId=${application.applicationId}"
					onclick="return deleteConfirm()" id="delete"> <c:choose>
							<c:when test="${application.accStatus == 'Activated'}">
								Delete
							</c:when>
							<c:otherwise>Activate</c:otherwise>
						</c:choose>
				</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
