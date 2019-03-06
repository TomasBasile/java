package ejercicio4;

public class Lavadora extends Electrodomestico {
	public static final int CARGA_BASE=5;
	private int carga; 
	
	//Constructores
	
	public Lavadora() {
		this(PRECIO_BASE, PESO_BASE, CONSUMO_ENER_BASE, COLOR_BASE, CARGA_BASE);
	}
	
	public Lavadora(double precioBase, double peso) {
		 this(precioBase, peso, CONSUMO_ENER_BASE, COLOR_BASE, CARGA_BASE);
		//TODO Auto-generated constructor stub
	}

	public Lavadora(double precioBase, double peso, char consumoEnergetico, String color, int carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga=carga;
		// TODO Auto-generated constructor stub
	}

	// Metodos
	public int getCarga() {
		return carga;
	}
	
		
	public double precioFinal() {
		double plus=super.precioFinal();
		if(carga>30) {
			plus+=50;
		}return plus;
	}
}
