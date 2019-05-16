package proy.controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import proy.modDAO.PersonaDAO;
import proy.modelo.Persona;

/**
 * Servlet implementation class Controlador
 */
@WebServlet("/Controlador")
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
    String listar = "vistas/listar.jsp";
    String add = "vistas/add.jsp";
    String edit = "vista/edit.jsp";
    Persona p = new Persona();
    PersonaDAO dao = new PersonaDAO();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String acceso = "";
		String action = request.getParameter("accion");
		if(action.equalsIgnoreCase("listar")) {
			acceso = listar;
			
		}else if(action.equalsIgnoreCase("add")){
			acceso = add;
			
		}else if(action.equalsIgnoreCase("Agregar")){
			String dni=request.getParameter("txtDNI");
			String nom=request.getParameter("txtNom");
			p.setDni(dni);
			p.setNom(nom);
			dao.add(p);
			acceso=listar;
			
		}else if(action.equalsIgnoreCase("edit")){
			request.setAttribute("idper", request.getParameter("id"));
			acceso=edit; 
			
		}else if(action.equalsIgnoreCase("Actualizar")){
			int id = Integer.parseInt(request.getParameter("txtid"));
			String dni=request.getParameter("txtDNI");
			String nom=request.getParameter("txtNom");
			p.setId(id);
			p.setDni(dni);
			p.setNom(nom);
			dao.add(p);
			acceso=listar;
		}else if(action.equalsIgnoreCase("eliminar")){
			int id = Integer.parseInt(request.getParameter("id"));
			p.setId(id);
			dao.eliminar(id);
			acceso=edit; 
			
		}
		
		RequestDispatcher vista = request.getRequestDispatcher(acceso);
		vista.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
