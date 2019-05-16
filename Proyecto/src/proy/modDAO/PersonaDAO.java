package proy.modDAO;

import proy.config.Conexion;
import proy.interfaces.CRUD;
import proy.modelo.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

public class PersonaDAO implements CRUD{
	Conexion cn = new Conexion();
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	Persona p = new Persona();

	@Override
	public List listar() {
		ArrayList<Persona>list = new ArrayList();
		String sql = "SELECT * FROM persona";
		try {
			con = cn.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				Persona per = new Persona();
				per.setId(rs.getInt("Id"));
				per.setDni(rs.getString("DNI"));
				per.setNom(rs.getString("Nombres"));
				list.add(per);
			}
		}catch (Exception e) {
			System.out.println("HOLA PERSONA DAO");
		}
		return list;
	}

	@Override
	public Persona list(int id) {
		String sql = "SELECT * FROM persona WHERE id="+id;
		try {
			con = cn.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				Persona per = new Persona();
				p.setId(rs.getInt("Id"));
				p.setDni(rs.getString("DNI"));
				p.setNom(rs.getString("Nombres"));
			}
		}catch (Exception e) {
			System.out.println("HOLA PERSONA DAO");
		}
		return null;
	}

	@Override
	public boolean add(Persona per) {
		String sql = "insert into persona(DNI,Nombres) values('"+per.getDni()+"','"+per.getNom()+"')";
		try {
			con = cn.getConnection();
			ps = con.prepareStatement(sql);
			ps.executeUpdate();
		}catch (Exception e){
			
		}
		return false;
	}

	@Override
	public boolean edit(Persona per) {
		String sql = "update persona set DNI= '"+per.getDni()+"',Nombres='"+per.getNom()+"' where id="+per.getId();
		try {
			con=cn.getConnection();
			ps=con.prepareStatement(sql);
			ps.executeUpdate();
		}catch(Exception e) {
			
		}
		return false;
	}

	@Override
	public boolean eliminar(int id) {
		String sql = "DELETE FROM persona WHERE Id=" +id;
		try {
			con=cn.getConnection();
			ps=con.prepareStatement(sql);
			ps.executeUpdate();
		}catch(Exception e) {
			
		}
		return false;
	}
	

}
