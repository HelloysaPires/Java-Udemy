package testeConexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class testeConexao {
	
	public static void main(String[] args) throws SQLException  {
		
		String url = "jdbc:mysql://localhost?useSSL=false";
		String usuario =  "root";
		String senha = "Password@123";
		
		Connection conexao = DriverManager.getConnection(url, usuario, senha);
		
		System.out.println("Conectado!");
		conexao.close();	
				
	}
}
