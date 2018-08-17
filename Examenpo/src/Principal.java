
public class Principal {
public static void main(String[] args) {
	
	try {
		Coche c1 = new Coche("Aston Martin","511g","38743gghjh","gasolina");
		Cliente cli1= new Cliente ("7863786W","James ","bond");
		Reserva r1= new Reserva(cli1, c1, "15/06/2018");
		
	} catch (Exception e) {
	
		e.printStackTrace();
	}
	
	
}
}
