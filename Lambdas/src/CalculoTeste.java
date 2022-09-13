
public class CalculoTeste {

	public static void main(String[] args) {

		Calculo somar = (x,y) -> {
			return x+y;
		};
		System.out.println(somar.executar(2, 3));
		
		
		
		Calculo multiplicar = (x,y) ->  x*y;
		System.out.println(multiplicar.executar(2, 3));
		
		
		System.out.println(somar.legal());
		System.out.println(Calculo.muitoLegal());
	
	}

}
