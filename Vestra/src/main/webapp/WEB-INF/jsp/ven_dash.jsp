<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
    <%@taglib  prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashbord</title>
</head>
<body>
<form:form action="#" method="post" modelAttribute="bean">
<center><h3> hello {$name} </h3></center><hr>
<h3><a href="add_service">Add Services</a></h3>
<h3><a href="view_service">View Your Services</a></h3>
<h3><a href="orders">Your orders</a></h3>
</form:form></body>
</html>


