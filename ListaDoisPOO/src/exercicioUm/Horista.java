package exercicioUm;

public class Horista extends Funcionario {
	int quantidadeHorasTrabalhadas;
	double valorDaHora;
	
	public Horista(String nome, String sobrenome, int quantidadeHorasTrabalhadas, double valorDaHora) {
		super(nome, sobrenome);
		this.quantidadeHorasTrabalhadas = quantidadeHorasTrabalhadas;
		this.valorDaHora = valorDaHora;
	}
	
	public Horista(int quantidadeHorasTrabalhadas, double valorDaHora) {
		super();
		this.quantidadeHorasTrabalhadas = quantidadeHorasTrabalhadas;
		this.valorDaHora = valorDaHora;
	}
	
	public Horista() {
	
	}
	
	public int getQuantidadeHorasTrabalhadas() {
		return quantidadeHorasTrabalhadas;
	}
	public void setQuantidadeHorasTrabalhadas(int quantidadeHorasTrabalhadas) {
		this.quantidadeHorasTrabalhadas = quantidadeHorasTrabalhadas;
	}
	public double getValorDaHora() {
		return valorDaHora;
	}
	public void setValorDaHora(double valorDaHora) {
		this.valorDaHora = valorDaHora;
	}
	
	public double salarioTotal() {
		return quantidadeHorasTrabalhadas * valorDaHora;
	}

	@Override
	public String toString() {
		return super.toString() + " - Cargo: Horista - Valor hora: R$" + getValorDaHora() 
		                        + " - Quantidade de horas trabalhas: " + getQuantidadeHorasTrabalhadas()
		                        + "h - Salario: R$" + salarioTotal();
	}
	
	
	
}
