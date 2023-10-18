package connection;

import java.sql.*;


public class Conexao {
	
	private static final String URL = "jdbc:mysql://localhost:3306/AgenciaBoraLaViagens";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "banco397350";
	
	public static Connection createConnection() {
		try { 
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver encontrado!");	
		} catch (ClassNotFoundException e){ 
			System.out.println("Driver nao encontrado!");
		}
		
		try {
			Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("Conectado com sucesso!");
			return connection;
		} catch (SQLException e) {
			System.out.println("Nao foi possivel conectar ao banco! Mensagem: " + e.getMessage());
			return null;
		}
	}
}