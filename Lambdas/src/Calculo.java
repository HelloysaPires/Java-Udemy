
@FunctionalInterface
public interface Calculo {
	double executar(double a, double b); // método abstratao
	
	default String legal() {
		return "Legal";
	}
	
	static String muitoLegal() {
		return "Muito legal";
	}
}
