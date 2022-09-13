package exercicioUm;

public class Gerente extends Funcionario{
	double salarioMensal, bonificacao;

	
	public Gerente(double salarioMensal, double bonificacao) {
		super();
		this.salarioMensal = salarioMensal;
		this.bonificacao = bonificacao;
	}
	
	public Gerente(String nome, String sobrenome, double salarioMensal, double bonificacao) {
		super(nome, sobrenome);
		this.salarioMensal = salarioMensal;
		this.bonificacao = bonificacao;
	}
	
	public Gerente() {
		
	}

	public double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}

	public double getBonificacao() {
		return bonificacao;
	}

	public void setBonificacao(double bonificacao) {
		this.bonificacao = bonificacao;
	}
	
	public double salarioTotal() {
		return salarioMensal + bonificacao;
	}

	@Override
	public String toString() {
		return super.toString() + " - Cargo: Gerente - Salario: R$" + getSalarioMensal() + " - Bonificacao: R$" 
	                            + getBonificacao() + " - Salario total : R$" + salarioTotal() ;
	}
	
}
