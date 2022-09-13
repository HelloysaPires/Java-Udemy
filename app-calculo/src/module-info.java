import br.com.cod3r.app.Calculadora;
import br.com.cod3r.app.calculo.CalculadoraImp;

module app.calculo {
	exports br.com.cod3r.app.calculo;
	requires transitive app.logging;
	
	exports br.com.cod3r.app.calculo.interno to app.financeiro;
	
	requires app.api;
	provides Calculadora with CalculadoraImp;
	
}