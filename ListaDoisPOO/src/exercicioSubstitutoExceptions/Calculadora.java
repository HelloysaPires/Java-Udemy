package exercicioSubstitutoExceptions;

public class Calculadora{
	
	private int a, b;
	private String op;
	
	public Calculadora(int a, int b, String op) {
		super();
		this.a = a;
		this.b = b;
		this.op = op;
	}

	public int soma() {
		return a+b;
	}
	
	public int multiplicacao() {
		return a*b;
	}
	
	public int subtracao() {
		return a-b;
	}
	
	public int divisao(){
		return a/b;
	}
	
	public void operacao() {
		if(b !=0 && op.equals("/")) {
			System.out.print("Resultado da operação: ");
		}
		if(op.equals("/")) System.out.print(divisao());
		
		if(!op.equals("/")) {
			System.out.print("Resultado da operação: ");
			if(op.equals("+")) System.out.print(soma());
			if(op.equals("-")) System.out.print(subtracao());
			if(op.equals("x")) System.out.print(multiplicacao());
		}
	}
		
}
