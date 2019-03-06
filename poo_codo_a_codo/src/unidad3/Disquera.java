package unidad3;

public class Disquera {
	private String titulo;
	private String autor;
	private int añoEdicion;
	private String formato;
	private boolean digital;

	public Disquera() {
		this.titulo=titulo;
		this.autor=autor;
		this.añoEdicion=añoEdicion;
		this.formato=formato;
		this.digital=digital;
	}
	
	public String toString() {
		return "El titulo es: " + titulo + " de la banda: " + autor +
				" editado en el año: " + añoEdicion + " en formato: " +
				formato + " existe digital: " + digital;
	}

	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	
	public void setAutor(String autor) {
		this.autor=autor;
	}
	
	public void setEdicion(int añoEdicion) {
		this.añoEdicion=añoEdicion;
	}
	
	public void setFormato(String formato) {
		this.formato=formato;
	}
	
	public void setDigital(boolean digital) {
		this.digital=digital;
	}
	
}
