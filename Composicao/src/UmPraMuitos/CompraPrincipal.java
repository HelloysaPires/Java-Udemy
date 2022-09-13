package UmPraMuitos;

public class CompraPrincipal {
	
	public static void main(String[] args) {
		Compra c1 = new Compra();
		
		c1.cliente = "Joao";
		c1.adicionarItem(new Item("Arroz", 2, 10));
		c1.adicionarItem("Feijao", 2, 8);
		c1.itens.add(new Item("Batata", 10, 1.5));
		
		System.out.println(c1.obterValorTotal());
	
	}

}
