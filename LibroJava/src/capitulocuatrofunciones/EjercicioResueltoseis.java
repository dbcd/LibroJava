package capitulocuatrofunciones;

import java.util.Scanner;

/* crear una función que mediante un booleano , indique si el carácter que se pasa como parámetro 
 * de entrada corresponde con una vocal*/
public class EjercicioResueltoseis {

	
	static boolean caracatervocal(char x) {
		boolean vocal=false;
		//char letra;
		
		if(x=='a'|| x =='b'){
			vocal=true;
		}else {
			
			vocal=false;
		}
		return vocal;
	}
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("insertar letra");
	    String letra =sc.nextLine();
		System.out.println(" es vocal "+caracatervocal(letra.charAt(0)));
		
	}
	
}
