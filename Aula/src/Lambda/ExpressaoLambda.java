package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExpressaoLambda {

	public static void main(String[] args) {
		
/*		EXPRESS�O LAMBDA
 
 * 		Essa express�o � um fun��o an�nima que h� no Java.
 		Esta fun��o n�o tem nome e pode ser passada por argumento
 		para m�todos ou armazenada em vari�veis.

 * 		Essa express�o surgiu na vers�o Java 8, e muitos 
 		profissionais utilizam essa fun��o para simplificar o
 		c�digo que utiliza interfaces com m�todos abstratos.
 
 * 		A sua sintaxe � simples, e apresenta:
			( PAR�METROS ) -> EXPRESS�O/DECLARA��O
 
 * 		Veja a seguir alguns exemplos da express�o Lambda.
 
 *		CURIOSIDADE: 

  		RUNNABLE = � uma interface que pode ser implementada por 
  		qualquer classe capaz de definir e executar por uma THREAD.
  		A classe pode definir um m�todo sem argumento, chamado
  		'run()'.
  		
 * 		THREAD = � uma forma de executar um processo em paralelo a 
 		ou processo em execu��o.
 */
		System.out.println("Criando um 'Hello World' com Lambda sem par�metro:");
		
//		Criando 'Hello World' com Runnable + Lambda
		Runnable r = () -> System.out.println("Hello World!");
		
//		Executando o nosso Objeto com o m�todo 'run()'
		r.run(/* M�todo sem argumento */);
		
		
		System.out.println("\nCriando um 'Ol�' com Lambda com par�metro:");
		
/*		INTERFACE FUNCIONAL
 
 * 		Nos exemplos a seguir ser� utilizado as Interfaces Funcionais, 
		onde apenas um m�todo abstrato ser� criado.
 
 * 		OBS:. As anota��es n�o s�o obrigat�rias.
 */
		
//		Criando uma interface 'Saudacao', para instanciar um m�todo
		@FunctionalInterface
		interface Saudacao {
			
//			Criando o m�todo 'digaOi' com 'nome' do tipo String
			void digaOi(String name);
			
		}
		
//		Atribuindo o objeto ao par�metro da interface
		Saudacao saudacao = (name) -> System.out.println("Oi, " + name);
		
//		Adicionando o valor no par�metro que ser� atribu�do ao objeto
		saudacao.digaOi("Lucas");
		
		
		System.out.println("\nCriando opera��es matem�ticas com Lambda:");

//		Criando uma interface 'OperacaoMatematica' com dois par�metros
		@FunctionalInterface
		interface OperacaoMatematica {
			int operacao(int a, int b);
		}
		
//		Realizando as opera��es
		OperacaoMatematica adicao = (a, b) -> a + b;
		OperacaoMatematica subtracao = (a, b) -> a - b;
		
//		Imprimindo a soma das opera��es
		System.out.println("Adi��o: " + adicao.operacao(5, 3));
		System.out.println("Subtra��o: " + subtracao.operacao(5, 3));
		
		System.out.println("\nCriando uma lista e selecionando os nomes com Lambda: ");
		
//		Criando uma lista de nomes	
		List<String> nomes = Arrays.asList("Lucas", "Juliana", "Nelson", "Leia", "Majin Boo");
		
//		Utilizando forEach com Lambda para imprimir
		nomes.forEach(nome -> System.out.println(nome));
		
		
		System.out.println("\nCriando cole��es stream e selecionando os nomes com Lambda:");
		
/*		CURIOSIDADE
 
 * 		A STREAM API oferece a possibilidade de trabalhar com conjunto
  		de elementos de maneira mais simples. A proposta � diminuir a 
  		forma de implementar controle de fluxo ao lidar com collections.
  		
 * 		Podemos trabalhar com os elementos de um objeto, realizando a��es
 		de filtragem, mapeamento, transforma��o, etc.
 		
 * 		Uma STREAM COLLECT() realiza uma opera��o de redu��o mut�vel nos
 		elementos de fluxo. Isso significa que os elementos que s�o
 		processados s�o aumulados em um objeto que podem sofrer altera��es.
 
 * 		No exemplo abaixo, usamos junto como par�metro de m�todo 'collection()'
  		o m�todo 'toList()', que acumla os elementos em uma lista.
 */		
		
//		Criando uma lista e atribuindo stream ao objeto
		List<String> filtroNomes = nomes.stream()
//										Criando filtro e adicionando express�o Lambda
										.filter(nome -> nome.startsWith("L"))
//										Utilizando o m�todo 'collect()' e 'toList()' como par�metro
										.collect(Collectors.toList());
		
//		Selecionando os elementos da lista, ao qual passou pelo filtro
		System.out.println(filtroNomes);
		
	}
	
}
