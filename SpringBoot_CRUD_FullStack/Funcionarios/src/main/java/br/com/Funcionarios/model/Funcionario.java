package br.com.Funcionarios.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Funcionarios")
public class Funcionario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "nome")
	private String Nome;
	
	@Column(name = "sobrenome")
	private String Sobrenome;
	
	@Column(name = "email")
	private String Email;
	
	public Funcionario() {
		
	}
	
	//Foi Criado um Constructor, para iniciar as variáveis com valores 
	public Funcionario(String nome, String sobrenome, String email) {
		super();
		Nome = nome;
		Sobrenome = sobrenome;
		this.Email = email;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getSobrenome() {
		return Sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		Sobrenome = sobrenome;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		this.Email = email;
	}
	
	
	
}
