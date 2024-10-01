package Optional;

import java.util.Optional;

public class EstudandoOptional {

	public static void main(String[] args) {
		
		/*	INTRODUÇÃO 
		 
		 * 	É muito comum para os Desenvolvedores Java encontrar erros e 
		  	precisar trabalhar encima deles para evitá-los. Mas pode acontecer 
		  	de um(a) desenvolvedor(a) escrever muitas linhas para lidar com um 
		  	erro e deixar o seu código muito extenso. 
		  	
		 * 	Por exemplo: Imagine que, para corrigir um erro, um(a) 
		 	desenvolvedor(a) implemente uma lógica com diversas estruturas 
		 	IF/ELSE para cada condição. 
		 	Depedendo da estrutura, e do quão robusto for a aplicação, o(a) 
		 	profissional levaria muito tempo para trabalhar a fim de evitar
		  	todos os possíveis erros.	
		  		
		 * 	Por mais que a aplicação mostra-se funcional, existem maneiras 
		  	mais simples e práticas de lidar erros.
		 	
		 	
		 *	O Optional é uma Classe container que surgiu na versão 8 do Java,
		  	com o objetivo de simplificar o código e facilitar o trabalho do(a) 
		  	Profissional Java ao lidar com valores nulos.
		 	Este recurso pertence ao pacote "java.util", usado para representar 
		 	um valor que pode ou não estar presente. O Optional encapsula o 
		 	retorno de métodos e informa se o valor está presente ou não.
		 	
		 *	Veja alguns motivos para usar o Optional:
		 
		 		1. Evitar NullPointerException -> Ao trabalhar com objetos, 
		 		podemos encontrar objetos que tenham valores nulos.  Usar 
		 		métodos Optional ajuda a evitar o erro "NullPointerException"
		 		e trabalhar com valores possivelmente nulos.
		 		
		 		2. Código Legível -> Usar Optional tornará nosso código mais 
		 		limpo e fácil de entender.
		 		
		 		3. Encapsulamento da lógica de ausência -> Ao usar o Optional,
		 		encapsulamos a lógica de nulidade e atribuimos as operações de 
		 		mapeamento e filtragem.
		*/
		
		/*		IMPLEMENTANDO OPTIONAL
		 
		 		Temos diversas maneiras de criar instâncias de Optional.
		 		Veremos abaixo alguns exemplos
		 */
		
		System.out.println("Conhecendo alguns métodos Optional:\n");
//		1. Optional.of(value)
		
//		Criando uma Optional com valor não nulo
		Optional<String> OptionalNaoNulo = Optional.of("Hello World!");
		System.out.println("Optional não nulo: " + OptionalNaoNulo);
		
		/*	Quando usamos o método 'of()' não podemos adicionar
		 	um valor nulo.
		 	Caso executar com o valor nulo, teremos o erro
		 	NullPointerException.
		*/
		
//		2. Optional.ofNullable(value)
		
//		Criando uma Optional que ceite valores nulos
		Optional<String> OptionalSimNulo = Optional.ofNullable(null);
		System.out.println("Optional com nulo: " + OptionalSimNulo);
		
		/*	Quando usamos o método 'ofNullable()' podemos trabalhar
		 	com valores nulos.
		*/

//		3. Optional.empty()
		
//		Criando uma Optional vazia
		Optional<String> OptionalVazio = Optional.empty();
		System.out.println("Optional com vazio: " + OptionalVazio);
		
	}
	
}
