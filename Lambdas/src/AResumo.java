
public class AResumo {

	public static void main(String[] args) {

		//Consumer<Produto> imprimirNome = (p) -> System.out.println(p.nome);    parece o void, recebe um tipo e nao retorna nada 
		
		//Supplier <List<String>> umaLista = () -> Arrays.asList("Ana", "Bia", "Lia", "Mia");  não recebe nada e retorna um tipo
		
		//Function<Integer, String> parOuImpar = (numero) -> numero % 2 == 0 ? "Par" : "Impar";  recebe um tipo e retorna outro tipo
		
		//BinaryOperator<Double> media = (n1, n2) -> (n1+n2)/2 ; recebe dois tipos iguais e retorna esse mesmo tipo

		//BiFunction<Double, Double , String > 	resultado = (n1, n2) -> media.apply(n1, n2) >= 6 ? "Aprovado" : "Reprovado"; // recebe  dois tipos e retorna um terceito tipo
		
		//UnaryOperator <Integer> maisDois = (n) -> n + 2; recebe um tipo e retorna esse mesmo tipo
		
		// Predicate<Produto> ehCaro =	(produto) -> produto.preco * (1- produto.desconto) >= 750; receve um tipoe retorna um booleano
	}

}
