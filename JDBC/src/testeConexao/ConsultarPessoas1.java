package testeConexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarPessoas1 {

	public static void main(String[] args) throws SQLException {
		
		Connection c = FabricaConexao.getConexao();
		
		String sql = "select * from pessoas";
		
		Statement stmt = c.createStatement();
		ResultSet resultado = stmt.executeQuery(sql);
		
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
	}

}
