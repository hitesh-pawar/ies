<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Plans</title>
<script>
	function deleteConfirm() {
		return confirm("Are you sure, you want to delete ?");
	}
</script>
</head>
<body>
	<font color="green">${delSucc}</font>
	<font color="red">${delFail}</font>
	<h1 style="text-decoration: underline;">View Accounts</h1>

	<table border="1">
		<tr>
			<td>PLAN ID</td>
			<td>PLAN NAME</td>
			<td>PLAN DESC</td>
			<td>PLAN START DATE</td>
			<td>PLAN END DATE</td>
			<td>ACTION</td>
		</tr>
		<c:forEach items="${plans}" var="plan">
			<tr>
				<td>${plan.planId}</td>
				<td>${plan.planName}</td>
				<td>${plan.planDesc}</td>
				<td>${plan.startDate}</td>
				<td>${plan.endDate}</td>
				<td><a href="editPlan?pid=${plan.planId}">Edit</a> <a
					href="deletePlan?pid=${plan.planId}"
					onclick="return deleteConfirm()" id="delete"> <c:choose>
							<c:when test="${plan.accStatus == 'Activated'}">
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