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
		*/
		contato.setNome("JJo�o Gabriel");
		contato.setIdade(78);
		contato.setDataCadastro(new Date());
		
		contatoDao.save(contato);
		
	}
	
}
