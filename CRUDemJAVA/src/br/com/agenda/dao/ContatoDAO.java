package br.com.agenda.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.ClientPreparedStatement;

import br.com.agenda.factory.ConnectionFactory;
import br.com.agenda.model.Contato;

public class ContatoDAO {

	//CRUD: Create - Read - Update - Delete
	//C - Feito
	
	public void save(Contato contato) {
		
		String sql = "INSERT INTO contatos(nome, idade, datacadastro) VALUES(?, ?, ?)";
		
		//Preparando conexão
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
	
	public List<Contato> getContatos() {
		
		String sql = "SELECT * FROM contatos";
		
		List<Contato> contatos = new ArrayList<Contato>();
		
		Connection conn = null;
		ClientPreparedStatement pstm = null;
		
		//Classe que vai recuperar os dados do banco  ***SELECT***
		ResultSet rset = null;
		
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			
			pstm = (ClientPreparedStatement) conn.prepareStatement(sql);
			
			rset = pstm.executeQuery();
			
			while (rset.next()) {
				
				Contato contato = new Contato();
				
				//Recuperar o ID
				contato.setId(rset.getInt("id"));
				//Recuperar o nome
				contato.setNome(rset.getString("nome"));
				//Recuperar a idade
				contato.setIdade(rset.getInt("idade"));
				//Recuperar data de cadastro
				contato.setDataCadastro(rset.getDate("dataCadastro"));
				
				contatos.add(contato);
				}
			
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(rset!=null) {
					rset.close();
					}
				
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
			return contatos;	
	}

	public void update(Contato contato) {
		
		String sql = "UPDATE contatos SET nome = ?, idade = ?, datacadastro = ?" + "Where id = ?";
		
		Connection conn = null;
		ClientPreparedStatement pstm = null;
		
		try {
			//Criar conexão com o banco
			conn = ConnectionFactory.createConnectionToMySQL();
			
			//Criar a classe para executar a query
			pstm = (ClientPreparedStatement) conn.prepareStatement(sql);
			
			//Adicionando os valores para atualizar
			pstm.setString(1, contato.getNome());
			pstm.setInt(2,  contato.getIdade());
			pstm.setDate(3,  new Date(contato.getDataCadastro().getTime()));
			
			//Qual é o id que você deseja atualizar
			pstm.setInt(4,  contato.getId());
			
			//Executar a query
			pstm.execute();
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstm!=null) {
					pstm.close();
				}
				
				if(conn!=null) {
					conn.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}		
	}		

	public void deleteByID(int id) {
		
		String sql = "DELETE FROM contatos WHERE id = ?";
		
		Connection conn = null;
		
		ClientPreparedStatement pstm = null;
		
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			
			pstm = (ClientPreparedStatement) conn.prepareStatement(sql);
			
			pstm.setInt(1,  id);
			
			pstm.execute();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (pstm!=null) {
					pstm.close();
				}
				
				if (conn!=null) {
					conn.close();
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
	

