package Optional;

import java.util.Optional;

public class ExemploOptional {

	public static void main(String[] args) {
		
		/*
		O código a seguir manipulará o objeto 'Usuário' com operações de 
		verificação e transformação dos valores contifos dentro do 'Optional'.
		*/
		
//		Criando um Objeto da classe 'Usuario'
		Usuario usuario = new Usuario(1, "Giovana", 28);
		
//		Encapsulando o Objeto 'Usuario' no usuarioOptional
		Optional<Usuario> usuarioOptional = Optional.ofNullable(usuario);
		
//		'map()' é utlizado como um laço condicional
		usuarioOptional.map(resp -> resp.getNome())
		
//						'filter()': define um filtro com determinada condição
						.filter(nomeUsuario -> nomeUsuario
								
//								A condição que o filtro precisa
								.startsWith("L"))
						
//						'orElseThrow()' + RuntimeException para caso a condição for falsa
						.orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
		
//		Ao exibir o nome do usuário, não se esqueça de usar métodos
		System.out.println("\n Nome do Usuário: " + usuarioOptional
				
//				O método 'get()' acessa o objeto para conseguir executar outro
//				método 'getNome' na Classe Usuario
				.get().getNome()
				);
		
	}
	
}
