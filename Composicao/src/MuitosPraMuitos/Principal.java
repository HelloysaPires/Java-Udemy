package MuitosPraMuitos;

public class Principal {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno("Joao");
		Aluno aluno2 = new Aluno("Ana");
		Aluno aluno3 = new Aluno("Pedro");
		
		Curso curso1 = new Curso("Java");
		Curso curso2 = new Curso("C++");
		Curso curso3 = new Curso("Web");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3); 
		
		System.out.println(curso1.alunos);
		System.out.println(curso2.alunos);
		System.out.println(curso3.alunos);
		
		System.out.println("");
		
		System.out.println(aluno1.cursos);
		System.out.println(aluno2.cursos);
		System.out.println(aluno3.cursos);

		
	

	}

}
