package unidad3;

public class Motocicleta {
	private String matricula;
	private String color;
	private int velocidad;
	private boolean en_marcha;
	

	public Motocicleta(String matricula, String color) {
		this.matricula=matricula;
		this.color=color;
		velocidad=0;
		en_marcha=false;
		
	}
	
	public String toString() {
		return "La matricula es: " + matricula + " y el color: " + color;
	}
	
	public void arrancar() { //Set
		en_marcha = true; 
			System.out.println("La moto esta encendida.");
	}
	
	public void acelerar() { //set
		if(en_marcha == true) {
			velocidad++;
			System.out.println("Su velocidad es: " + velocidad);
		}
	}
			
	public void frenar() { //set
		if(velocidad>0) {
			velocidad--;
			System.out.println("La velocidad de la moto es:" + velocidad);
		}else {
			System.out.println("La moto se freno");
		}
	}
	
	public void girar(int giro) {
		switch (giro) {
			case -1:
				System.out.println("Giro a la izquierda");
				break;
			case 1:
				System.out.println("Giro a la derecha");
				break;
			case 0:
				System.out.println("Sigo derecho");
				break;
			default:
				System.out.println("Movimiento no permitido");
			}
	}
	
	




}

