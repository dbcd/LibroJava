package capitulocuatrofunciones;

import java.util.Scanner;

/* Escribir una función a la que se pasen como parámetros de entrada  una cantidad de días
 * , horas y minutos.La función devolverá el númer de segundos que existen en los datos de entrada.*/
public class Ejercicio4 {

	public static int devolverSegundos(int d, int h, int m) {
       
		int segundos;
		
		int p1=((d*24)*60)*60;
		System.out.println(p1);
		int p2=((h*60)*60);
		System.out.println(p2);
		int p3=(m*60);
		System.out.println(p2);
		segundos =p1+p2+p3;
		
	
		System.out.println("Total Segundos"+ segundos);
		
		return segundos;
		
       }
	
     
		

	

	public static void main(String[] args) {
		//System.out.println("Insertar opcion \n 1.-Superficie ,\n 2.-Volumen");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("insertar número de dias");
		int d = sc.nextInt();
		System.out.println("insertar número de horas");
		int h = sc.nextInt();
		System.out.println("insertar número de minutos");
		int m = sc.nextInt();
		
         devolverSegundos(d, h, m);
}
}
