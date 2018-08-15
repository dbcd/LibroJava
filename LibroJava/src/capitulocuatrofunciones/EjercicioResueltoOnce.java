package capitulocuatrofunciones;

import java.util.Scanner;

//Diseñar una función que calcule a elevando a n, donde a es real y n no negavito.Realizar una versión iterativa y otra recursiva.

public class EjercicioResueltoOnce {

	public static double aElevadoN(double a , int n) {
		double resultado=0;
		if(n>0) {
		resultado= Math.pow(a, n);
		}else {
			System.out.println("Por favor insertar un número positivo");
		}
		return resultado;
	}
	
	
	//Opción recursiva 
	public static double aElevadoRecursivoN(double a , int n) {
		
		double resultado=0;
		if(n==0) {
			resultado=1;
		}else {
			resultado=a*aElevadoRecursivoN(a, n-1);
		}
		
		return resultado;
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("insertar numero a ");
		double a  = sc.nextDouble();
		System.out.println("insertar numero n ");
		int n  = sc.nextInt();
		//System.out.println(aElevadoN(a, n));
		System.out.println(aElevadoRecursivoN(a, n));
	}
	
}
