package UmPraMuitos;
import java.util.ArrayList;

public class Compra {
	
	String cliente;
	ArrayList <Item> itens = new ArrayList<>();
	
	void adicionarItem(Item itens) {
		this.itens.add(itens);
		itens.compra = this;
	}
	void adicionarItem(String nome, int qtd, double preco) {
		this.adicionarItem(new Item(nome, qtd, preco));
	}
	
	double obterValorTotal() {
		double total = 0;
		for(Item aux: itens) {
		    total += aux.preco * aux.qtd;
		}
		return total;
	}
}
