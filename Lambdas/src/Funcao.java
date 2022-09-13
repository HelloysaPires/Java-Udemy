import java.util.function.Function;

public class Funcao {
	public static void main(String[] args) {
		Function<Integer, String> parOuImpar = 
				(numero) -> numero % 2 == 0 ? "Par" : "Impar";
				
				System.out.println(parOuImpar.apply(33));
				
				
		Function<String, String> oResultadoEh =
				(valor) -> "O resultado eh: " + valor;
				
				
		System.out.println(oResultadoEh.apply(parOuImpar.apply(32)));
		System.out.println(parOuImpar.andThen(oResultadoEh).apply(33));
				
	}
	
}
