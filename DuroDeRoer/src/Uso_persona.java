import java.util.*;

import javax.swing.JOptionPane;

public class Uso_persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		//Creacion del objeto
		Persona miPersona1=new Persona();
		Persona miPersona2=new Persona();
		
		
		//Asignacion de datos		
		
		System.out.println("Ingrese su nombre: ");
		String nombre=sc.nextLine();
		miPersona1.setNombre(nombre);
		
		System.out.println("Ingrese su edad: ");
		int edad=sc.nextInt();
		miPersona1.setEdad(edad);
		
		
		System.out.println("Introduce el sexo (H: hombre - M: mujer");
        char sexo = sc.next().charAt(0);
		miPersona1.setSexo(sexo);
		
		System.out.println("Ingrese su peso: ");
		int peso=sc.nextInt();
		miPersona1.setPeso(peso);
		
		try {
		System.out.println("Ingrese su altura: ");
		double altura=sc.nextDouble();
		miPersona1.setAltura(altura);
		}catch(Exception e) {
			System.out.println("Ha ingresado un dato erroneo.");
		}
		
		//Uso de los getters e impresion de objeto
		miPersona1.randomDNI();
		System.out.println(miPersona1);
		miPersona1.mayorDeEdad();
		miPersona1.sexoCorrecto();
		System.out.print("Se le asigno un IMC correspondiente a: "+ miPersona1.calcularIMC()+"\n");
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
	}

}
