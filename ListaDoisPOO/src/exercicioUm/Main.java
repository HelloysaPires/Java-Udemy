package exercicioUm;

public class Main {

	public static void main(String[] args) {
		
		Funcionario f[] = new Funcionario[10];
		f[0] = new Gerente("Helloysa", "Pires", 5000, 800);
		
		f[1] = new Horista("Julia", "Borges", 120, 35);
		f[2] = new Horista("Luiz", "Carlos", 170, 40);
		
		f[3] = new Comissionado("Ana", "Almeida", 1600, 1, 50000);
		f[4] = new Comissionado("Joao", "Felié", 1200, 2, 70000);
		f[5] = new Comissionado("Luis", "Carlos", 1300, 1, 40000);
		
		f[6] = new Administrador("Nicolas", "Maulaiz", 2600);
		f[7] = new Administrador("Thiago", "Zelli", 2728);
		f[8] = new Administrador("Gabriel", "Borba", 2727);
		f[9] = new Administrador("Maria", "Eduarda", 3000);


		for(int i = 0; i<10; i++) {
			System.out.println(f[i].toString());
		}
	}

}
