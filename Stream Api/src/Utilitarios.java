import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Utilitarios {
	
	public Utilitarios() {
		
	}
	
	public final static String grito(String n) {
		return n + "!!!";
	}
	
	public final static UnaryOperator <String> primeiraLetra =
			m -> m.charAt(0) + "";
			
	public final static Consumer <Object> printar =
			System.out::println;

}
