package capitulocincotablas;
/*Diseñar  un programa que solicite al usuario que introduzca por teclado 5 números decimales 
 * a continuación debe mostrar los números en el mismo orden que se han introducido*/

import java.util.Scanner;

public class EjercicioResueltoUno {
	
	
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("insertar  números 5 numeros");
    int numerosrecibidos=5;
	float numeros []= new float [numerosrecibidos];
	//numeros=sc.nextFloat();
	
	for (int i = 0; i < numeros.length; i++) {
		System.out.println(i);
	}
}
}
