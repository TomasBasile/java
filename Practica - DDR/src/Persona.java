
import java.util.*;

public class Persona {
	private String nombre;
	private int edad;	
	private int DNI;		
	private char sexo;		
	private int peso;
	private double altura;
	
// Contructores
	
public Persona() {
	this.nombre="";
	this.edad=0;
	this.DNI=0;
	this.sexo='H';
	this.peso=0;
	this.altura=0;
}

public Persona(String nombre, int edad, char sexo) {
	this.nombre=nombre;
	this.edad=edad;
	this.DNI=0;
	this.sexo=sexo;
	this.peso=0;
	this.altura=0;
}

public Persona(String nombre, int edad, int DNI, char sexo, int peso, double altura) {
	this.nombre=nombre;
	this.edad=edad;
	this.DNI=DNI;
	this.sexo=sexo;
	this.peso=peso;
	this.altura=altura;
}


//Impresion de datos

public String toString() {
	return "Su nombre es: " + nombre + ", edad: " + edad + ", su DNI: " 
			+ DNI + ", sexo: " + sexo + ", pesa: " + peso + "Kg aproximadamente, y su altura es: " 
			+ altura + " metros.";
}


//Setters y getters

public void setNombre(String nombre) { //Set
	this.nombre=nombre;
}

public void setEdad(int edad) { //Set
	this.edad=edad;
}

public int mayorDeEdad() { //Get
	if(this.edad<18) {
		System.out.println("El sujeto es menor de edad.");
	}else {
		System.out.println("El sujeto es mayor de edad.");
	}
	return edad;
}

public void setDNI(int DNI) { //Set
	this.DNI=DNI;
}

public int randomDNI() { //Get
	this.DNI= (int) (Math.floor(Math.random()*99999999));
	return DNI;
}

public void setSexo(char sexo) { //Set
	this.sexo=sexo;
}

public char sexoCorrecto() { //Get
	if(this.sexo=='H') {
		System.out.println("El individuo es hombre.");
	}else if(this.sexo=='M') {
		System.out.println("El individuo es mujer.");
	}else {
		System.out.println("El caracter es incorrecto.");
	}
	return sexo;
}

public void setPeso(int peso) { //Set
	this.peso=peso;
}

public void setAltura(double altura) { //Set
	this.altura=altura;
}

public int calcularIMC() { //Get
	int indiceMC = (this.peso*((int) Math.pow(altura, 2)));
	if(indiceMC < 20) {
		indiceMC = -1;
	}else if(indiceMC >=20 && indiceMC <= 25) {
		indiceMC = 0;
	}else if(indiceMC >= 25){
		indiceMC = 1;
	}return indiceMC;
	}
}