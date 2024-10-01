package Lacos;

import java.util.Scanner;

public class Repeticao {

	public static void main(String[] args) {
		
/*		ESTRUTURA DE REPETI��O
 
 * 		S�o Loops. Repetir� um bloco de c�digo enquanto
 		sua condi��o for verdadeira. Por exemplo:
 		
 *			Bilhete �nico -> Verifica se a pessoa � menor de 6 anos:
  				-> Menor que 16: o transporte � gratu�to.
  				-> Maior 16: o transporte n�o � gratuito.
 
 *		Temos uma vari�vel 'idade' que, a cada looping, contabilizar�
 		+1 a vari�vel. Por exemplo:
 		
 *			-> primeiro looping - idade = 0;
 			-> segundo looping - idade = 1;
 			
 		O looping s� encerrar� quando a vari�vel atingir certa condi��o:
 		
 			Enquanto idade < 6.
 */		
		Scanner leia = new Scanner(System.in);
/*		FOR
		
*		FOR (express�o; condi��o de teste; contador) {	bloco de c�digo	}
*		FOR (idade = 0; idade < 6; idade++) {	bloco de c�digo	}
		
*		Diagrama: In�cio -> Contador -> Condi��o -> Bloco de c�digo -> Fim			
*/		
		
		
//		Contando com Incremento
		for (int a = 0; a <= 10; ++a) {
			System.out.println("A vari�vel A contou: " + a);
		}
		
//		Contando com Decremento
		for (int b = 10; b >= 0; --b) {
			System.out.println("A vari�vel B contou: " + b);
		}
	
		
/*		WHILE*/
		
		int num = -1;
		
//		Inicio da estrutura while
		while (
//				Adicionando uma condi��o
				num 
				!= // Diferente
				10) {
			
//			Entrada de dados do usu�rio
			System.out.println("Digite um n�mero: ");
			
//			Agregando valor a vari�vel
			num = leia.nextInt();
			
//			Usando a estrutura IF/ELSE para trabalhar com as possibilidades
			if (num == 10) {
				System.out.println("Voc� acertou!");
			} else {
				System.out.println("Voc� errou. N�o � este n�mero: " + num);
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
