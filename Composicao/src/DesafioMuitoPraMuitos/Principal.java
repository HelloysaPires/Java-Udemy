package DesafioMuitoPraMuitos;

public class Principal {

	public static void main(String[] args) {
		Cliente c1 = new Cliente("Ana");
		c1.adicionarItemNaCompra("Arroz", 1, 100);
		c1.adicionarItemNaCompra("Feijao", 2, 2000);
		c1.adicionarItemNaCompra("Carne", 1, 1000);
		
		
		System.out.println(c1.ValorTotal());
		
		
	}

}
