package exercicioTres;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		
		Cliente c1 = new Cliente("Julia Almeida", "11111111111", "62999999999");
		Cliente c2 = new Cliente("Carlos Silva", "22222222222", "62888888888");

		Funcionario f1 = new Funcionario("Gabriel Rodrigues", "33333333333", 11111);
		Funcionario f2 = new Funcionario("Ana Pires", "44444444444", 22222);
		Funcionario f3 = new Funcionario("Carlos Brito", "5555555555", 33333);
		Funcionario f4 = new Funcionario("Felipe Santos", "66666666666", 444444);
		
		Aparelho ap1 = new Aparelho("123", 2022, "marca1", "modelo1", c1);
		Aparelho ap2 = new Aparelho("456", 2022, "marca2", "modelo2", c2);
				
		Atendimento at1 = new Atendimento(new Date(), "blablabla", f1, ap1);
		ap1.adicionarAtendimento(at1);

		Atendimento at2 = new Atendimento(new Date(), "blablabla", f2, ap2);
		ap2.adicionarAtendimento(at2);
		
		Atendimento at3 = new Atendimento(new Date(), "blablabla", f3, ap1);
		ap1.adicionarAtendimento(at3);

		Atendimento at4 = new Atendimento(new Date(), "blablabla", f4, ap2);
		ap2.adicionarAtendimento(at4);
		
		
		System.out.println("Aparelhos:");
		System.out.println(ap1.toString());
		System.out.println("\n");
		System.out.println(ap2.toString());

		System.out.println("\nLista de clientes e funcionários:");
		List<Object> lista = Arrays.asList(c1, c2, f1, f2, f3, f4);
		for(Object aux : lista) {
			if(aux instanceof Cliente) System.out.println("Cliente ->  " + aux.toString());
			else System.out.println("Funcionário -> " + aux.toString());
		}
	}

}
