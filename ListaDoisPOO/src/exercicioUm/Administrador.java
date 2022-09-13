package exercicioUm;

public class Administrador extends Funcionario {

	double salarioMensal;
	
	
	public Administrador(String nome, String sobrenome, double salarioMensal) {
		super(nome, sobrenome);
		this.salarioMensal = salarioMensal;
	}
	
	public Administrador(double salarioMensal) {
		super();
		this.salarioMensal = salarioMensal;
	}
	
	public Administrador() {
		
	}

	public double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}

	@Override
	public String toString() {
		return  super.toString() + " - Cargo: Administrador - Salario: R$" + getSalarioMensal();
	}
	
	
	
	
}
