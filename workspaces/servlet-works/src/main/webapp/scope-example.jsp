<%@page import="com.naveen.beans.Login"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	String name = "Naveen Kumar"; 
	
	pageContext.setAttribute("name", name); 
	request.setAttribute("name", "Harashit"); 
	session.setAttribute("name", "Sushruth"); 
	application.setAttribute("name", "Aneesha"); 
	
	Login login = new Login();
	login.setUserName("india"); 
	login.setPassword("sapient"); 
	
	request.setAttribute("LOGIN", login); 
	
%>


<div> 
	UserName : ${LOGIN.userName } <br>
	password : ${LOGIN.password } <br>
</div>

<hr /> 

<h3>Hello (Page Scope) : ${name} </h3>
<h3>Hello (Request Scope) : ${requestScope.name} </h3>
<h3>Hello (Session Scope) : ${sessionScope.name} </h3>
<h3>Hello (Context Scope) : ${applicationScope.name} </h3>


<form action="">
	<input type="text" name="name">
</form>


<h3>Hello : ${param.name==null? "UnKnown" :param.name }</h3>




















</body>
</html>