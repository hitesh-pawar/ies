<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Accounts</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script>
	function deleteConfirm() {
		return confirm("Are you sure, you want to delete ?");
	}

	/* $(document).ready(function() {
		$("#role").change(function() {
			$.ajax({
				type : "GET",
				url : "findByRole?findByRole=" + $("#role").val(),
				success : function(data) {
				}
			});
		});

	}); */
</script>
</head>
<body>
	<font color="green">${delSucc}</font>
	<font color="red">${delFail}</font>
	<h1 style="text-decoration: underline;">View Accounts</h1>

	<form>
		<table>
			<tr>
				<td>Select Role:</td>
				<td><select name="role" id="role">
						<option value="Select" label="Select" />
						<option value="Admin" label="Admin" />
						<option value="Case Worker" label="Case Worker" />
				</select></td>
			</tr>
		</table>
	</form>

	<table border="1">
		<tr>
			<td>S.No</td>
			<td>FIRST NAME</td>
			<td>LAST NAME</td>
			<td>EMAIL</td>
			<td>ROLE</td>
			<td>ACTION</td>
		</tr>
		<c:forEach items="${accounts}" var="account">
			<tr>
				<td>${account.ssn}</td>
				<td>${account.firstName}</td>
				<td>${account.lastName}</td>
				<td>${account.email}</td>
				<td>${account.role}</td>
				<td><a href="editAccount?aid=${account.accountId}">Edit</a> <a
					href="deleteAccount?aid=${account.accountId}"
					onclick="return deleteConfirm()" id="delete"> <c:choose>
							<c:when test="${account.accStatus == 'Activated'}">
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
