<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>
	<%
	String name = (String) request.getAttribute("name");
	Integer id = (Integer) request.getAttribute("id");
	LocalDateTime time=(LocalDateTime) request.getAttribute("time");
	%>

	<h1>
		My Name is:
		<%=name%></h1>
	<h1>This is Help Page</h1>

	<h1>
		Id:
		<%=id%></h1>
		
		<h2>Time is: <%= time %></h2>
</body>
</html>