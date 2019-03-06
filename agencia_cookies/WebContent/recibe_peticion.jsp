<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

	String ciudad_favorita=request.getParameter("ciudad_favorita"); //Toma el dato de ciudad favorita.

	//Creacion de la cookie
	Cookie nuevaCookie=new Cookie("agencia_viajes.ciudad_favorita", ciudad_favorita);
	//Tiempo de almacenamiento
	nuevaCookie.setMaxAge(365*24*60*60);
	//Enviar al usuario
	response.addCookie(nuevaCookie);

%>
 Gracias por enviar tus datos!
 
 <a href="agencia_viajes.jsp"> Ir a la agencia de viajes </a>


</body>
</html>