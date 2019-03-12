package prueba_productos;

public class Productos {
	
	public Productos(String cArt, String seccion, String nArt, int precio, String importado, String pOrig) {
		this.cArt = cArt;
		this.seccion = seccion;
		this.nArt = nArt;
		this.precio = precio;
		this.importado = importado;
		this.pOrig = pOrig;
}
	
	public Productos(String seccion, String nArt, int precio, String importado, String pOrig) {
		this.seccion = seccion;
		this.nArt = nArt;
		this.precio = precio;
		this.importado = importado;
		this.pOrig = pOrig;
}
	
	
	public String getcArt() {
		return cArt;
	}

	public void setcArt(String cArt) {
		this.cArt = cArt;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	public String getnArt() {
		return nArt;
	}

	public void setnArt(String nArt) {
		this.nArt = nArt;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getImportado() {
		return importado;
	}

	public void setImportado(String importado) {
		this.importado = importado;
	}

	public String getpOrig() {
		return pOrig;
	}

	public void setpOrig(String pOrig) {
		this.pOrig = pOrig;
	}

	@Override
	public String toString() {
		return "Productos [cArt=" + cArt + ", seccion=" + seccion + ", nArt=" + nArt + ", precio=" + precio
				+ ", importado=" + importado + ", pOrig=" + pOrig + "]";
	}


	private String cArt;
	private String seccion;
	private String nArt;
	private	int precio;
	private String importado;
	private String pOrig;
	
}
