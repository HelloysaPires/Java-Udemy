package genericos;

public class CaixaNumeroTeste {

	public static void main(String[] args) {
		// CaixaNumero<String> caixaA = new CaixaNumero<>();  ERRO pois tem, restrição
		CaixaNumero<Integer> caixaA = new CaixaNumero<>();
		caixaA.guardar(2);
		System.out.println(caixaA.abrir());
	}

}
