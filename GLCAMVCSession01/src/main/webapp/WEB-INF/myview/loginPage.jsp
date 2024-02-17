<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body  bgcolor="aqua">

<center>
<form:form action="/GLCAMVCSession01/login/validateLogin" method="post" modelAttribute="login">

Enter Login Id <form:input path="loginId"/> 
Enter password <form:password path="password"/>

<input type="submit" value="Login" />

</form:form>
</center>
</body>
</html>