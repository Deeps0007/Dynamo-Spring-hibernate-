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
<center>
<h2>Vendor Registration</h2><hr>
<form:form action="save_vendor" method="post" modelAttribute="bean">
Vendor Name
&nbsp&nbsp&nbsp<form:input path="vname"/><br><br>
Vendor Email
&nbsp&nbsp&nbsp&nbsp<form:input path="vemail"/><br><br>
Create password
<form:password path="pass"/><br><br>
Mobile&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<form:input path="mob"/><br><br>
State&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<form:input path="state"/><br><br>
City&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<form:input path="city"/><br><br>
PinCode&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<form:input path="pin"/><br><br>
<br><br>
<input type="submit" value="Save Details">

</form:form>
</center>

</body>
</html>