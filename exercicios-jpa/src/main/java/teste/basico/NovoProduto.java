package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {

	public static void main(String[] args) {

		DAO <Produto> dao = new DAO <>(Produto.class);
		Produto produto = new Produto("Notbook", 4307.82);
		
		dao.incluirAtomico(produto).fechar();
	}

}
