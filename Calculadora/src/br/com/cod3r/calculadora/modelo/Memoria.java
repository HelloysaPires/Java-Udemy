package br.com.cod3r.calculadora.modelo;
import java.util.ArrayList;
import java.util.List;

public class Memoria {
	
	private enum TipoComando{
		ZERAR, NUMERO, DIV, MULT, SUB, SOMA, IGUAL, VIRGULA, TROCAROPERACAO;
	};
	private static final Memoria instancia = new Memoria();
	
	private TipoComando ultimaOperacao = null;
	private boolean substituir = false;
	private String textoAtual = "";
	private String textoBuffer = "";
		
	private final List<MemoriaObservador> observadores = new ArrayList<>();
	
	public void adicionarObservador(MemoriaObservador o) {
		observadores.add(o);
	}

	private Memoria () {
		
	}

	public static Memoria getInstancia() {
		return instancia;
	}
	
	public String getTextoAtual() {
		return textoAtual.isEmpty() ? "0" : textoAtual;
	}
	
	public void processarComando(String valor) {
		
		TipoComando tipoComando = detectarTipoComando(valor); 
		
		if(tipoComando == null) return;
		else if(tipoComando == TipoComando.ZERAR) {
			textoAtual = "";
			textoBuffer = "";
			substituir = false;
			ultimaOperacao = null;
		}
		else if(tipoComando == TipoComando.TROCAROPERACAO && textoAtual.contains("-")) {
			textoAtual =  textoAtual.substring(1);
			ultimaOperacao = null;
		}
		else if(tipoComando == TipoComando.TROCAROPERACAO && !textoAtual.contains("-")) {
			textoAtual =  "-" + textoAtual;
			ultimaOperacao = null;
		}
		else if(tipoComando == TipoComando.NUMERO || tipoComando == TipoComando.VIRGULA) {
			textoAtual = substituir ? valor : textoAtual + valor;
			substituir = false;
		}
		else{
			substituir = true;
			textoAtual = obterResultadoOperacao();
			textoBuffer = textoAtual;
			ultimaOperacao = tipoComando;
		}
			
		observadores.forEach(o -> o.valorAlterado(getTextoAtual()));
	}
	
	private String obterResultadoOperacao() {

		if(ultimaOperacao == null || ultimaOperacao == TipoComando.IGUAL || ultimaOperacao == TipoComando.TROCAROPERACAO) 
			return textoAtual;
		
		
		double numeroBuffer = Double.parseDouble(textoBuffer.replace(",", "."));
		double numeroAtual = Double.parseDouble(textoAtual.replace(",", "."));
		double resultado = 0;
		
		if(ultimaOperacao == TipoComando.SOMA ) resultado = numeroBuffer + numeroAtual;
		if(ultimaOperacao == TipoComando.SUB ) resultado = numeroBuffer - numeroAtual;
		if(ultimaOperacao == TipoComando.MULT ) resultado = numeroBuffer * numeroAtual;
		if(ultimaOperacao == TipoComando.DIV ) resultado = numeroBuffer / numeroAtual;
		
		String resultadoString = Double.toString(resultado).replace(".", ",");
		boolean inteiro = resultadoString.endsWith(",0");
		return inteiro ? resultadoString.replace(",0", "") : resultadoString;
	}

	private TipoComando detectarTipoComando(String texto) {
		
		if(textoAtual.isEmpty() && texto == "0") return null;
			
		try {
			Integer.parseInt(texto);
			return TipoComando.NUMERO;
		} catch (NumberFormatException e) {
			if("AC".equals(texto)) { return TipoComando.ZERAR; }
			else if("/".equals(texto)) { return TipoComando.DIV; }
			else if("*".equals(texto)) { return TipoComando.MULT; }
			else if("+".equals(texto)) { return TipoComando.SOMA; }
			else if("-".equals(texto)) { return TipoComando.SUB; }
			else if("=".equals(texto)) { return TipoComando.IGUAL; }
			else if("±".equals(texto)) { return TipoComando.TROCAROPERACAO; }
			else if(",".equals(texto) && !textoAtual.contains(",")) { 
				return TipoComando.VIRGULA; 
			}
		}
		
		return null;
	}

}
