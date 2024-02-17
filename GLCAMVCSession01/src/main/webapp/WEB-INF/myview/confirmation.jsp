<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="aqua">
<center>
<!-- 
String passengerName; 
	String address;
	int age; 
	String gender; 
	int numberOfTickets; 
	String sourceCity;
	String destinationCity; 
	String dateOfJourney; 
	String[] preferences;
	String classOfJourney;
 -->
<h2>Confirm Your Reservation Details and Proceed to Payments Page</h2>
<table border="2">
	<tr>
		<th>Passenger Name</th>
		<td>${confreservation.passengerName}</td>
	</tr>
	<tr>
		<th>Address</th>
		<td>${confreservation.address}</td>
	</tr>
	<tr>
		<th>Age </th>
		<td>${confreservation.age}</td>
	</tr>
	<tr>
		<th>Gender</th>
		<td>${confreservation.gender}</td>
	</tr>
	<tr>
		<th>No. of Tickets</th>
		<td>${confreservation.numberOfTickets}</td>
	</tr>
	<tr>
		<th>Source City</th>
		<td>${confreservation.sourceCity}</td>
	</tr>
	<tr>
		<th>Destination City</th>
		<td>${confreservation.destinationCity}</td>
	</tr>
		<tr>
		<th>Date Of Journey</th>
		<td>${confreservation.dateOfJourney}</td>
	</tr>
	<tr>
		<th>Preferences</th>
		<td>
			${confreservation.preferences[0]} 
			${confreservation.preferences[1]} 
			${confreservation.preferences[2]} 
			${confreservation.preferences[3]} 
			${confreservation.preferences[4]} 	
				
		</td>
	</tr>
	<tr>
		<th>Class Of Journey</th>
		<td>${confreservation.classOfJourney}</td>
	</tr>
<a href="/GLCAMVCSession01/hello/greet">Go Back To Home Page</a>

</table>
</center>
</body>
</html>