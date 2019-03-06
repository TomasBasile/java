/*Crear libro que tenga ISBN, tit,Aut,nro pag,
 * mostrar el titulo ISBN autor y paginas
 * crear 2 objetos libro y mostrar en pantalla cual de los 2 tiene mas paginas
 */
public class Libro {

	private int ISBN;
	private String titulo;
	private String autor;
	private int paginas;
	
public Libro() {
	this.ISBN=ISBN;
	this.titulo=titulo;
	this.autor=autor;
	this.paginas=paginas;
}

public String toString() {
	return "El ISBN es: " +ISBN+ ", el titulo del libro es: "+ titulo+
			", su autor es: " + autor + " y posee: "+paginas+" paginas.";
}

public void ISBN (int ISBN) {
	this.ISBN=ISBN;
}

/*public String GetISBN() {
	return "El ISBN es" + ISBN;
}*/

public void titulo (String titulo) {
	this.titulo=titulo;
}

public void autor(String autor) {
	this.autor=autor;
}

public void paginas(int paginas) {
	this.paginas=paginas;
}


}
