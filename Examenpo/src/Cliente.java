
public class Cliente {
public String DNI;
public String Nombre;
public String Apellido;

public Cliente(String dNI, String nombre, String apellido) {
	DNI = dNI;
	Nombre = nombre;
	Apellido = apellido;
	
}

public String getDNI() {
	return DNI;
}

public void setDNI(String dNI) {
	DNI = dNI;
}

public String getNombre() {
	return Nombre;
}

public void setNombre(String nombre) {
	Nombre = nombre;
}

public String getApellido() {
	return Apellido;
}

public void setApellido(String apellido) {
	Apellido = apellido;
}


	
}
