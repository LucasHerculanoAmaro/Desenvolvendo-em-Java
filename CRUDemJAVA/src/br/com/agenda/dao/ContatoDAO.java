package br.com.agenda.dao;

import java.sql.Connection;
import java.sql.Date;

import com.mysql.cj.jdbc.ClientPreparedStatement;

import br.com.agenda.factory.ConnectionFactory;
import br.com.agenda.model.Contato;

public class ContatoDAO {

	//CRUD: Create - Read - Update - Delete
	
	public void save(Contato contato) {
		
		String sql = "INSERT INTO contatos(nome, idade, datacadastro) VALUES(?, ?, ?)";
		
		//Preparando conexãoo
		Connection conn = null;
		ClientPreparedStatement pstm = null;
		
		try {
			//Criando uma conexão com o banco de dados
			conn = ConnectionFactory.createConnectionToMySQL();
			
			//Criando uma prepareStatement para executar uma Query
			pstm = (ClientPreparedStatement) conn.prepareStatement(sql);
			
			//Adionando valores esperados nessa Query
			pstm.setString(1, contato.getNome());
			pstm.setInt(2, contato.getIdade());
			pstm.setDate(3, new Date(contato.getDataCadastro().getTime()));
			
			//Executando a Query
			pstm.execute();
			
			System.out.println("Contato Salvo com Sucesso!");
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			//Fechando as conexões
			try {
				if(pstm!=null) {
					pstm.close();
				}
				
				if(conn!=null) {
					conn.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
