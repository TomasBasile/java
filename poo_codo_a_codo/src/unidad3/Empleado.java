package unidad3;

public class Empleado {
	private String nombre;
	private String cedula;
	private int edad;
	private boolean casado;
	private double salario;
	private String clasificacion;
	
	
public Empleado() {
	this.nombre= "";
	this.cedula= "";
	this.edad= 22;
	this.casado=true;
	this.salario=salario;
	}

public Empleado(String nombre, String cedula, int edad, boolean casado, double salario) {
	this.nombre=nombre;
	this.cedula=cedula;
	this.edad=edad;
	this.casado=casado;
	this.salario=salario;
}

public String clasificacion() { //getter
	if(this.edad<=21) {
		clasificacion="Principiante";
	}else if(this.edad>21 && this.edad<=35){
		clasificacion="Intermedio";
	}else if(this.edad>35) {
		clasificacion="Senior";
	} return clasificacion;
}

public String toString() {
	return "Su nombre es: "+nombre+" cedula:  " + cedula + ", edad: " + edad +
			" estado civil; " + casado + " salario: " + salario + clasificacion;
}

public void aumentoSalario(double porcentajeAumento) { //Setter
	this.salario+= this.salario * porcentajeAumento/100;
}



}
