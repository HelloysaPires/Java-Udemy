package Queue;
import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	//Quere <interfale>: fila (fist in, fist out)
	//PriorityQuere
	//Deque<Interface> -> ArrayDeque pilha (fist in, last out) e LinkedList
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		//adicicionam
		fila.add("Ana"); // retorna false (lista cheia)
		fila.offer("Julia"); // lança excessão
		fila.add("Carlos");
		fila.offer("Gui");
		fila.add("Lucas");
		fila.offer("Pedro");
		
		for(String aux: fila) {
			System.out.print(aux + " ");
		}
		
		//pega o proximo elemento da fila mas não remove
		System.out.println("\n" + fila.peek()); // retorna null (fila vazia)
		System.out.println(fila.element()); // excessão
		
		System.out.println(fila.poll()); // pega o proximo elemento da fila e remove
		System.out.println(fila.poll()); // retorna null caso a lista esteja vazia
		System.out.println(fila.remove()); // excessão
		
		for(String aux: fila) {
			System.out.print(aux + " ");
		}
	}

}
