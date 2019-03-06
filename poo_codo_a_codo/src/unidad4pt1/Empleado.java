package unidad4pt1;

public class Empleado {
	private String nombre;
	private String apellido;
	private int dni;
	private String direccion;
	private int antiguedad; //no necesario
	private int telefono;
	private double salario;
	private String supervisor;
	
	public Empleado(){}
	
	public Empleado(String nombre, String apellido, int dni, String direccion) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.dni=dni;
		this.direccion=direccion;
		this.supervisor=null;
		this.antiguedad=0;
	}
	
	public Empleado(String nombre, String apellido, int dni, String direccion, int antiguedad, int telefono, int salario) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.dni=dni;
		this.direccion=direccion;
		this.antiguedad=antiguedad;
		this.telefono=telefono;
		this.salario=salario;
		this.supervisor=supervisor;
	}

	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public int getDni() {
		return dni;
	}
	
	/*public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion=direccion;
	}
	
	public int getAntiguedad() {
		return antiguedad;
	}
	
	public void setAntiguedad(int antiguedad) {
		this.antiguedad=antiguedad;
	}
	*/
	
	public int getTelefono() {
		return telefono;
	}
	
	/*
	public void setTelefono(int telefono) {
		this.telefono=telefono;
	}
	*/
	
	public double getSalario() {
		return salario;
	} 
	
	/*
	public void setSalario(double salario) {
		this.salario=salario;
	}*/
	
	public void setSupervisor(String supervisor) {
		this.supervisor=supervisor;
	}
	
}
/*Falta ingresar quien lo supervisa
*y ademas hacer que cambie el supervisor*/