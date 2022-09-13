package DesafioMuitoPraMuitos;
import java.util.ArrayList;

public class Compra {
		ArrayList<Item> itens = new ArrayList<>();
		
		
		public Compra(String nome, double preco, int qtd) {
			adicionarItem(nome, preco, qtd);
		}

		void adicionarItem(String nome, double preco, int qtd) {
			this.itens.add(new Item(nome, preco, qtd));
		}

		double valorParcial() {
			double total = 0;
			
			for(Item aux : itens) {
				total += aux.qtd * aux.produto.preco; 
			}
			
			return total;
		}
}
