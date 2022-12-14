package br.com.cod3r.cm.modelo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Tabuleiro implements CampoObservador{
	
	private final int linhas;
	private final int colunas;
	private final int minas;

	private List<Campo> campos = new ArrayList<>();
	private List<Consumer<ResultadoEvento>> observadores = new ArrayList<>();
	
	public void registrarObservador(Consumer<ResultadoEvento> observador) {
		observadores.add(observador);
	}
	
	private void notificarObservadores(boolean resultado) {
		observadores.stream()
					.forEach(o -> o.accept(new ResultadoEvento(resultado)));
	}

	public Tabuleiro(int linhas, int colunas, int minas) {
		this.linhas = linhas;
		this.colunas = colunas;  
		this.minas = minas;
		
		gerarCampos();
		associarVizinhos();
		sortearMinas();
	}

	public void paraCadaCampo(Consumer<Campo> funcao) {
		campos.forEach(funcao);
	}

	private void gerarCampos() {
		for(int i = 0; i<linhas; i++) {
			for(int j = 0; j<colunas; j++) {
				Campo campo = new Campo(i,j);
				campo.registrarObservador(this);
				campos.add(campo);
			}
		}
	}
	
	private void associarVizinhos() {
		for(Campo c1: campos) {
			for(Campo c2: campos) {
				c1.adicionarVizinho(c2);
			}
		}
	}
	
	private void sortearMinas() {
		long minasArmadas = 0;
		
		do {
		
			int aleatorio = (int) (Math.random() * campos.size());
			campos.get(aleatorio).minar();
			
			minasArmadas = campos.stream()
			         .filter(c-> c.isMinado())
			         .count();
			
		} while(minasArmadas < minas);
	}
	
	public boolean objetivoAlcancado() {
		return campos.stream().allMatch(c -> c.objetivoAlcancaodo());
	}
	
	public void reiniciar() {
	  campos.stream().forEach(c -> c.reiniciar());
	  sortearMinas();
	}
	
	
	 public void abrir(int linha, int coluna) {
			 	campos.parallelStream()
	           .filter( c -> c.getLinha() == linha && c.getColuna() == coluna)
	           .findFirst()
	           .ifPresent(c -> c.abrir());
	}
	
	public void mostrarMinas() {
		campos.stream().filter(c -> c.isMinado())
					   .filter(c -> ! c.isMarcado())
					   .forEach(c -> c.setAberto(true));
	}
	
	public void alterarMarcacao(int linha, int coluna) {
	   campos.parallelStream()
		     .filter( c -> c.getLinha() == linha && c.getColuna() == coluna)
		     .findFirst()
		     .ifPresent(c -> c.alternarMarcado());
	}


	@Override
	public void eventoOcorreu(Campo campo, CampoEvento evento) {
		if(evento == CampoEvento.EXPLODIR) {
			mostrarMinas();
			notificarObservadores(false);
		}else if(objetivoAlcancado()) {
			notificarObservadores(true);
		}
	}

	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}

	
	
	
	
}
