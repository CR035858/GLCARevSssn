<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="lightgreen">
<center>
<h2>Welcome to Train Details Page!!!</h2>

<table border="2">
<tr>
	<th>Train ID</th>
	<th>Train Name</th>
	<th>Source City</th>
	<th>Destination</th>
	<th>Route No</th>
	<th>Distance(Kms)</th>
</tr>
<c:forEach items="${trains}" var="train">
<tr>
	<td>${train.trainId}</td>
	<td>${train.trainName}</td>
	<td>${train.sourceCity}</td>
	<td>${train.destinationCity}</td>
	<td>${train.routeNo}</td>
	<td>${train.distanceInKms}</td>
</tr>

</c:forEach>
</table>
<a href="/GLCAMVCSession01/hello/greet">Go Back To Home Page</a>
</center>
</body>
</html>