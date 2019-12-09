<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
<form:form action="save" method="post" modelAttribute="bean">
<h2>Username</h2>
<form:input path="username"></form:input><br>
<h2>Email</h2>
<form:input path="email"></form:input><br>
<h2>Mobile</h2>
<form:input path="mobile"></form:input><br>
<h2> Create Password</h2>
<form:password path="pass"></form:password><br>
<h2>City</h2>
<form:input path="city"></form:input><br>
<input type="submit" value="Save Details">

</form:form>
</body>
</html>