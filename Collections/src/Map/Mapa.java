package Map;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	//chava valor
	public static void main(String[] args) {
		Map <Integer, String> mapa = new HashMap<> ();
		
		mapa.put(1, "ana");
		mapa.put(2, "julia");
		mapa.put(2, "clara"); //substitiu o valor julia pra clara
		mapa.put(5, "carla");
		
		System.out.println(mapa.size());
		System.out.println(mapa.keySet());
		System.out.println(mapa.values());
		System.out.println(mapa.entrySet());
		System.out.println(mapa.containsKey(5));
		System.out.println(mapa.containsKey(20));
		System.out.println(mapa.get(5));


		for(Integer aux: mapa.keySet()) {
			System.out.print(aux + " ");
		}
		
		System.out.println();
		for(String aux: mapa.values()) {
			System.out.print(aux + " ");
		}
		
		System.out.println();
		for(Entry<Integer, String> aux : mapa.entrySet()) {
			System.out.print(aux.getKey() + " ");
			System.out.print(aux.getValue() + " ");

		}
	}

}
