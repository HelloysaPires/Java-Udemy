package testeConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DesafioMudarNome {

	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Informe o cogido da pessoa: ");
		int codigo = sc.nextInt();
		
		Connection c = FabricaConexao.getConexao();
		String select = "select codigo, nome from pessoas where codigo = ?";
		String update = "update pessoas set nome = ? where codigo = ?";
		
		PreparedStatement stmt = c.prepareStatement(select);
		stmt.setInt(1, codigo);
		ResultSet resultado = stmt.executeQuery();
		
		if(resultado.next()) {
			
			Pessoa p = new Pessoa(resultado.getInt(1), resultado.getString(2));
			
			System.out.println("O nome atual eh: " + p.getNome());
			sc.nextLine();
			
			System.out.println("Informe o novo nome: ");
			String novoNome = sc.nextLine();
			
			stmt.close();
			stmt = c.prepareStatement(update);
			stmt.setString(1, novoNome);
			stmt.setInt(2, codigo);
			stmt.execute();
			
			System.out.println("Feito!");
			
		}
		
		c.close();
		sc.close();
		stmt.close();
		
		
	}

}
