package exercicioTres;

public class Funcionario extends Pessoa {
	protected int matricula;

	public Funcionario(String nome, String cpf, int matricula) {
		super(nome, cpf);
		this.matricula = matricula;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	@Override
	public String toString() {
		return "matricula: " + matricula + ", nome: " + nome + ", cpf:" + cpf;
	}
	
}
