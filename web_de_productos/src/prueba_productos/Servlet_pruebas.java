package prueba_productos;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.Statement;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.*;



/**
 * Servlet implementation class Servlet_pruebas
 */
@WebServlet("/Servlet_pruebas")
public class Servlet_pruebas extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//Definir o establecer el DataSource.
	
	@Resource(name="jdbc/deberia_andar")
	private DataSource miPool;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_pruebas() {
        super();
        // TODO Auto-generated constructor stub
    
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//	response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//Crear el objeto PrintWriter.
		PrintWriter salida=response.getWriter();
		response.setContentType("text/plain");
		
		//Crear conexion con BBDD.
		Connection miConexion=null;
		Statement miStatement=null;
		ResultSet miResultSet=null;
		
		
		  try {
		  //Pool de conexiones con la base de datos.
		  miConexion=miPool.getConnection(); 
		  String mySql= "SELECT * FROM deberia_andar";
		  miStatement=miConexion.createStatement();
		  miResultSet=miStatement.executeQuery(mySql); 
		  
		  while(miResultSet.next()) {
			  String nombre_articulo=miResultSet.getString(3);
			  salida.println(nombre_articulo); 
			  } 
		  }catch(Exception e){ 
			  e.printStackTrace();
		  }

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
