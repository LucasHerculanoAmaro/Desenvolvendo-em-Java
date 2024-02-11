package br.com.agenda.aplicacao;

import java.util.Date;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

public class Main {

	public static void main(String[] args) {
		
		ContatoDAO contatoDao = new ContatoDAO();
		
		Contato contato = new Contato();
		/*
		contato.setNome("Maria Gabriela");
		contato.setIdade(55);
		contato.setDataCadastro(new Date());
		
		contato.setNome("João Gabriel");
		contato.setIdade(78);
		contato.setDataCadastro(new Date());*/
		
		contato.setNome("João Carlos");
		contato.setIdade(18);
		contato.setDataCadastro(new Date());
		
		//contatoDao.save(contato);
		
		//Atualizar contato
		Contato c1 = new Contato();
		c1.setNome("Maria Gabriela Dias Orlando");
		c1.setIdade(37);
		c1.setDataCadastro(new Date());
		c1.setId(11);// É o número que está no banco de dados PK
		
		//contatoDao.update(c1);
		
		//Deletar contato pelo ID
		contatoDao.deleteByID(11);
		
		//Visualização de TODOS os registros do banco de dados 
		for(Contato c : contatoDao.getContatos()) {
			System.out.println("Contato: " + c.getNome());
		}
		
	}
	
}
