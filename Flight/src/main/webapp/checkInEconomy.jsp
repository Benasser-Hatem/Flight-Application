<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="voyageurs" scope="application" class="Beans.FlightBooking"/>

<h1>Economy Class Check In</h1>
  <%

  out.print( "Les voyageurs : " +voyageurs.checkIn() );
  %>
 
 
</body>
</html>