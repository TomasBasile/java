package unidad3;

public class Disquera {
	private String titulo;
	private String autor;
	private int a�oEdicion;
	private String formato;
	private boolean digital;

	public Disquera() {
		this.titulo=titulo;
		this.autor=autor;
		this.a�oEdicion=a�oEdicion;
		this.formato=formato;
		this.digital=digital;
	}
	
	public String toString() {
		return "El titulo es: " + titulo + " de la banda: " + autor +
				" editado en el a�o: " + a�oEdicion + " en formato: " +
				formato + " existe digital: " + digital;
	}

	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	
	public void setAutor(String autor) {
		this.autor=autor;
	}
	
	public void setEdicion(int a�oEdicion) {
		this.a�oEdicion=a�oEdicion;
	}
	
	public void setFormato(String formato) {
		this.formato=formato;
	}
	
	public void setDigital(boolean digital) {
		this.digital=digital;
	}
	
}
