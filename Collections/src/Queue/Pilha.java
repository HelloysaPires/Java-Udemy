package Queue;
import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	//Quere <interfale>: fila (fist in, fist out)
	//PriorityQuere
	//Deque<Interface> -> ArrayDeque: pilha (fist in, last out) e LinkedList
	
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("java");
		livros.push("c++");
		livros.push("python");
		
		System.out.println(livros.peek() + "\n"); // ou element();
		
		for(String aux: livros) {
			System.out.print(aux + " ");
		}
		
		System.out.println("\n" + livros.poll()); // ou pop();
		
		for(String aux: livros) {
			System.out.print(aux + " ");
		}
		
		
	}
}
