package exercicioTres;

public class Cliente extends Pessoa{
	protected String telefone;

	public Cliente(String nome, String cpf, String telefone) {
		super(nome, cpf);
		this.telefone = telefone;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "telefone: " + telefone + ", nome: " + nome + ", cpf:" + cpf;
	}
	
	
	
}
