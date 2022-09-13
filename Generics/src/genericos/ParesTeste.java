package genericos;

public class ParesTeste {

	public static void main(String[] args) {
		Pares<Integer, String> resultadoConcurso = new Pares<>();
		
		resultadoConcurso.adicionar(1, "Maria");
		resultadoConcurso.adicionar(2, "Julia");
		resultadoConcurso.adicionar(3, "Ana");
		resultadoConcurso.adicionar(4, "Joao");
		resultadoConcurso.adicionar(2, "Gui");

		System.out.println(resultadoConcurso.getValor(1));
		System.out.println(resultadoConcurso.getValor(2));
		System.out.println(resultadoConcurso.getValor(4));

	}

}
