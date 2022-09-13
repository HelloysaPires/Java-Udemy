package List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
		//List <interface>: aceita itens duplicados, é ordenado (por insercao), é indexado
    	//ArrayList
    	//LinkedList
    	//Stack
    	//Vector
    	
    	List <Usuario> lista = new ArrayList<>();
    	
    	lista.add(new Usuario("Ana"));
    	lista.add(new Usuario("Jose"));
    	lista.add(new Usuario("Carla"));
    	lista.add(new Usuario("Bia"));
    	lista.add(new Usuario("Bia"));
    	lista.add(new Usuario("Pedro"));
    	
    	for(Usuario aux: lista) {
    		System.out.print(aux.nome + " ");
    	}
    	
    	System.out.println("\n" + lista.get(1).nome);
    	lista.remove(new Usuario("Bia"));
   
    	System.out.println(lista);
    	
    	for(Usuario aux: lista) {
    		System.out.print(aux.nome + " ");
    	}

    }
}
