package zoologico;

public class Zoologico {
	public static final int cantidadAnimales = 25;
	public static final int cantidadRaciones=5;
	private boolean estadoZoologico;
	
		
	public Zoologico() {
		this.estadoZoologico=false;
	}
	
		
	public void setEstadoZoologico(boolean estadoZoologico) {
		this.estadoZoologico=estadoZoologico;
	}
	
	/*
	public boolean getEstadoZoologico() {
		if (this.estadoZoologico = true) {
			System.out.println("El zoologico esta abierto");
		}else {
			System.out.println("El zoologico esta cerrado");
		}
		return estadoZoologico;
	}
	*/
	
	public void abrirZoo() {
		this.estadoZoologico=true;
			System.out.println("El zoologico esta abierto.");
	}
	
	public void cerrarZoo() {
		this.estadoZoologico = false;
			System.out.println("El zoologico esta cerrado.");
	}

	public void alimentarAnimales(int racionesDadas) {
		Cuidador miCuidador=new Cuidador(racionesDadas);
		
	}
	
	}

