package exz;

public class Figura {
protected String color ="azul";
Figura(){
	this(1);
}
Figura(	String ps_color){
	this.color=ps_color;
}	
	

Figura(int pi_tipo){
	switch(pi_tipo) {
	case 1:
		this.color="verde";
	case 2:
		this.color="azul";
	default:
		this.color="rojo";
	}
}	

public String getColor() {
	return this.color;
}
}
