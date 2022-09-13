package DesafioMuitoPraMuitos;

public class Item {

		int qtd;
		Produto produto;
		
		public Item(String nome, double preco, int qtd) {
			this.qtd = qtd;
			produto = new Produto(nome, preco);
		}

}
