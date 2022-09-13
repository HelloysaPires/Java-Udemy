package br.com.cod3r.cm.modelo;
import java.util.ArrayList;
import java.util.List;

public class Campo {
	
	private final int linha;
	private final int coluna;
	
	private boolean aberto = false;
	private boolean minado = false;
	private boolean marcado = false;
	
	private List<Campo> vizinhos = new ArrayList<>();
	private List<CampoObservador> observadores = new ArrayList<>();
	// private List<BiConsumer<Campo, CampoEvento>> = observadores = new ArrayList<>();
	
	public void registrarObservador(CampoObservador observador) {
		observadores.add(observador);
	}
	
	private void notificarObservadores(CampoEvento evento) {
		observadores.stream()
					.forEach(o -> o.eventoOcorreu(this, evento));
	}
	
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
	
	public void alternarMarcado() {
		if(!aberto) {
			marcado = !marcado;
			
			if(marcado) {
				notificarObservadores(CampoEvento.MARCAR);
			}else {
				notificarObservadores(CampoEvento.DESMARCAR);
			}
		}
	}
	
	void minar() {
		minado = true;
	}
	
	public boolean abrir() {
		if(!aberto && !marcado) {
			
			if(minado) {
				notificarObservadores(CampoEvento.EXPLODIR);
				return true;
			}
			setAberto(true);

			if(vizinhacaSegura()) {
				vizinhos.forEach(v -> v.abrir());
			}	
			return true;
		}
		
		return false;
	}
	
	public boolean vizinhacaSegura() {
		return vizinhos.stream().noneMatch( v -> v.minado);
	}
	
	public boolean isMarcado() {
		return marcado;
	}
	
	public boolean isAberto() {
		return aberto;
	}
	
	void setAberto(boolean aberto) {
		this.aberto = aberto;
		
		if(aberto) {
			notificarObservadores(CampoEvento.ABRIR);
		}
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
	
	public int minasNaVizinhanca() {
		return (int)vizinhos
							.stream()
							.filter(v -> v.minado)
							.count();
	}
	
	void reiniciar() {
		aberto = false;
		minado = false;
		marcado = false;
		
		notificarObservadores(CampoEvento.REINICIAR);
	}
	
}
