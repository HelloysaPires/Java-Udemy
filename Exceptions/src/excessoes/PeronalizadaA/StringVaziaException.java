package excessoes.PeronalizadaA;

@SuppressWarnings("serial")
public class StringVaziaException extends RuntimeException {

			private String nomeAtributo;

		    public StringVaziaException(String nomeAtributo) {
		        this.nomeAtributo = nomeAtributo;
		    }

		    public String getMessage() {
		        return String.format("O atributo %s esta vazio.", nomeAtributo);
		    }
		
	}
