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
		<h1>Agregar persona</h1>
		<form action="Controlador">
			ID:<br>
			<input type="text" name="txtDNI"><br>
			Nombres:<br>
			<input type="text" name="txtNom"><br>
			<input type="submit" name="accion" value="Agregar"><br>
			<a href="Controlador?action=listar"> Regresar </a>
		</form>	
	</div>
</body>
</html>