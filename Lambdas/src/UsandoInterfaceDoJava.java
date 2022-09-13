import java.util.function.BinaryOperator;

public class UsandoInterfaceDoJava {
	public static void main(String[] args) {
		
		BinaryOperator<Double> c1 = (x,y) ->  x + y;
		System.out.println(c1.apply(2.0,3.0));
		
		BinaryOperator<Integer> c2 = (x,y) ->  x + y;
		System.out.println(c2.apply(2, 3));
	}
}
