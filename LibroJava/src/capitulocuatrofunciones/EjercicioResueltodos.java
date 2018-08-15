package capitulocuatrofunciones;

import java.util.Scanner;

/* Escribir una función a la que se le pasen dos enteros y muestre todos los números c
 * comprendidos entre  ellos.*/

public class EjercicioResueltodos {
	
	static void comprendidosNumeros(int a, int b) {
		for (int i = a; i < b; i++) {
			System.out.println(i);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("insertar numero a ");
		int a  = sc.nextInt();
		System.out.println("insertar numero b ");
		int b  = sc.nextInt();
		comprendidosNumeros(a, b);
		
	}
}