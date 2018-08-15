package capitulocuatrofunciones;

import java.util.Scanner;

/* Implementar la función divisoresPrimos() que muestra , por consola, todos los divisores 
 * primos del número que se le pasa como parámetro.
 * */
public class EjercicioResueltonueve {
	
	static void divisoresPrimos(int num) {
		
		System.out.println("Divisores primos " +  num);
		
		for (int i = 1; i <= num; i++) {
			if(numeroPrimo(i) && (num  %   i == 0)) {
		  System.out.println("El número"+ i);
			}
			//System.out.println(contadordivisores);
		}
		
		
		
		
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
		Scanner sc= new Scanner(System.in);
		
		System.out.println("insertar numero  ");
		int a  = sc.nextInt();
		
	     divisoresPrimos(a);
		
	
		
	}
}