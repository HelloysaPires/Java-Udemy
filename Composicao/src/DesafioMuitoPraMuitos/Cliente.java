package DesafioMuitoPraMuitos;
import java.util.ArrayList;

public class Cliente {
	
	String nome;
	ArrayList<Compra> compras = new ArrayList<>();
	
	public Cliente(String nomeCliente) {
		this.nome = nomeCliente;
	}

	void adicionarItemNaCompra(String nome, double preco, int qtd) {
		this.compras.add(new Compra(nome, preco, qtd));
	}
	
	double ValorTotal() {
		
		double total = 0;
		
		for(Compra aux: compras) {
			total += aux.valorParcial();
		}
		return total;
	}


}
