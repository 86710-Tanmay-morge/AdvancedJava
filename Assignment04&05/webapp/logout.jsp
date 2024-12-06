<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Logout</title>
</head>
<body>
<h2>Thank You</h2>
<% session.invalidate(); %>
<h2>Logged Out Succesfully</h2>
<a href="index.jsp"></a>
</body>
</html>