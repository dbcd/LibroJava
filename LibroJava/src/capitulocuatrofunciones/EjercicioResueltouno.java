package capitulocuatrofunciones;

import java.util.Scanner;

/* Diseñar la función  eco() a la que se le pasa como parámetro un número n , y muesrtra
 * por pantalla n veces el mensaje.*/
public class EjercicioResueltouno {

	static void eco(int numero) {
		for (int i = 0; i < numero; i++) {
			System.out.println("ecooooooo");
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("insertar numero ");
		int numero = sc.nextInt();
		
		eco(numero);
		
	}
	
	
	
}
