<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="Beans.FlightBooking"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Business Class Check In</h1>
<jsp:useBean id="voyageurs" scope="application" class="Beans.FlightBooking"/>


  <%

  out.print( "Les voyageurs : " +voyageurs.checkIn() );
  %>
 
</body>
</html>