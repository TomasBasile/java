
public class Cuentas {

	private final String titularidad; //Atributos
	private double cantidad;
	
	public Cuentas(String nom, double cantidad) { //Constructor
		titularidad=nom;
		this.cantidad=cantidad;
		
		if (cantidad<0) {
			this.cantidad=0;
		}else{
			this.cantidad=cantidad;
		}
	}
	
	public Cuentas(String nom) { //Constructor
		this(nom, 0);
	}
	
	//metodos
	public String dameNombre() { //Getter
		return titularidad;
	}
	
	/*public void estableceTitular(String nom){ //Setter
		titularidad=nom;
	}*/
	
	public double dameCantidad() { //Getter
		return cantidad;
	}
	
	public void estableceCantidad(double cantidad) {//setter
		this.cantidad=cantidad;
	}
	
	public void ingresa(double cantidad) {
		this.cantidad+=cantidad;
	}
	
	public void quita(double cantidad) {
		if(this.cantidad<0) {
			this.cantidad=0;
		}else{
			this.cantidad-=cantidad;
		}
	}
	
	public String datos_generales() {
		return "El nombre del cliente es: " + titularidad + " y posee: "+
				cantidad;
	}

}
