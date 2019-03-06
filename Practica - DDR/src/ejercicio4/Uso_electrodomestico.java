package ejercicio4;

public class Uso_electrodomestico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Electrodomestico[] miElectrodomestico=new Electrodomestico[5];
	
	miElectrodomestico[0]=new Electrodomestico(231, "azul", 'a', 2220);
	miElectrodomestico[1]=new Television(20, 5);
	miElectrodomestico[2]=new Lavadora(2, 200, 'b', "blanco", 30);
	miElectrodomestico[3]=new Electrodomestico();
	miElectrodomestico[4]=new Television(500, 20, 'f', "negro", 50, false);
	
	double sumaElectrodomesticos=0;
    double sumaTelevisiones=0;
    double sumaLavadoras=0;
	
	
	for(int i=0;i<miElectrodomestico.length;i++){
		 if(miElectrodomestico[i] instanceof Electrodomestico){
             sumaElectrodomesticos+=miElectrodomestico[i].precioFinal();
         }
         if(miElectrodomestico[i] instanceof Lavadora){
             sumaLavadoras+=miElectrodomestico[i].precioFinal();
         }
         if(miElectrodomestico[i] instanceof Television){
             sumaTelevisiones+=miElectrodomestico[i].precioFinal();
         }
	
	
		}
	
	System.out.println("La suma del precio de los electrodomesticos es de "+sumaElectrodomesticos);
    System.out.println("La suma del precio de las lavadoras es de "+sumaLavadoras);
    System.out.println("La suma del precio de las televisiones es de "+sumaTelevisiones);


	
	}
}