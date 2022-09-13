package exercicioDois;

public class Main {

	public static void main(String[] args) {

		LojaCon lojas[] = new LojaCon[3];
		
		lojas[0] = new LojaCon("1111111111111", "Loja 1", "exemploendereco@1", "Luiz Araujo da Silva", 1);
		lojas[1] = new LojaCon("2222222222222", "Loja 2", "exemploendereco@2", "Luiz Araujo da Silva", 2);
		lojas[2] = new LojaCon("3333333333333", "Loja 3", "exemploendereco@3", "Luiz Araujo da Silva", 3);
		
		
		for(LojaCon aux : lojas) {
			System.out.println(aux.toString());
		}
		
		lojas[0].registra_abertura_dia();
		lojas[1].registra_abertura_dia();
		lojas[2].registra_abertura_dia();

		System.out.println("\n\n");
		for(LojaCon aux : lojas) {
			System.out.println(aux.toString());
		}
		
		lojas[0].registra_abertura_dia();
		lojas[1].registra_fechamento_dia();
		lojas[2].registra_fechamento_dia();
		
		System.out.println("\n\n");
		for(LojaCon aux : lojas) {
			System.out.println(aux.toString());
		}
		
	}	
}
