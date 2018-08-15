
package capitulocuatrofunciones;

import java.util.Scanner;

/*Diseñar una función que calcule el n-ésimo término de la serie de Finbonacci.En esta serie
 * el n-ésimo valor se calcula sumando los dos valores anteriores.Es decir 
 * */
public class EjercicioResueltoCatorce {
	public static double fibonaccideN( int n) {
		
		double resultado=0;
		if(n==0) {
			resultado=1;
		}else{
		 if(n==1) {
			resultado=1;
		}
			else {
				resultado=fibonaccideN(n-1)+fibonaccideN(n-2);
		}
			
		}
		
		return resultado;
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("insertar numero n ");
		int n  = sc.nextInt();
		//System.out.println(aElevadoN(a, n));
		System.out.println(fibonaccideN( n));
	}
}
