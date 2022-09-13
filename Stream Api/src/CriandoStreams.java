import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {
		Consumer<String> print = System.out::print;
		
		Stream<String> langs = Stream.of("Java ", "Lua ", "Js\n");
		langs.forEach(print);
		System.out.println("\n");
		
		String[] maisLangs = {"Python ", "Lisp ", "Go\n"};
		Stream.of(maisLangs).forEach(print);
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs, 1, 2).forEach(print);
		System.out.println("\n");
		
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kot ");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);
		System.out.println("\n");
		
		//Stream.generate(() -> "a").forEach(print);
		Consumer<Object> println = System.out::println;
		//Stream.iterate(0, n -> n+1).forEach(println);
		
	
	}
}
