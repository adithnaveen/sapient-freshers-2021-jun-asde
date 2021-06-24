<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"  %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="sap"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>All Logins Goes Here...</h1>
	<table>

		<thead>
			<tr>
				<th>User Name</th>
				<th>Password</th>
			<tr>
		</thead>
		<tbody>
			
			<sap:forEach items="${requestScope.logins}" var="login" >
				<tr>
					<td>${login.userName }</td>
					<td>${login.password }</td>
				</tr>
			</sap:forEach>
		</tbody>
	</table>
</body>
</html>