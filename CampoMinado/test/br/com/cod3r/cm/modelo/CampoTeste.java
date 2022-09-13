package br.com.cod3r.cm.modelo;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.cod3r.cm.excecao.ExplosaoException;

class CampoTeste {

	private Campo campo;

	@BeforeEach
	void iniciarCampo() {
		 campo = new Campo(3,3);
	}
	
	@Test
	void testeVizinhoRealDistanciaEsquerda() {
		Campo vizinhoEsquerda = new Campo(3,2);
		
		boolean resultadoEsquerda = campo.adicionarVizinho(vizinhoEsquerda);
		assertTrue(resultadoEsquerda);
	}
	
	@Test
	void testeVizinhoRealDistanciaDireita() {
		Campo vizinhoDireita = new Campo(3,4);
		
		boolean resultadoDireita = campo.adicionarVizinho(vizinhoDireita);
		assertTrue(resultadoDireita);
	}
	
	@Test
	void testeVizinhoRealDiagonal() {
		Campo vizinhoDiagonal = new Campo(2,2);
		
		boolean resultadoDiagonal = campo.adicionarVizinho(vizinhoDiagonal);
		assertTrue(resultadoDiagonal);
	}
	
	@Test
	void testeVizinhoFalso() {
		Campo vizinho = new Campo(4,6);
		
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertFalse(resultado);
	}
	
	@Test 
	void testeMarcado(){
		assertFalse(campo.isMarcado());
		campo.alternarMarcado();
		assertTrue(campo.isMarcado());
	}
	
	@Test 
	void testeAbrirNaoMinadoNaoMarcado(){
		assertTrue(campo.abrir());
	}
	
	@Test 
	void testeAbrirNaoMinadoMarcado(){
		campo.alternarMarcado();
		assertFalse(campo.abrir());
	}
	
	@Test 
	void testeAbrirMinadoMarcado(){
		campo.alternarMarcado();
		campo.minar();
		assertFalse(campo.abrir());
	}
	
	@Test 
	void testeAbrirMinadoNaoMarcado(){
		campo.minar();
		assertThrows(ExplosaoException.class, () -> {
			campo.abrir();
		});
   }
	@Test
	void testeAbrirComViznho1(){
		Campo campo11 = new Campo(1,1);
		Campo campo22 = new Campo(2,2);
		
		campo22.adicionarVizinho(campo11);
		campo.adicionarVizinho(campo22);
		
		campo.abrir();
		
		assertTrue(campo.isAberto() && campo11.isAberto());
		
	}
	@Test
	void testeAbrirComViznho2() {
		Campo campo11 = new Campo(1,1);
		Campo campo12 = new Campo(1,1);
		Campo campo22 = new Campo(2,2);
		campo12.minar();
		
		campo22.adicionarVizinho(campo11);
		campo22.adicionarVizinho(campo12);
		
		campo.adicionarVizinho(campo22);
		campo.abrir();
		
		assertTrue(campo.isAberto() && !campo11.isAberto());
		
	}
}
