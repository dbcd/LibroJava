package capitulocuatrofunciones;

import java.util.Scanner;

/* Diseñar una función que nos digA SI UN NUMERO ES PRIMO */
public class EjercicioResueltosieste {

	static boolean numeroPrimo(int num) {
		boolean primo=true;//suponemos que el numero es primo
		int i=2;// prime número por que veremos si es divisible
		
		if(num<2) {//el primer primo es 2
			primo=false;
		}
		
		while(i<num && primo ==true) {
			if(num%i==0) {// si num es divisible por i
				primo=false;//entonces no es un numero primo
			}
			i++;
		}
		
		
		return primo;
	}
	
	
	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		
//		System.out.println("insertar numero  ");
//		int a  = sc.nextInt();
//		
//	       numeroPrimo(a);
		
		for (int i = 0; i < 15; i++) {
			if(numeroPrimo(i)) {
				System.out.println(i + " es primo");
			}else {
				System.out.println(i + " es compuesto");
			}
		}
		
	}
	
	
}
