package exercicioSubstitutoExceptions;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
	
	public static void testarOperador(String op) throws Exception{
		if( op.equals("+") | op.equals("-") | op.equals("x") | op.equals("/") ) return;
		else throw new Exception("Erro! Operador inexistente.");
	}
	
	public static void numeroNegativo(int x) throws Exception{
		if (x<0) throw new Exception("Erro! Número negativo.");
	}
	
	
	public static void main(String[] args) throws Exception {
		
		int a, b;
		String op;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.print("Digite a opeação (+, -, x ou /): ");
			op = sc.next();
			testarOperador(op);
			
			System.out.print("Digite o primeiro número inteiro: ");
			a = sc.nextInt();
			numeroNegativo(a);
			
			System.out.print("Digite o segundo número inteiro: ");
			b = sc.nextInt();
			numeroNegativo(b);
			
			sc.close();
			Calculadora calculadora = new Calculadora(a, b, op);
			calculadora.operacao();
			
		}catch(NumeroNegativo e){
			System.out.println(e.getMessage());
		}catch(ArithmeticException e) {
			System.out.println("Erro! Divisão por zero.");
		}
		catch(InputMismatchException e) {
			System.out.println("Não é um número válido!");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	

}
