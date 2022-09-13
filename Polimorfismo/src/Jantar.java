
public class Jantar {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(99.600);
		
		Arroz i1 = new Arroz(0.2);
		Feijao i2 = new Feijao(0.1);
		Sorvete i3 = new Sorvete(0.5);
	
		System.out.println(p1.getPeso());
		
		p1.comer(i2);
		p1.comer(i2);
		p1.comer(i3);
		System.out.println(p1.getPeso());
	}

}
