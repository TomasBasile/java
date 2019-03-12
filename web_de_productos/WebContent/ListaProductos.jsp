<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
	<style>
		.cabecera{
		font-weight:bold;
		}
	</style>

<body>
	
	<table border="1">
	
	<tr class="cabecera">
	<td>C�digo Art�culo</td>
	<td>Secci�n</td>
	<td>Nombre Art�culo</td>
	<td>Precio</td>
	<td>Importado</td>
	<td>Pa�s de Origen</td>
	</tr>
	
	<c:forEach var="tempProd" items="${listaDeProductos}">
	<tr>
	<td>${tempProd.cArt}</td>
	<td>${tempProd.seccion}</td>
	<td>${tempProd.nArt}</td>
	<td>${tempProd.precio}</td>
	<td>${tempProd.importado}</td>
	<td>${tempProd.pOrig}</td>
	</tr>	
	</c:forEach>
	
	</table>

</body>
</html>