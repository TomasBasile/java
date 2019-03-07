<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

	<%@ page import="java.util.*, java.sql.*, jstlTags.Empleado" %>
	
	<%
	
	ArrayList<Empleado> datos=new ArrayList<>();
	
	Class.forName("com.mysql.jdbc.Driver");
	
	try{
		
		Connection conexion= DriverManager.getConnection("jdbc:mysql://localhost:3306/ejemplo", "root", "Genoma06");
	
		Statement statement = conexion.createStatement();
		
		String instruccionSql="SELECT * FROM empleado";
		
		ResultSet rs=statement.executeQuery(instruccionSql);
		
		while(rs.next()){
			datos.add(new Empleado (rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5)));
		}
		
		rs.close();
		conexion.close();
		
	}catch(Exception e){
		out.println("Ha habido un error");
	}
	
	pageContext.setAttribute("losEmpleados", datos);
	
	
	%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
	.cabecera{
	font-weight:bold;
	}
</style>

</head>
<body>

<table border="1">
	<tr class="cabecera"><td>Nombre</td><td>Apellido</td><td>Puesto</td><td>Salario</td></tr>

	<c:forEach var="EmpTemp" items="${losEmpleados}">
	<tr>
		<td>${EmpTemp.nombre}</td><td> ${EmpTemp.apellido}</td><td> ${EmpTemp.puesto}</td>
		<td><c:if test="${EmpTemp.salario<4000}">${EmpTemp.salario+4000}</c:if>
		<c:if test="${EmpTemp.salario>4000}"> ${EmpTemp.salario}</c:if></td><br>
	</tr>
	</c:forEach>
</table>



</body>
</html>