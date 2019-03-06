package unidad3;

public class Uso_empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado miEmpleado1=new Empleado("Tomas Basile", "2221213", 22, false, 21321);
		Empleado miEmpleado2=new Empleado();
		System.out.println(miEmpleado1);
		miEmpleado1.aumentoSalario(5);
		System.out.println(miEmpleado1);
		
		System.out.println(miEmpleado2);
		
	}

}
