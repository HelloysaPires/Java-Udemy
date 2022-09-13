package exercicioUm;

public class Comissionado extends Funcionario {
	
	double salarioMensal;
	double percentualComissao;
	double totalVendas;
	
	public Comissionado(double salarioMensal, double percentualComissao, double totalVendas) {
		super();
		this.salarioMensal = salarioMensal;
		this.percentualComissao = percentualComissao;
		this.totalVendas = totalVendas;
	}
	
	public Comissionado(String nome, String sobrenome, double salarioMensal, double percentualComissao, double totalVendas) {
		super(nome, sobrenome);
		this.salarioMensal = salarioMensal;
		this.percentualComissao = percentualComissao;
		this.totalVendas = totalVendas;
	}
	
	public Comissionado() {
	
	}
	
	public double getSalarioMensal() {
		return salarioMensal;
	}
	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}
	public double getPercentualComissao() {
		return percentualComissao;
	}
	public void setPercentualComissao(double percentualComissao) {
		this.percentualComissao = percentualComissao;
	}
	public double getTotalVendas() {
		return totalVendas;
	}
	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	} 
	
	public double salarioTotal() {
		return salarioMensal + ( totalVendas * (percentualComissao/100));
	}
	
	@Override
	public String toString() {
		return super.toString() + " - Cargo: Comissionado - Salario: R$" + getSalarioMensal() + " - Percentual comissao: " 
	                            + percentualComissao + "% - Total vendas: R$" + getTotalVendas() + " - Salario total: R$" 
	                            + salarioTotal();
	}
	
	
}
