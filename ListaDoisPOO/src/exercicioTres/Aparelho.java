package exercicioTres;
import java.util.ArrayList;
import java.util.List;

public class Aparelho {
	private String codigo;
	private int ano;
	private String marca;
	private String modelo;
	private Cliente propietario; 
	private List<Atendimento> atendimentos = new ArrayList<>();
	
	public Aparelho(String codigo, int ano, String marca, String modelo, Cliente propietario) {
		super();
		this.codigo = codigo;
		this.ano = ano;
		this.marca = marca;
		this.modelo = modelo;
		this.propietario = propietario;
	}
	
	public void adicionarAtendimento(Atendimento atendimento) {
		atendimentos.add(atendimento);
	}
	

	public String getCodigo() {
		return codigo;
	}

	@Override
	public String toString() {
		return "Aparelho-> código: " + codigo + " - ano: " + ano + " - marca: " + marca + " - modelo: " + modelo
				+ "\n           propietário: (" + propietario.toString() + ")\n           atendimentos:" + atendimentos.toString();
	}
	
	
}
