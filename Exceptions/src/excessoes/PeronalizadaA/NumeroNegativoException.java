package excessoes.PeronalizadaA;

@SuppressWarnings("serial")
public class NumeroNegativoException extends RuntimeException {

		private String nomeAtributo;

	    public NumeroNegativoException(String nomeAtributo) {
	        this.nomeAtributo = nomeAtributo;
	    }

	    public String getMessage() {
	        return String.format("O atributo %s esta negativo.", nomeAtributo);
	    }
	
}


