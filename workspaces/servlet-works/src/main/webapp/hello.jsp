<%@page import="com.naveen.beans.Login"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Welcome to JSP</h2>
	<%
		// is called as scriptlet 
		Date date = new Date(); 
		// there implicit objects which JSP will create for you 
		out.println("Date is " +  date.toGMTString());  
		Login login = new Login(); 
	%>
</body>
</html>