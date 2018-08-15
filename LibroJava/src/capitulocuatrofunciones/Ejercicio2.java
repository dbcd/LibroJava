package capitulocuatrofunciones;

import java.util.Scanner;

/*Crear la función muestrapares(int n ) que muestre por consola los primeros n números pares*/

public class Ejercicio2 {
	
	public static void numerosPares(int n) {
       
		
		for (int i = 0; i <n; i++) {
			if(i%2==0) {  
    		   System.out.println(i);
    	   }
       }
	
     
		

	}

	public static void main(String[] args) {
		//System.out.println("Insertar opcion \n 1.-Superficie ,\n 2.-Volumen");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("insertar número");
		int n = sc.nextInt();
		
         numerosPares(n);
}
}