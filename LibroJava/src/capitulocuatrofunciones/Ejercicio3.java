package capitulocuatrofunciones;

import java.util.Scanner;

/*Implementar la función static double distancia (double x1, double y1 , double x2, double y2) que calcula y devuelve la distancia euclidea 
 * que separa los puntos(x1,y1),(x2,y2)
 * */
public class Ejercicio3 {

	
	public static double distancia(double x1, double y1, double x2, double y2) {
       
		
		double p1=Math.pow((x2-x1),2);
		System.out.println(p1);
		double p2=Math.pow((y2-y1),2);
		System.out.println(p2);
		
		double suma =p1+p2;
		
		double distancia=Math.sqrt(suma);
		System.out.println(distancia);
		
		System.out.println("pienso esta solución"+distancia);
		
		return distancia;
		
       }
	
     
		

	

	public static void main(String[] args) {
		//System.out.println("Insertar opcion \n 1.-Superficie ,\n 2.-Volumen");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("insertar número");
		int x1 = sc.nextInt();
		System.out.println("insertar número");
		int y1 = sc.nextInt();
		System.out.println("insertar número");
		int x2 = sc.nextInt();
		System.out.println("insertar número");
		int y2 = sc.nextInt();
         distancia(x1,y1,x2,y2);
}
	
}
