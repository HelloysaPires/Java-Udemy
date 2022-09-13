package br.com.cod3r.cm.modelo;
import java.util.ArrayList;
import java.util.List;
import br.com.cod3r.cm.excecao.ExplosaoException;

public class Tabuleiro {
	
	private int linhas;
	private int colunas;
	private int minas;

	private List<Campo> campos = new ArrayList<>();

	public Tabuleiro(int linhas, int colunas, int minas) {
		this.linhas = linhas;
		this.colunas = colunas;
		this.minas = minas;
		
		gerarCampos();
		associarVizinhos();
		sortearMinas();
	}


	private void gerarCampos() {
		for(int i = 0; i<linhas; i++) {
			for(int j = 0; j<colunas; j++) {
				campos.add(new Campo(i,j));
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
	
	public boolean objetivoAlcancaodo() {
		return campos.stream().allMatch(c -> c.objetivoAlcancaodo());
	}
	
	public void reiniciar() {
	  campos.stream().forEach(c -> c.reiniciar());
	  sortearMinas();
	}
	
	public String toString() {
        StringBuilder b = new StringBuilder();


        b.append("\n  ");
        for(int c=0; c<colunas; c++) {
            b.append(" ");
            b.append(c);
            b.append(" ");
        }
        b.append("\n");
        int cont = 0;

        for(int line=0; line<linhas; line++) {
            b.append(line);
            b.append(" ");
            for(int column=0; column<colunas; column++) {
                b.append(" ");
                b.append(campos.get(cont));
                b.append(" ");

                cont++;
            }
            b.append("\n");
        }

        return b.toString();
    }
	
	
	 public void abrir(int linha, int coluna) {
		try {
			 	campos.parallelStream()
	           .filter( c -> c.getLinha() == linha && c.getColuna() == coluna)
	           .findFirst()
	           .ifPresent(c -> c.abrir());
			 	
		} catch(ExplosaoException e){
				campos.forEach(c -> c.setAbeto(true));
			 	throw e;
		}
	}
	
	public void alterarMarcacao(int linha, int coluna) {
	   campos.parallelStream()
		     .filter( c -> c.getLinha() == linha && c.getColuna() == coluna)
		     .findFirst()
		     .ifPresent(c -> c.alternarMarcado());
	}
	
}
