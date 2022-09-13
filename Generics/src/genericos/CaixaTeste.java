package genericos;

public class CaixaTeste {

	public static void main(String[] args) {

		Caixa<String> caixaA = new Caixa<>();
		caixaA.guardar("oi");
		
		System.out.println(caixaA.abrir());
		
	}

}
