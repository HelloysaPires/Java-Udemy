import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		
		Consumer<Produto> imprimirNome = (p) -> System.out.println(p.nome);
		
		Produto p1 = new Produto("Arroz", 10, 0.1);
		imprimirNome.accept(p1);
		
		Produto p2 = new Produto("Alface", 10, 0.1);
		Produto p3 = new Produto("Feijao", 10, 0.1);
		Produto p4 = new Produto("Macarrão", 10, 0.1);
		Produto p5 = new Produto("Batata", 10, 0.1);
		
		System.out.println("\n");
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		produtos.forEach(imprimirNome);
		
	}

}
