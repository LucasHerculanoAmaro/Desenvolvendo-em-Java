package Optional;

import java.util.Optional;

public class ExemploOptional {

	public static void main(String[] args) {
		
		/*
		O c�digo a seguir manipular� o objeto 'Usu�rio' com opera��es de 
		verifica��o e transforma��o dos valores contifos dentro do 'Optional'.
		*/
		
//		Criando um Objeto da classe 'Usuario'
		Usuario usuario = new Usuario(1, "Giovana", 28);
		
//		Encapsulando o Objeto 'Usuario' no usuarioOptional
		Optional<Usuario> usuarioOptional = Optional.ofNullable(usuario);
		
//		'map()' � utlizado como um la�o condicional
		usuarioOptional.map(resp -> resp.getNome())
		
//						'filter()': define um filtro com determinada condi��o
						.filter(nomeUsuario -> nomeUsuario
								
//								A condi��o que o filtro precisa
								.startsWith("L"))
						
//						'orElseThrow()' + RuntimeException para caso a condi��o for falsa
						.orElseThrow(() -> new RuntimeException("Usu�rio n�o encontrado"));
		
//		Ao exibir o nome do usu�rio, n�o se esque�a de usar m�todos
		System.out.println("\n Nome do Usu�rio: " + usuarioOptional
				
//				O m�todo 'get()' acessa o objeto para conseguir executar outro
//				m�todo 'getNome' na Classe Usuario
				.get().getNome()
				);
		
	}
	
}
