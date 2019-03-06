package zoologico;

public class Cuidador extends Persona {
	private int cantidadRaciones;
	private boolean alimentaAnimales;
	
		
	public Cuidador (int cantidadRaciones) {
		this.cantidadRaciones=cantidadRaciones;
	}
	
	/*
	public void setCantidadRaciones(int cantidadRaciones) {
		this.cantidadRaciones=cantidadRaciones;
	
	
	public int getCantidadRaciones() {
		return cantidadRaciones;
	}*/
	
	public void alimentarAnimales() {
		if (cantidadRaciones> Zoologico.cantidadRaciones*Zoologico.cantidadAnimales) {
			System.out.println("Se puede alimentar a todos los bichos");
		}else {
			System.out.println("No se puede alimentar a todos los bichos");}
	}
		
	
}	
