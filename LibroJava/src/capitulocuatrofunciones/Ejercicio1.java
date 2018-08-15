package capitulocuatrofunciones;

import java.util.Scanner;

/* Diseñar una función que calcule la superficie y el volumen de una esfera*/

public class Ejercicio1 {
	public static double operacionesEsfera(int opcion, int radio) {

		double resultado =0;
		switch (opcion) {
		case 1:
             resultado=(4*(Math.PI))*Math.pow(radio, 2);
             System.out.println("La superficie es  = " + resultado);
			break;
		case 2:
			resultado=((4/3)*(Math.PI)*(Math.pow(radio, 3)));
			System.out.println("El Volumen es  = " + resultado);
			break;

		default:
			break;
		}

		return resultado;

	}

	public static void main(String[] args) {
		System.out.println("Insertar opcion \n 1.-Superficie ,\n 2.-Volumen");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("insertar opción");
		int op = sc.nextInt();
		System.out.println("insertar numero radio ");
		int radio = sc.nextInt();
		
        operacionesEsfera(op, radio);
	}
}
