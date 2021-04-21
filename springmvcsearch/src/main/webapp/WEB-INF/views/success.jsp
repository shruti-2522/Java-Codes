<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SUCESS PAGE</title>
</head>
<body>
	<h1>Student Name is:${student.txtname}</h1>
	<h1>Student Id is:${student.txtid}</h1>
	<h1>Student date of birth is:${student.txtdate}</h1>
	<h1>Student course:${student.txtcourse}</h1>
	<h1>Gender:${student.txtradio}</h1>
	<h1>Student type:${student.txttype}</h1>
	<h1>Student address:${student.addr.street}</h1>
	<h1>${student.addr.city}</h1>
</body>
</html>