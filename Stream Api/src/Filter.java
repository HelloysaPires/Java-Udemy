import java.util.Arrays;
import java.util.List;

public class Filter {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Bia", 7.8);
		Aluno a2 = new Aluno("Ana", 5.8);
		Aluno a3 = new Aluno("Gui", 8);
		Aluno a4 = new Aluno("Pedro", 9.7);
		Aluno a5 = new Aluno("Pedro", 6);
		Aluno a6 = new Aluno("Hello", 7.1);
		Aluno a7 = new Aluno("Julia", 4);
		
		List <Aluno> alunos =  Arrays.asList(a1, a2, a3, a4, a5, a6, a7);
		
		alunos.stream().filter((a)-> a.nota >=7)
					   .map((a) -> "Parabens " + a.nome + "! Voce foi foi aprovado!")
					   .forEach(System.out::println);
	}

}
