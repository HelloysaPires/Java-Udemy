import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {

		Produto produto = new Produto("iPad", 3235.89, 0.13);
		
		Function <Produto, Double> 
		precoReal = (p) -> p.preco * (1 - p.desconto);
		
		UnaryOperator <Double>
		impostoMunicipal = (i) -> i >= 2500 ? i * 1.085 : i;
		
		UnaryOperator <Double>
		frete = (f) -> f >= 3000 ? f + 100 : f + 50;
		
		UnaryOperator <Double> 
		arrendondar = (a) -> Double.parseDouble(String.format("%.2f", a));
		
		
		Function <Double, String> 
		formatar = (f) -> {
			f.toString();
			return "R$" + f;
		};
		
		System.out.println(precoReal.andThen(impostoMunicipal).andThen(frete).andThen(arrendondar).andThen(formatar).apply(produto));
		
		
	}

}
