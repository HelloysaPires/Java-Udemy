package exercicioTres;
import java.util.Date;

public class Atendimento {

	private Date data;
	private String descricao;
	private Funcionario atendente;
	private Aparelho aparelho;
	
	public Atendimento(Date data, String descricao, Funcionario atendente, Aparelho aparelho) {
		super();
		this.data = data;
		this.descricao = descricao;
		this.atendente = atendente;
		this.aparelho = aparelho;
	}

	@Override
	public String toString() {
		return "data: " + data + ", descrição: " + descricao + ", código aparelho: " + aparelho.getCodigo() + ",  atendente: (" + atendente.toString() + ")";
	}

	
	
}
