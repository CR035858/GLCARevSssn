<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
<center> 
<h2>Welcome to Products Details Page!!!</h2>
<table border="2">
<tr>
<th>Product Id</th>
<th>Product Name</th>
<th>Product Price</th>
<th>Product Category</th>
<th>Quantity In Stock</th>
</tr>

<c:forEach items="${products}" var="product">
<tr>
	<td>${product.productId}</td>
	<td>${product.productName}</td>
	<td>${product.productCategory}</td>
	<td>${product.pricePerUnit}</td>
	<td>${product.quantityOnHand}</td>
</tr>
</c:forEach>


</table>
<a href="/GLCAMVCSession01/hello/greet">Go Back To Home Page</a>
</center>
</body>
</html>