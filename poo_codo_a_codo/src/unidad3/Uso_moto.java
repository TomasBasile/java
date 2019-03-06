package unidad3;

public class Uso_moto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Motocicleta miMoto=new Motocicleta("2121", "jsdkjaskd");
		System.out.println(miMoto);
		miMoto.arrancar();
		miMoto.acelerar();
		miMoto.acelerar();
		miMoto.frenar();
		miMoto.girar(-1);
		
	}

}
