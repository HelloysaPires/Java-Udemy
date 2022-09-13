package genericos;

public class CaixaIntTeste {

	public static void main(String[] args) {	
		CaixaInt caixaA = new CaixaInt();
		caixaA.guardar(100);
		System.out.println(caixaA.abrir());
	}

}
