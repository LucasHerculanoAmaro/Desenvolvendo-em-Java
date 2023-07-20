/*
 O objetivo deste exercício é realizar uma operação com o cálculo de Indice de ulbo Umido e Termometro de Globo.
 Este cálculo é usado para medir a temperatura do ambiente em um local de trabalho com altas temperaturas. (Caldeiras, Fornos e Caldos de Pressão)
  */
package Operadores;

import java.util.Scanner;

public class IBUTG {

	public static void main (String [] args) {
		
/*
Algo que precisamos levar em consideração é a atividade de trabalho.
	O Cálculo IBUTG se aplica para ambientes internos e amientes externos,
com isso, o cálculo sofre uma leve alteração dependendo do ambiente que será medido.

* Para ambientes internos ou externos sem carga solar:
			IBUTG = 0,7 tbn + 0,3 tg

*Para Ambientes externos com carga solar:
			IBUTG = 0,7 tbn + 0,1 tbs + 0,2 tg
			
*OBS: para não confundir as fórmulas, basta saber que, a maior se trata para ambientes com luz solar direta, 
e a formula menor é para amientes sem luz solar direta.   

*OBS: Outra oservação que podemos destacar é as letras que estão na fórmula.
Essas letras fazer referência aos diferentes termometos que há no equipameto:

			tbn 	-> 	Temperatura de Bulbo Úmido Natural
			tg 	-> 	Temperatura de Globo
			tbs 	-> 	Temperatura de Bulbo Seco. 

Como sabemos que o cálculo para cada ambiente será diferente, precisaremos fazer dois equações.  
*/

//Variáveis fixas - valores não sofrem alteração.
		float tbn = 	(float) 0.7;	//variável para Temperatura de Búlbo Úmido Natural. os valores não mudam para ambas as fórmulas.
		float tg = 		(float) 0.3; 	//variável para Temperatura de Globo - sem carga solar.
		float tg_sum =	(float) 0.2; 	//variável para Temperatura de Globo - com carga solar.
		float tbs = 	(float) 0.1; 	//variável para Temperatura de Búlbo Seco.
		
//Variáveis para Entrada de dados relacionados ao equipamento
		float tbn_user, tg_user, tbs_user, soma_externo, soma_interno;
		
//Definição de Leitura dos Dados
		Scanner teclado = new Scanner(System.in);		

//Entrada dos Dados
		System.out.println("Digite os dados da Teperatura de Búlbo Úmido:"); 		//Inserindo dados TBS
			tbn_user = teclado.nextFloat();
				
		System.out.println("Digite os dados da Temperatura de Globo:"); 				//Inserindo dados TG
			tg_user = teclado.nextFloat();
				
		System.out.println("Digite os dados da Temperatura de Búlbo Seco:"); 		//Inserindo dadosTBN
			tbs_user = teclado.nextFloat();
			
//Aqui o cálculo será realizado
		/*IBUTG*/ soma_interno = tbn_user * tbn + tg_user * tg;
		/*IBUTG*/ soma_externo = tbn_user * tbn + tbs_user * tbs + tg_user * tg_sum;
		
//Saída dos Dados registrados e somados
		System.out.println("O cálculo IBUTG para Ambiente Interno é: " + soma_interno+" ºC");
		System.out.println("O cálculo IBUTG para Ambiente Externo é: " + soma_externo+" ºC");
			
		teclado.close();
		
		//Contunue trabalhando com a taxa de metabolismo.
	}
	
}

