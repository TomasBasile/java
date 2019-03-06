package zoologico;
import java.util.*;

public class Persona {
	private String nombre;
	private Date fechaNacimiento;
	
	public Persona() {}
	
 	public Persona(String nombre, int año, int mes, int dia) {
		this.nombre=nombre;
		GregorianCalendar calendario=new GregorianCalendar(año, mes-1, dia);
		fechaNacimiento=calendario.getTime();
	}

	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void getFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento=fechaNacimiento;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	
}
