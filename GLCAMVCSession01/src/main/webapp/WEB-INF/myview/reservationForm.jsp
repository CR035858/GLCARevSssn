<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="aqua">
<center>
<h1>Welcome To The Train Reservation Page!!!</h1>

<form:form action="/GLCAMVCSession01/reservation/process" modelAttribute="reservation"> 

<table border="2">
	<tr><td colspan="2">Enter Reservation Details</td></tr>
	<tr>
		<td>Passenger Name :</td>
		<td><form:input path="passengerName"/></td>
	</tr>
	<tr>
		<td>Address :</td>
		<td><form:textarea path="address"/></td>
	</tr>
		<tr>
		<td>Age :</td>
		<td><form:input path="age"/></td>
	</tr>
	<tr>
		<td>Gender :</td>
		<td>
			Male : <form:radiobutton path="gender" value="Male"/>
			FeMale : <form:radiobutton path="gender" value="Female"/>
		</td>
	</tr>
	<tr>
		<td>No. Of Tickets :</td>
		<td><form:input path="numberOfTickets"/></td>
	</tr>
	<tr>
		<td>Select Source City :</td>
		<td>
			<form:select path="sourceCity">
				<form:option value="Bangalore" label="Bangalore.."></form:option>
				<form:option value="Hyderabad" label="Hyderabad"></form:option>
				<form:option value="Chennai" label="Chennai"></form:option>
				<form:option value="Mumbai" label="Mumbai"></form:option>
				<form:option value="Kolkata" label="Kolkata"></form:option>
				<form:option value="Mangalore" label="Mangalore"></form:option>
			</form:select>
		</td>
	</tr>
	<tr>
		<td>Select Destination City :</td>
		<td>
			<form:select path="destinationCity">
				<form:option value="Bangalore" label="Bangalore"></form:option>
				<form:option value="Hyderabad" label="Hyderabad"></form:option>
				<form:option value="Chennai" label="Chennai"></form:option>
				<form:option value="Mumbai" label="Mumbai"></form:option>
				<form:option value="Kolkata" label="Kolkata"></form:option>
				<form:option value="Mangalore" label="Mangalore"></form:option>
			</form:select>
		</td>
	</tr>
	<tr>
		<td>Date Of Journey</td>
		<td><form:input path="dateOfJourney"/></td>
	</tr>
	</tr>
	<tr>
		<td>Choose Your Preferences</td>
		<td>
			Smoking : <form:checkbox path="preferences" value="Smoking" />
			NoSmoking : <form:checkbox path="preferences" value="NoSmoking" />
			Vegetarian : <form:checkbox path="preferences" value="Vegetarian" />
			NonVegatarian : <form:checkbox path="preferences" value="NonVegatarian" />
			Wifi : <form:checkbox path="preferences" value="Wifi" />
		</td>
	</tr>
	<tr>
		<td>Class Of Journey</td>
		<td>
			IClass <form:radiobutton path="classOfJourney" value="IClass"/>
			IClass AC <form:radiobutton path="classOfJourney" value="IClass AC "/>
			IIClass <form:radiobutton path="classOfJourney" value="IIClass"/>
			IIClass AC <form:radiobutton path="classOfJourney" value="IIClass AC"/>
		</td>
	</tr>
	<tr>
		<td><input type="Submit" value="ReserveTicket" /></td>
		<td><input type="Reset" value="ReSet" /></td>
	</tr>

</table>
</form:form>

</center>

</body>
</html>