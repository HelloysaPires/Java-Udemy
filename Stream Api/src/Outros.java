import java.util.Arrays;
import java.util.List;

import Reduce.Aluno;

public class Outros {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno ("Ana", 7.1);
		Aluno a2 = new Aluno ("Luna", 6.1);
		Aluno a3 = new Aluno ("Gui", 8.1);
		Aluno a4 = new Aluno ("Gabi", 4.0);
		Aluno a5 = new Aluno ("Gui", 7.1);
		Aluno a6 = new Aluno ("Luna", 6.1);
		Aluno a7 = new Aluno ("Joao", 8.1);
		Aluno a8 = new Aluno ("Gabi", 10);
	
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
		alunos.stream().distinct().forEach(System.out::println);
		System.out.println("\n");
		
		alunos.stream().skip(2).limit(4).forEach(System.out::println);
		System.out.println("\n");
		
		alunos.stream().takeWhile(a -> a.nota >= 6 ).forEach(System.out::println);
	}
}
