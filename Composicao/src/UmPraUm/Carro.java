package UmPraUm;

public class Carro {
	final Motor motor;
	
	Carro(Motor motor){
		this.motor = new Motor(this);
	}
	
	void acelerar() {
		motor.fatorInjecao += 0.4;
	}
	
	void frear() {
		if(motor.fatorInjecao>0.4) motor.fatorInjecao -= 0.4;
	}
	
	void ligar() {
		motor.ligado = true;
	}
	
	void desligar() {
		motor.ligado = false;
	}
	
	boolean estaLigado() {
		return motor.ligado;
	}
}
