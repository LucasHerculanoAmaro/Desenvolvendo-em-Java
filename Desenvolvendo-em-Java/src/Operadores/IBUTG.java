/*
 O objetivo deste exerc�cio � realizar uma opera��o com o c�lculo de Indice de ulbo Umido e Termometro de Globo.
 Este c�lculo � usado para medir a temperatura do ambiente em um local de trabalho com altas temperaturas. (Caldeiras, Fornos e Caldos de Press�o)
  */
package Operadores;

import java.util.Scanner;

public class IBUTG {

	public static void main (String [] args) {
		
/*
Algo que precisamos levar em considera��o � a atividade de trabalho.
	O C�lculo IBUTG se aplica para ambientes internos e amientes externos,
com isso, o c�lculo sofre uma leve altera��o dependendo do ambiente que ser� medido.

* Para ambientes internos ou externos sem carga solar:
			IBUTG = 0,7 tbn + 0,3 tg

*Para Ambientes externos com carga solar:
			IBUTG = 0,7 tbn + 0,1 tbs + 0,2 tg
			
*OBS: para n�o confundir as f�rmulas, basta saber que, a maior se trata para ambientes com luz solar direta, 
e a formula menor � para amientes sem luz solar direta.   

*OBS: Outra oserva��o que podemos destacar � as letras que est�o na f�rmula.
Essas letras fazer refer�ncia aos diferentes termometos que h� no equipameto:

			tbn 	-> 	Temperatura de Bulbo �mido Natural
			tg 	-> 	Temperatura de Globo
			tbs 	-> 	Temperatura de Bulbo Seco. 

Como sabemos que o c�lculo para cada ambiente ser� diferente, precisaremos fazer dois equa��es.  
*/

//Vari�veis fixas - valores n�o sofrem altera��o.
		float tbn = 	(float) 0.7;	//vari�vel para Temperatura de B�lbo �mido Natural. os valores n�o mudam para ambas as f�rmulas.
		float tg = 		(float) 0.3; 	//vari�vel para Temperatura de Globo - sem carga solar.
		float tg_sum =	(float) 0.2; 	//vari�vel para Temperatura de Globo - com carga solar.
		float tbs = 	(float) 0.1; 	//vari�vel para Temperatura de B�lbo Seco.
		
//Vari�veis para Entrada de dados relacionados ao equipamento
		float tbn_user, tg_user, tbs_user, soma_externo, soma_interno;
		
//Defini��o de Leitura dos Dados
		Scanner teclado = new Scanner(System.in);		

//Entrada dos Dados
		System.out.println("Digite os dados da Teperatura de B�lbo �mido:"); 		//Inserindo dados TBS
			tbn_user = teclado.nextFloat();
				
		System.out.println("Digite os dados da Temperatura de Globo:"); 				//Inserindo dados TG
			tg_user = teclado.nextFloat();
				
		System.out.println("Digite os dados da Temperatura de B�lbo Seco:"); 		//Inserindo dadosTBN
			tbs_user = teclado.nextFloat();
			
//Aqui o c�lculo ser� realizado
		/*IBUTG*/ soma_interno = tbn_user * tbn + tg_user * tg;
		/*IBUTG*/ soma_externo = tbn_user * tbn + tbs_user * tbs + tg_user * tg_sum;
		
//Sa�da dos Dados registrados e somados
		System.out.println("O c�lculo IBUTG para Ambiente Interno �: " + soma_interno+" �C");
		System.out.println("O c�lculo IBUTG para Ambiente Externo �: " + soma_externo+" �C");
			
		teclado.close();
		
		//Contunue trabalhando com a taxa de metabolismo.
	}
	
}

