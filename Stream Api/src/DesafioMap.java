import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {

		List <Integer> nums = 
		Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		Function <Integer, String> converterParaBinario = (x) -> Integer.toBinaryString(x);
		
		UnaryOperator <String> inverterBinario = (x) ->  new StringBuilder(x).reverse().toString();
	
		Function <String, Integer> converterBinarioParaInteiro = (x) ->  Integer.parseInt(x, 2);
		

		nums.stream().map(converterParaBinario)
					 .map(inverterBinario)
					 .map(converterBinarioParaInteiro)
					 .forEach(Utilitarios.printar);
		
		
		

	}

}
