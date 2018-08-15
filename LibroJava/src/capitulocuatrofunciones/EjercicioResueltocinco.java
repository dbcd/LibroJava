package capitulocuatrofunciones;

import java.util.Scanner;

/*Repetir el ejercicio anterior con una versión que calcule el máximo de 3 números*/
public class EjercicioResueltocinco {
	
	static int maximo(int a , int b, int c) {
		int mayor=0;
		if((a>b) && (a>c)){
			mayor=a;
		}else if((b>a)&&(b>c)) {
			mayor=b;
		}else {
			mayor=c;
		}
		
		return mayor;
	}
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("insertar numero1 ");
		int a  = sc.nextInt();
		System.out.println("insertar numero 2  ");
		int b  = sc.nextInt();
		System.out.println("insertar numero 3  ");
		int c  = sc.nextInt();
		System.out.println("el mayor es "+maximo(a, b, c));
		
	}
}
