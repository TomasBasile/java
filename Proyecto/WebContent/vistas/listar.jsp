<%@page import="java.util.Iterator"%>
<%@page import="proy.modelo.Persona"%>
<%@page import="java.util.List"%>
<%@page import="proy.modDAO.PersonaDAO"%>
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
			<h1> Personas </h1>
			<a href="Controlador?accion=add">Agregar Nuevo</a>
			<table border="1">
				<thead>
					<tr>
						<th>ID </th>
						<th>DNI</th>
						<th>NOMBRE</th>
						<th>ACCIONES</th>					
					</tr>
				</thead>
				<%
					PersonaDAO dao=new PersonaDAO();
					List<Persona>list=dao.listar();
					Iterator<Persona>iter=list.iterator();
					Persona per = null;
					while(iter.hasNext()){
						per=iter.next();
					%>
				<tbody>
					<tr>
						<td><%= per.getId() %></td>
						<td><%= per.getDni() %></td>
						<td><%= per.getNom() %></td>
						<td>
							<a href="Controlador?accion=editar&id=<%= per.getId()%>">Editar</a>
							<a href="Controlador?accion=eliminar&id=<%= per.getId()%>">Eliminar</a>
						</td>
					</tr>
					<% } %>
				</tbody>
			</table>
		</div>
	</body>
</html>