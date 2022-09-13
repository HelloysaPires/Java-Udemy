package testeConexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {
	
	public static void main(String[] args) throws SQLException {
		
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Informe os caracteres do nome desejado: ");
		String consulta = sc.nextLine();
		
		
		Connection c = FabricaConexao.getConexao();
		String sql = "select * from pessoas where nome like ?";
		PreparedStatement stmt = c.prepareStatement(sql);
		stmt.setString(1, "%" + consulta + "%");
		ResultSet resultado = stmt.executeQuery();

		
		List <Pessoa> pessoas = new ArrayList<>();
		
		while(resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoa (codigo, nome));
		}
		
		for(Pessoa aux : pessoas) {
			System.out.println(aux.getCodigo() + "->" + aux.getNome());
		}
		
		stmt.close();
		c.close();
		sc.close();
	}

}
