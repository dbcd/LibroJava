package exz;

public class Rectangulo extends FiguraCerrada{
  private double mdLado1=10;
  private double mdLado2=3;
	
	 Rectangulo() {
		this.color="amarillo";
	}

	 Rectangulo(double pdLado1,double pdLado2) {
			this.mdLado1=pdLado1;
			this.mdLado2=pdLado2;
		}

public double getArea() {
	return this.mdLado1*this.mdLado2;
}
}


