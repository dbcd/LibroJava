package capitulocuatrofunciones;

import java.util.Scanner;

/*Realizar  una función que calcule y muestre el area o volumen de un cilindro
 * según se especifique.Para distinguir un caso de otro se le pasará un número1 (área)
 * o 2 (para el volumen).Además hemos de pasarle a la función el radio de la base y la altura.
 *  area=2pi x (altura + radio)
 *  volumen = pi X radio x radio X altura*/
public class EjercicioResueltotres {

	static double area(int altura, int radio) {
		//area=2pi x (altura + radio)
		double area=2*(Math.PI)*(altura+radio);
		
		
		return area;
	}
	static double volumen(int altura, int radio) {
		 //volumen = pi X radio x radio X altura
		double volumen=Math.PI*Math.pow(radio, 2)*altura;
		
		
		return volumen;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("insertar altura ");
		int a  = sc.nextInt();
		System.out.println("insertar radio ");
		int b  = sc.nextInt();
		System.out.println("elige una opcion "+"\n Pulsa 1 para calcular area "+"\n pulsa 2 para calcular volumen");
		
		int op=sc.nextInt();
		
		switch (op) {
		case 1:
			System.out.println(area(a, b));
			break;
         case 2:
			System.out.println(volumen(a, b));
			break;
		default:
			break;
		}
		
		
		
	
		
	}
	
}
