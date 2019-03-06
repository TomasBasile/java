import javax.swing.*;
public class Uso_libro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Libro miLibro=new Libro();
	miLibro.ISBN(2232);	
	miLibro.autor(JOptionPane.showInputDialog("Ingrese autor:"));
	miLibro.titulo(JOptionPane.showInputDialog("Ingrese el titulo del libro: "));
	miLibro.paginas(566);
	System.out.println(miLibro);
	}

}
