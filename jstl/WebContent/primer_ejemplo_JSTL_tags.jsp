<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	String alumnos[]={"Tomas", "Nicolas", "Micaela", "Camila"};
	pageContext.setAttribute("losAlumnos", alumnos);
%>


 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	


	<c:forEach var="tempAlum" items="${losAlumnos}">
		${tempAlum} <br/>
	<-! de esta manera es lo mismo que hacer un for con la etiqueta java ->
	
	</c:forEach>

</body>
</html>