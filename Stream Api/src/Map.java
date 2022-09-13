import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

	public static void main(String[] args) {
		
		Consumer <String> print = System.out::print;
		
		List<String> marcas = Arrays.asList("Bmw ", "Audi ", "Honda ");
		
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);
		System.out.println("\n");
		
		UnaryOperator <String> maiuscula = m -> m.toUpperCase();
		//UnaryOperator <String> primeiraLetra = m -> m.charAt(0) + "";   OLHAR UTILITÁRIOS
		//UnaryOperator <String> grito = m -> m + "!!! ";

		marcas.stream().map(maiuscula)
					   .map(Utilitarios.primeiraLetra)
					   .map(Utilitarios::grito)
					   .forEach(Utilitarios.printar);

	}

}
