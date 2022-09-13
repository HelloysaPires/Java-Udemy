package testeConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {
	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Informe o codigo: ");
		int codigo = sc.nextInt();

		Connection c = FabricaConexao.getConexao();
		String sql = "delete from pessoas where codigo = ?";
		PreparedStatement stmt = c.prepareStatement(sql);
		stmt.setInt(1, codigo);
		
		if(stmt.executeUpdate() > 0) {
			System.out.println("Pessoa exluida");
		}else {
			System.out.println("Erro!");
		}
		
		c.close();
		sc.close();
	}
}
