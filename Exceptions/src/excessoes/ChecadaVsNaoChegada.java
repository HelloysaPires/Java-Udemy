package excessoes;

import java.util.Scanner;

public class ChecadaVsNaoChegada {

	public static void main(String[] args) {

		try{ 
			geraErro1();
		} catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		try{ 
			geraErro2();
		} catch(Throwable e) {
			System.out.println(e.getMessage());
		}
		
		
		
		try {
			System.out.print("Digite um numero decimal: ");
			lerNumero();
			System.out.println("\n");
		} catch (Exception e) {
			System.out.println("Digito do double com virgula: " + e.getMessage());
		}
		
		
		
		System.out.println("Fim!");
	}
	
	// NAO CHECADA RuntimeException
	// precisam ser tratadas em tempo de compilação
	static void geraErro1() {
		throw new RuntimeException("Erro #01");
	}
	
	// CHECADA: IOExcepion SQLException
	// throw é um statement, ele manda a exceção ser lançada. 
	// Este método lança uma exceção mas não exige que ela seja tratada por seus chamadores
	// Ele usa o que se chama unckecked exception, ou seja, uma exceção é lançada mas nada obriga ela ser tratada
	// A palavra-chave throws serve para declarar que um método pode lançar exceções de um determinado tipo.
	static void geraErro2() throws Exception {
		throw new Exception("Erro #02");
	}
	
	public static double lerNumero() throws Exception {
		Scanner ler = new Scanner(System.in);
		double num = ler.nextDouble();
		ler.close();
		return num;
	}
}
