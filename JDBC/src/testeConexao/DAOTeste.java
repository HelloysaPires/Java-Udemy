package testeConexao;

public class DAOTeste {

	public static void main(String[] args) {

		DAO dao = new DAO();
		
		String sql = "insert into pessoas (nome, codigo) values (?,?)";
		
		//System.out.println(dao.incluir(sql, "Joao da Silva"));
		//System.out.println(dao.incluir(sql, "Luiz Felipe"));
		//System.out.println(dao.incluir(sql, "Guilherme"));
		
		System.out.println(dao.incluir(sql, "Gabriel", 8));


		dao.close();
	}

}
