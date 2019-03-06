package ejercicio4;

public class Television extends Electrodomestico {
	
	//Constantes
	public static final int RESOLUCION_DEF=5;
	
	
	//Atributos
	private int resolucion;
	private boolean sintonizador_tdt;
	
	//Constructores
	
	public Television(){
        this(PRECIO_BASE, PESO_BASE, CONSUMO_ENER_BASE, COLOR_BASE, RESOLUCION_DEF, false);
    }

	public Television(double precioBase, double peso) {
		this(precioBase, peso, CONSUMO_ENER_BASE, COLOR_BASE, RESOLUCION_DEF, false);
	}
	//Debe seguir el orden del constructor de la superclase
	public Television(double precioBase, double peso, char consumoEnergetico, String color, int resolucion,
			boolean sintonizador_tdt) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion=resolucion;
		this.sintonizador_tdt=sintonizador_tdt;
	}



	//Metodos
	public int getResolucion() {
		return resolucion;
	}
	
	public boolean getSintonizadorTDT() {
		return sintonizador_tdt;
	}
	
	public double precioFinal() {
		double plus=super.precioFinal();
		if (resolucion>40) {
			plus+= precioBase*0.3;
		}		
		if (sintonizador_tdt) {
			plus+=50;
		}
		return plus;
	}
	
	
}

