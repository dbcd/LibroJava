package capitulocuatrofunciones;
/*Diseñar una función a la que se le pasen las horas y minutos de dos instantes de tiempo con el prototipo
 * Static int diferenciaMin(int hora1 , int minuto1 , int hora2 , int minuto2)
 * La función devolverá la cantidad de minutos que exista de diferencia entre los dos instantes utilizados*/

import java.util.Scanner;

public class Ejercicio5 {
	public static int diferenciaMin(int hora1 , int minuto1 , int hora2 , int minuto2) {
	       
		int diferencia;
		
		int p1=((hora1*60)+minuto1);
		System.out.println(p1);
		int p2=((hora2*60)+minuto2);
		System.out.println(p2);
		
		if(p1>p2) {
			diferencia=p1-p2;
			System.out.println("Total diferencia es "+ diferencia);
		}else {
			
			diferencia=p2-p1;
			System.out.println("Total diferencia es "+ diferencia);
		}
		
		
	
		
		
		return diferencia;
		
       }
	
     
		

	

	public static void main(String[] args) {
		//System.out.println("Insertar opcion \n 1.-Superficie ,\n 2.-Volumen");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("insertar  hora1");
		int h1 = sc.nextInt();
		System.out.println("insertar minuto1");
		int m1 = sc.nextInt();
		System.out.println("insertar  hora2");
		int h2 = sc.nextInt();
		System.out.println("insertar minuto2");
		int m2 = sc.nextInt();
		diferenciaMin(h1, m1, h2, m2);
        
}

}
