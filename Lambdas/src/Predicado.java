import java.util.function.Predicate;

public class Predicado {

	public static void main(String[] args) {

		Predicate<Produto> ehCaro = 
				(produto) -> produto.preco * (1- produto.desconto) >= 750; 
		
		Produto p = new Produto ("Notbook", 3893.89, 0.15 );
		
		System.out.println(ehCaro.test(p));
	}

}
