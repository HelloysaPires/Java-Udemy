package br.com.cod3r.cm.visao;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import br.com.cod3r.cm.excecao.ExplosaoException;
import br.com.cod3r.cm.excecao.SairException;
import br.com.cod3r.cm.modelo.Tabuleiro;

public class TabuleiroConsole {
	private Tabuleiro tabuleiro;
	private Scanner entrada = new Scanner(System.in);
	
	public TabuleiroConsole(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		
		executarJogo();
	}

	private void executarJogo() {
		try{
			boolean continuar = true;
			
			while(continuar) {
				cicloDoJogo();
				
				System.out.print("Outra partida? (S/N): ");	
				String resposta = entrada.nextLine();
				
				if("n".equalsIgnoreCase(resposta)) continuar = false;
				else tabuleiro.reiniciar();
			}
			
		}catch(SairException e) {
		   System.out.println("Tchau!!!");
	    }finally {
	    	entrada.close();
	    }
	}

	private void cicloDoJogo() {
		try{
			
			while(!tabuleiro.objetivoAlcancaodo()) {
				System.out.println(tabuleiro.toString());
				
				String digitado = capturarValorDigitado("Digite (x,y): ");
				
				Iterator<Integer> xy = Arrays.stream(digitado.split(","))
											  .map(e -> Integer.parseInt(e.trim())).iterator();
											  
				digitado = capturarValorDigitado("(1) - abrir  -  (2) - (des)marcar -  (3) - sair: ");
				
				if("1".equals(digitado)) {
					tabuleiro.abrir(xy.next(), xy.next());
				}else if("2".equals(digitado)) {
					tabuleiro.alterarMarcacao(xy.next(), xy.next());
				}
			}
			
			System.out.print(":D Voce ganhou!!! ");
		} catch(ExplosaoException e) {
			System.out.println(tabuleiro);
			System.out.print(":( Voce perdeu!!! ");
		}
   }
	
	private String capturarValorDigitado(String texto) {
		System.out.print(texto);
		String digitado = entrada.nextLine();
		
		if("3".equals(digitado)) {
			throw new SairException();
		}
		
		return digitado;
	}
}
