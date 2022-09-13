package exercicioDois;

public class LojaCon extends LojaAbs implements Registro {
  
	private String endereco, gerente;
	
    public LojaCon(String cnpj, String razaoSocial, String endereco, String gerente, int identificador) {
    	super(cnpj, razaoSocial);
    	this.endereco = endereco;
    	this.gerente = gerente;
    	this.identificaor = identificador;
    }
	

    
	public String toString() {
		return "Razao social: " +razaoSocial+ " - Identificador: " +identificaor+ " - CNPJ: " +cnpj+
				" - Aberta: " +aberta+  " - Gerente: " +gerente + " - Endereco: " +endereco;
	}

	@Override
	public void registra_abertura_dia() {
		if(!aberta) aberta = true;
	}

	@Override
	public void registra_fechamento_dia() {
		if(aberta) aberta = false;
	}
}
