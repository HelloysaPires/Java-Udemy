package exercicioSubstitutoExceptions;

public class NumeroNegativo extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public NumeroNegativo (String mensagem) {
		super(mensagem);
	}
}
