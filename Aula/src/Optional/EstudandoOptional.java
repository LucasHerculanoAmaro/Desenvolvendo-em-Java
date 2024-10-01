package Optional;

import java.util.Optional;

public class EstudandoOptional {

	public static void main(String[] args) {
		
		/*	INTRODU��O 
		 
		 * 	� muito comum para os Desenvolvedores Java encontrar erros e 
		  	precisar trabalhar encima deles para evit�-los. Mas pode acontecer 
		  	de um(a) desenvolvedor(a) escrever muitas linhas para lidar com um 
		  	erro e deixar o seu c�digo muito extenso. 
		  	
		 * 	Por exemplo: Imagine que, para corrigir um erro, um(a) 
		 	desenvolvedor(a) implemente uma l�gica com diversas estruturas 
		 	IF/ELSE para cada condi��o. 
		 	Depedendo da estrutura, e do qu�o robusto for a aplica��o, o(a) 
		 	profissional levaria muito tempo para trabalhar a fim de evitar
		  	todos os poss�veis erros.	
		  		
		 * 	Por mais que a aplica��o mostra-se funcional, existem maneiras 
		  	mais simples e pr�ticas de lidar erros.
		 	
		 	
		 *	O Optional � uma Classe container que surgiu na vers�o 8 do Java,
		  	com o objetivo de simplificar o c�digo e facilitar o trabalho do(a) 
		  	Profissional Java ao lidar com valores nulos.
		 	Este recurso pertence ao pacote "java.util", usado para representar 
		 	um valor que pode ou n�o estar presente. O Optional encapsula o 
		 	retorno de m�todos e informa se o valor est� presente ou n�o.
		 	
		 *	Veja alguns motivos para usar o Optional:
		 
		 		1. Evitar NullPointerException -> Ao trabalhar com objetos, 
		 		podemos encontrar objetos que tenham valores nulos.  Usar 
		 		m�todos Optional ajuda a evitar o erro "NullPointerException"
		 		e trabalhar com valores possivelmente nulos.
		 		
		 		2. C�digo Leg�vel -> Usar Optional tornar� nosso c�digo mais 
		 		limpo e f�cil de entender.
		 		
		 		3. Encapsulamento da l�gica de aus�ncia -> Ao usar o Optional,
		 		encapsulamos a l�gica de nulidade e atribuimos as opera��es de 
		 		mapeamento e filtragem.
		*/
		
		/*		IMPLEMENTANDO OPTIONAL
		 
		 		Temos diversas maneiras de criar inst�ncias de Optional.
		 		Veremos abaixo alguns exemplos
		 */
		
		System.out.println("Conhecendo alguns m�todos Optional:\n");
//		1. Optional.of(value)
		
//		Criando uma Optional com valor n�o nulo
		Optional<String> OptionalNaoNulo = Optional.of("Hello World!");
		System.out.println("Optional n�o nulo: " + OptionalNaoNulo);
		
		/*	Quando usamos o m�todo 'of()' n�o podemos adicionar
		 	um valor nulo.
		 	Caso executar com o valor nulo, teremos o erro
		 	NullPointerException.
		*/
		
//		2. Optional.ofNullable(value)
		
//		Criando uma Optional que ceite valores nulos
		Optional<String> OptionalSimNulo = Optional.ofNullable(null);
		System.out.println("Optional com nulo: " + OptionalSimNulo);
		
		/*	Quando usamos o m�todo 'ofNullable()' podemos trabalhar
		 	com valores nulos.
		*/

//		3. Optional.empty()
		
//		Criando uma Optional vazia
		Optional<String> OptionalVazio = Optional.empty();
		System.out.println("Optional com vazio: " + OptionalVazio);
		
	}
	
}
