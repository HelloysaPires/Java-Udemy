package excessoes;

public class Basico {

	public static void main(String[] args) {

		Aluno a1 = null;
		
		// imprimirNome(a1); ocorre
		
		try {
			imprimirNome(a1);
		} catch(Exception e) {
			System.out.println("Ocorreu um erro: " + e.getMessage());
			e.printStackTrace();
		}
		
		try {
			System.out.println(7/0);
		} catch (ArithmeticException e) {
			System.out.println("Erro: " + e.getMessage());
			e.printStackTrace();
		}finally {
			System.out.println("Teste do finally");
		}
		
		
		//ha como fazer um bloco try com varios catch: usar cacth mais generico: Throwable
		
		System.out.println("Fim :)");
	}
	
	public static void imprimirNome(Aluno a) {
		System.out.println(a.nome);
	}
	
}
