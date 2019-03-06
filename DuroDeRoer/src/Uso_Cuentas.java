import javax.swing.*;
public class Uso_Cuentas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Cuentas cuenta1=new Cuentas("Tomas");
	Cuentas cuenta2=new Cuentas("Micaela", 0);
	
	cuenta1.ingresa(500);
	cuenta2.ingresa(600);
	cuenta1.quita(200);
	cuenta2.quita(700);
	
	System.out.println(cuenta1.datos_generales());
	System.out.println(cuenta2.datos_generales());
	}

}
