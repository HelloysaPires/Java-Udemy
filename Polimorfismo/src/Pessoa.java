
public class Pessoa{
	
	private double peso;
	
	public void comer(Comida comida) {
		this.peso += comida.getPeso();
	}
	
	
	// construtor
	public Pessoa(double peso) {
		setPeso(peso);
	}
	// setter e getter

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if(peso >=9 )this.peso = peso;
	}
	
	

}
