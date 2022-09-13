
public class Comida {

	private double peso;
	
    // construtor
	public Comida(double peso) {
		setPeso(peso);
	}
	
	// setter e getter

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if(peso >=0 )this.peso = peso;
	}	
	
}
