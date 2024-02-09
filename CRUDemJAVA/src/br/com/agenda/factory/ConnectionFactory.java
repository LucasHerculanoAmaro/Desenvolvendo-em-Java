package br.com.agenda.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	// Nome do Usuário
	private static final String USERNAME = "root";	
	
	// Senha do Banco
	private static final String PASSWORD = "root";
	
	// Caminha do banco de dados, porta, nome do banco de dados
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/agenda";
	
	/*
	 * Conexão com o banco de dados 
	 */
	public static Connection createConnectionToMySQL() throws Exception {
		
		//Faz com que a classe seja carregada pela JVM
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		
		return connection;
	}
	
	public static void main(String[] args) throws Exception{
		
		//Recuperar conexão com o banco de dados
		Connection con = createConnectionToMySQL();
		
		//Testar se a conexão é nula
		if(con !=null) {
			System.out.println("Conexão obtia com sucesso!");
			con.close();
		}
	}
	
}