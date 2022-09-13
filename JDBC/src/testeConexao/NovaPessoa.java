package testeConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {

	public static void main(String[] args) throws SQLException {

		Scanner sc = new Scanner (System.in);
		
		System.out.print("Informe o nome: ");
		String nome = sc.nextLine();
		
		Connection c = FabricaConexao.getConexao();
		
		String sql = "insert into pessoas (nome) values (?)";
		PreparedStatement stmt = c.prepareStatement(sql);
		stmt.setString(1, nome);
		
		stmt.execute();
		
		System.out.println("ok");
		
		sc.close();
	}

}
