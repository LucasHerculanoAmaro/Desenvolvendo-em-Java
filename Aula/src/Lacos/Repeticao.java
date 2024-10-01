package Lacos;

import java.util.Scanner;

public class Repeticao {

	public static void main(String[] args) {
		
/*		ESTRUTURA DE REPETIÇÃO
 
 * 		São Loops. Repetirá um bloco de código enquanto
 		sua condição for verdadeira. Por exemplo:
 		
 *			Bilhete Único -> Verifica se a pessoa é menor de 6 anos:
  				-> Menor que 16: o transporte é gratuíto.
  				-> Maior 16: o transporte não é gratuito.
 
 *		Temos uma variável 'idade' que, a cada looping, contabilizará
 		+1 a variável. Por exemplo:
 		
 *			-> primeiro looping - idade = 0;
 			-> segundo looping - idade = 1;
 			
 		O looping só encerrará quando a variável atingir certa condição:
 		
 			Enquanto idade < 6.
 */		
		Scanner leia = new Scanner(System.in);
/*		FOR
		
*		FOR (expressão; condição de teste; contador) {	bloco de código	}
*		FOR (idade = 0; idade < 6; idade++) {	bloco de código	}
		
*		Diagrama: Início -> Contador -> Condição -> Bloco de código -> Fim			
*/		
		
		
//		Contando com Incremento
		for (int a = 0; a <= 10; ++a) {
			System.out.println("A variável A contou: " + a);
		}
		
//		Contando com Decremento
		for (int b = 10; b >= 0; --b) {
			System.out.println("A variável B contou: " + b);
		}
	
		
/*		WHILE*/
		
		int num = -1;
		
//		Inicio da estrutura while
		while (
//				Adicionando uma condição
				num 
				!= // Diferente
				10) {
			
//			Entrada de dados do usuário
			System.out.println("Digite um número: ");
			
//			Agregando valor a variável
			num = leia.nextInt();
			
//			Usando a estrutura IF/ELSE para trabalhar com as possibilidades
			if (num == 10) {
				System.out.println("Você acertou!");
			} else {
				System.out.println("Você errou. Não é este número: " + num);
			}
			
		}

		
//		DO/WHILE
		int contagem = 10;
		
		do {
			System.out.println(contagem);
			contagem--;
		} while (contagem > 0);
		
		
	}
	
}
