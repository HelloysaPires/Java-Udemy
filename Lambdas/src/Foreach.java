import java.util.Arrays;
import java.util.List;

public class Foreach {
	
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia");
		
		System.out.println("Forma Tradicional: ");
		for(String aux: aprovados) {
			System.out.println(aux);
		}
		
		
		System.out.println("\nOutra forma 01: ");
		aprovados.forEach((aux) -> 
		  {System.out.println(aux + "!!");}
		);
		
		
		System.out.println("\nOutra forma 02: ");
		aprovados.forEach(System.out::println);
		
		
		System.out.println("\nOutra forma 03: ");
		aprovados.forEach( (aux) ->  imprimirNome(aux) );
		
		
		System.out.println("\nOutra forma 04: ");
		aprovados.forEach(Foreach::imprimirNome);
		
				
	}
	
	 	static void imprimirNome(String nome) {
	 		System.out.println("Oi, meu nome eh " +nome);
	 	}

}
