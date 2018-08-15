package capitulocuatrofunciones;

import java.util.Scanner;

/*Diseñar  una función que reciba como parámtros dos números enteros y que devuelva el máximo()
 * (el mayor de los dos)*/
public class EjercicioResueltocuatro {

	
	static int maximo(int a , int b) {
		int mayor=0;
		if(a>b) {
			mayor=a;
		}else {
			mayor=b;
		}
		
		return mayor;
	}
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("insertar numero1 ");
		int a  = sc.nextInt();
		System.out.println("insertar numero 2  ");
		int b  = sc.nextInt();
		System.out.println("el mayor es "+maximo(a, b));
		
	}
	
	
}
