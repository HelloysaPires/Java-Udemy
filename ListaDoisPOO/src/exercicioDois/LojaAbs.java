package exercicioDois;

public abstract class LojaAbs {
	protected int identificaor;
	protected String cnpj;
	protected String razaoSocial;
	protected boolean aberta;
	
	public LojaAbs(String cnpj, String razaoSocial) {
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.aberta =  false	;
	}

	public boolean isAberta() {
		return aberta;
	}

	public String getCnpj() {
		return cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}
	
	public String infos() {
		return "Razão social: " + razaoSocial + " - CNPJ: " + cnpj + " - Status da Loja (aberta): " + aberta;
	}
}
