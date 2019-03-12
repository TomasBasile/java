package prueba_productos;

import java.sql.*;

import java.util.*;


import javax.sql.DataSource;

public class ModeloProductos {
	private DataSource origenDatos;
	
	public ModeloProductos(DataSource origenDatos){
		this.origenDatos=origenDatos;
	}
	
	public List<Productos> getProductos() throws Exception{
		List<Productos> productos=new ArrayList<>();
		Connection miConexion=null;
		Statement miStatement=null;
		ResultSet miResultSet=null;
		
		//----- Establecer conexion -----
		miConexion=origenDatos.getConnection();
		
		//----- Establecer sentencia SQL y Statement -----
		
		String mySql="SELECT * FROM deberia_andar";
		miStatement=miConexion.createStatement();
				
		//----- Ejecutar la sentencia SQL -----
		miResultSet=miStatement.executeQuery(mySql);
		
		//----- Recorrer el ResultSet -----
		
		while(miResultSet.next()) {
			String c_art=miResultSet.getString(1);
			String seccion=miResultSet.getString(2);
			String n_art=miResultSet.getString(3);
			int precio=miResultSet.getInt(4);
			String importado=miResultSet.getString(6);
			String p_orig=miResultSet.getString(7);
		
			Productos tempProd=new Productos (c_art, seccion, n_art, precio, importado, p_orig);
			productos.add(tempProd);
		}
		return productos;
	}

}
