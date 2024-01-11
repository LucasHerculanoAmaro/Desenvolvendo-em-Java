package net.guides.springboot2.springboot2jpacrudexample.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "funcionarios")
public class Funcionarios {

		private long id;;
		private String nome;
		private String sobrenome;
		private String email;
		
		public Funcionarios() {
			
		}
		
		public Funcionarios(String nome, String sobrenome, String email) {
			this.nome = nome;
			this.sobrenome = sobrenome;
			this.email = email;
		}
		

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO) // Com essa anotação, o ID será criado automáticamente 
		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

// A Anotação @Column é criada para mapear o objeto para a coluna
		@Column(name = "nome", nullable = false)
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		@Column(name = "sobrenome", nullable = false)
		public String getSobrenome() {
			return sobrenome;
		}

		public void setSobrenome(String sobrenome) {
			this.sobrenome = sobrenome;
		}

		@Column(name = "email", nullable = false)
		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
		
/*	A anotação @Override indica que o método toString() está substituindo o método Funcionarios().
 * 	Isso ajuda a vitar erros de compilação.
 */
		@Override 
		public String toString() {
			return "Funcionarios ["+
						"id = " + id + ", "+ 
						"nome = " + nome + ", "+ 
						"sobrenome = " + sobrenome + ", "+ 
						"email = " + email + 
					"]";
		}
		
		
}
