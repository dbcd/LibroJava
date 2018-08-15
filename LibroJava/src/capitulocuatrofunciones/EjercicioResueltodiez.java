package capitulocuatrofunciones;

import java.util.Scanner;

/* Escribir una función que decida si dos números enteros positivos son amigos.
 * Dos números son amigos si la suma de sus divisores propios (distintos de ellos mismos)
 * son iguales*/
public class EjercicioResueltodiez {
	
	static int sumaDivisoresPropios(int num) {
		int suma=0;
		
       for (int i = 1; i < num; i++) {
		if(num%i==0){
			suma=suma+i;
		}
	}
		
		
		return suma;
	}
	static boolean amigos(int a , int b) {
		boolean amigos;
		
		if(a==sumaDivisoresPropios(b)&& b==sumaDivisoresPropios(a)) {
			amigos=true;
		}else {
			amigos=false;
		}
		return amigos;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("insertar numero  ");
		int a  = sc.nextInt();
		System.out.println("insertar numero b ");
		int b  = sc.nextInt();
		if(amigos(a, b)) {
			System.out.println("son amigos");
		}else {
			System.out.println("no amigos");
		}
	    
		
	
		
	}
	
	
}
