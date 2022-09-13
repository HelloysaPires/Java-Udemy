package Set;
import java.util.HashSet;
import java.util.Set;

public class Conjunto {

	public static void main(String[] args) {
		
		//Set (interface): não aceita itens duplicaods, não tem indice
		//HashSet: não ordenado
		//LinkedSet: ordenado por inserção
		//SortedSet(interface) -> TreeSet: ordenado por ordem crescente, etc
		
		Set<Integer> conjunto = new HashSet<>();
		conjunto.add(1);
		conjunto.add(5);
		conjunto.add(7);
		conjunto.add(10);
		System.out.println(conjunto);
		System.out.println(conjunto.size());
		
		conjunto.remove(1);
		System.out.println(conjunto);
		System.out.println(conjunto.size());
		
	    System.out.println(conjunto.contains(1));
	    System.out.println(conjunto.contains(5));

		conjunto.clear();
		System.out.println(conjunto);
		System.out.println(conjunto.size());
		
		conjunto.add(1);
		conjunto.add(5);
		conjunto.add(7);
		conjunto.add(10);
		
		Set<Integer> num = new HashSet<>();
		num.add(100);
		num.add(8);
		num.add(17);
		num.add(20);
		num.add(6);
		System.out.println(num);
		
		
		conjunto.addAll(num);
		System.out.println(conjunto);
		
		for(Integer aux: num) {
			System.out.print(aux + " ");
		}
	
		
	}
}
