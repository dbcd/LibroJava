package capitulocuatrofunciones;

import java.util.Scanner;

/*Calcular el factorial de n recursivamente.Recordar que por definición el factorial de 0 (!0) es 1*/
public class EjercicioResueltoTrece {
	//Opción recursiva 
	public static double recursivoN( int n) {
		
		double resultado=0;
		if(n==0) {
			resultado=1;
		}else {
			resultado=n*recursivoN(n-1);
		}
		
		return resultado;
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("insertar numero n ");
		int n  = sc.nextInt();
		//System.out.println(aElevadoN(a, n));
		System.out.println(recursivoN( n));
	}

}
