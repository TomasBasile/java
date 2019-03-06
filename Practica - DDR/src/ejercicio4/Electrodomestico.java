package ejercicio4;

public class Electrodomestico {

	//Constantes
	public static final double PRECIO_BASE=100;
	public static final String COLOR_BASE="Blanco";
	public static final char CONSUMO_ENER_BASE='F';
	public static final double PESO_BASE=5;
	
	//Atributos
	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;
	
	//Constructores
	
	
	public Electrodomestico() {
		this(PRECIO_BASE, COLOR_BASE, CONSUMO_ENER_BASE, PESO_BASE);
	}

	public Electrodomestico(double precioBase, double peso) {
		this(precioBase, COLOR_BASE, CONSUMO_ENER_BASE, peso);
	}
	

	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase=precioBase;
		this.peso=peso;
		comprobarColor(color);
		comprobarConsumoEnergetico(consumoEnergetico);
	}
	
	//Metodos (son privados ya que pide que no se vean)
	private void comprobarColor(String color) {
		
		String colores[]= {"blanco", "negro", "rojo", "azul", "gris"};
		boolean encontrado=false;
		
		for(int i=0; i<colores.length && !encontrado; i++ ){
			if(colores[i].equals(color)) {
				encontrado=true;}
		}
		
		if (encontrado) {
			this.color=color;
		}else {
			this.color=COLOR_BASE;
		}
	}
	private void comprobarConsumoEnergetico(char consumoEnergetico) {
		if(consumoEnergetico >= 65 && consumoEnergetico<=70) {
			this.consumoEnergetico=consumoEnergetico;
		}else {
			this.consumoEnergetico=CONSUMO_ENER_BASE;
		}
	}
	
	//Metodos publicos
	public double getPrecioBase() {
		return precioBase;
	}
	public String getColor() {
		return color;
	}
	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}
	public double getPeso() {
		return peso;
	}
	public double precioFinal() {
		double plus=0;
		switch(consumoEnergetico) {
		case 'a':
			plus+=100;
			break;
		case 'b':
			plus+=80;
			break;
		case 'c':
			plus+=60;
			break;
		case 'd':
			plus+=50;
			break;
		case 'e':
			plus+=30;
			break;
		case 'f':
			plus+=10;
			break;
		}
	if (peso>0 && peso<=19) {
		plus+=10;
	}else if (20<peso && peso<49) {
		plus+=50;
	}else if (50<peso && peso<79) {
		plus+=80; 
	}else if (80<peso) {
		plus+=100;
	} 
	
	return precioBase+plus;
	}

}
	
	
	
	
	
	
	
	
	
	
	
	