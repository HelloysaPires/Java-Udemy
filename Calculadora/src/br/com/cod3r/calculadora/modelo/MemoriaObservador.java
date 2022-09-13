package br.com.cod3r.calculadora.modelo;

@FunctionalInterface
public interface MemoriaObservador {
	void valorAlterado(String novoValor);
}
