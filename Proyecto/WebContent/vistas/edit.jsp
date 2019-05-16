<%@page import="proy.modDAO.PersonaDAO"%>
<%@page import="proy.modelo.Persona"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<%
			PersonaDAO dao=new PersonaDAO(); 
			int id=Integer.parseInt((String)request.getAttribute("idper"));
			Persona p = (Persona)dao.list(id);
		%>

		<h1>Modificar persona</h1>
		<form action="Controlador">
			ID:<br>
			<input type="text" name="txtDNI" value="<%= p.getDni() %>"><br>
			Nombres:<br>
			<input type="text" name="txtNom" value="<%= p.getNom() %>"><br>
			<input type="hidden" name="txtid" value="<%= p.getId() %>">
			<input type="submit" name="accion" value="Actualizar"><br>
			<a href="Controlador?action=listar"> Regresar </a>
		</form>	
	</div>
</body>

</html>