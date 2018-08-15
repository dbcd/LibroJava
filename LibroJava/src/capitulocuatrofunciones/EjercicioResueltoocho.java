package capitulocuatrofunciones;

import java.util.Scanner;

/* Escribir una función a la que se le pase un número entero 
 * y devuelva el número de divisiores primos que tiene*/

public class EjercicioResueltoocho {
	
	static int numeroDivisoresPrimos(int num) {
		int contadordivisores;
		contadordivisores=1;
		for (int i = 2; i <= num; i++) {
			if(numeroPrimo(i) && (num % i == 0)) {
				contadordivisores++;
			}
			//System.out.println(contadordivisores);
		}
		
		
		return contadordivisores;
		
	}

	static boolean numeroPrimo(int num) {
		boolean primo=true;//suponemos que el numero es primo
		int i=2;// primer número por que veremos si es divisible
		
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
		
	    System.out.println( "divisores de  " + 100   +  " son " +  numeroDivisoresPrimos(24));
		
	
		
	}
	
	
}