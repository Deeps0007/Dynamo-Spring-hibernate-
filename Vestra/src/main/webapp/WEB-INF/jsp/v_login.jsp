<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
     <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Vendor Login</title>
</head>

<body>
<center>
<form:form action="vendor_login" method="post" modelAttribute="bean">
<h2>${msg}</h2>
<h2>${error }</h2>
<h1>Vendor Login</h1><br>
<h3>Email Id</h3>
<form:input path="vemail"/><br>
<h3>Password</h3><br>
<form:password path="pass"/><br><br>
Don't have an account or <a href="goregis">Create account</a>.
<input type="submit" value="submit">
</form:form>
</center>
</body>
</html>