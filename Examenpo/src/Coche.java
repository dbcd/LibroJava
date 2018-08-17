
public class Coche extends Vehiculo{
private String Matricula;
private String Combustible;


public Coche(String marca, String modelo, String matricula, String combustible)throws Exception {
	super(marca, modelo);
	if(matricula.charAt(0)>3) {
	
	Matricula = matricula;
	Combustible = combustible;
}else {
	throw new Exception("La matricula tiene menos de tres caracteres");
	
}

}
}