package capitulocuatrofunciones;

import java.util.Scanner;

/*Diseñar la función calculadora, a la que se le pasan dos números enteros(operandos) y que se desea realizar con ellos.Las operaciones 
 *  disponibles son : sumar , restar , multiplicar o dividir .Estas se especifican mediante un número:1s,2,r,3m,4d .La función devolverá 
 *  el resultado de la operación mediante un número real*/

public class EjercicioResueltoDoce {

	public static double calculadora(int opcion, int a, int b) {

		double resultado = 0;
		switch (opcion) {
		case 1:
             System.out.println( resultado=a+b);
			break;
		case 2:
			System.out.println( resultado=a-b);
			break;
		case 3:

			System.out.println( resultado=a*b);
			break;
		case 4:
			System.out.println( resultado=a/b);
			break;

		default:
			break;
		}

		return resultado;

	}

	public static void main(String[] args) {
		System.out.println("Insertar opcion \n 1.-Suma ,\n 2.-Resta \n 3.-Multiplicación \n 3.- División");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("insertar opción");
		int op = sc.nextInt();
		System.out.println("insertar numero a ");
		int a = sc.nextInt();
		System.out.println("insertar numero b ");
		int b = sc.nextInt();
        calculadora(op, a, b);
	}
}
