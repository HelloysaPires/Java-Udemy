package DesafioMap;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Principal {

	public static void main(String[] args) {
		
		
		Pessoa p1 = new Pessoa("Ana", 20, "feminino");
		Pessoa p2 = new Pessoa("Julia", 17, "feminino");
		Pessoa p3 = new Pessoa("Carla", 11, "feminino");
		Pessoa p4 = new Pessoa("Luzia", 7, "feminino");
		Pessoa p5 = new Pessoa("Joao", 68, "masculino");
		Pessoa p6 = new Pessoa("Gui", 32, "masculino");
		Pessoa p7 = new Pessoa("Helo", 25, "feminino");

		List <Pessoa> pessoa = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);
		
		Predicate<Pessoa> ehMulher = m -> m.sexo.equals("feminino");
		Predicate<Pessoa> ehMaiorDeIdade = m -> m.idade >= 18;
		Function <Pessoa, String> status = m -> { m.faseVida = "mulher adulta"; 
		  		return m.nome + " eh uma " + m.faseVida;
		};
		
		
		pessoa.stream().filter(ehMulher)
		    		   .filter(ehMaiorDeIdade)
		               .map(status)
		               .forEach(System.out::println);
		
	}

}
