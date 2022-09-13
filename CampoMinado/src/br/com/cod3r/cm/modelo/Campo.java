package br.com.cod3r.cm.modelo;
import java.util.ArrayList;
import java.util.List;
import br.com.cod3r.cm.excecao.ExplosaoException;

public class Campo {
	
	private final int linha;
	private final int coluna;
	
	private boolean aberto = false;
	private boolean minado = false;
	private boolean marcado = false;
	
	private List<Campo> vizinhos = new ArrayList<>();

	
	public Campo(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
	}
	
	boolean adicionarVizinho(Campo vizinho) {
		
		boolean diagonal = (linha != vizinho.linha) && (coluna != vizinho.coluna);
		int delta = Math.abs(linha - vizinho.linha)  + Math.abs(coluna - vizinho.coluna);
		
		
		if( delta == 1 && !diagonal) { 
			vizinhos.add(vizinho);
			return true;
		}
		if( delta == 2 && diagonal) {
			vizinhos.add(vizinho);
			return true;
		}
		    return false;
	}
	
	void alternarMarcado() {
		if(!aberto) {
			marcado = !marcado;
		}
	}
	
	void minar() {
		minado = true;
	}
	
	boolean abrir() {
		if(!aberto && !marcado) {
			aberto = true;
			
			if(minado) {
				throw new ExplosaoException();
			}
			if(vizinhacaSegura()) {
				vizinhos.forEach(v -> v.abrir());
			}	
			return true;
		}
		
		return false;
	}
	
	boolean vizinhacaSegura() {
		return vizinhos.stream().noneMatch( v -> v.minado);
	}
	
	public boolean isMarcado() {
		return marcado;
	}
	
	public boolean isAberto() {
		return aberto;
	}
	
	void setAbeto(boolean aberto) {
		this.aberto = aberto;
	}
	
	public boolean isMinado() {
		return minado;
	}

	public int getLinha() {
		return linha;
	}

	public int getColuna() {
		return coluna;
	}
	
	boolean objetivoAlcancaodo() {
		boolean desvendado = !minado && aberto;
		boolean protegido = minado && marcado;
		
		return desvendado || protegido;
	}
	
	long minasNaVizinhanca() {
		return vizinhos
			   .stream()
			   .filter(v -> v.minado)
			   .count();
	}
	
	void reiniciar() {
		aberto = false;
		minado = false;
		marcado = false;
	}
	
	public String toString() {
		if(marcado) return "x";
		else if(aberto && minado) return "*";
		else if(aberto && minasNaVizinhanca() > 0) {
			return Long.toString(minasNaVizinhanca());
		}
		else if(aberto) return " ";
		return "?";	
	}
	
}
