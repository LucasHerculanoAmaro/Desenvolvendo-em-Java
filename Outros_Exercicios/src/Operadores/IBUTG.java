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

//Vari�veis fixas para Temperatura - valores n�o sofrem altera��o.
	float tbn = 	(float) 0.7;	//vari�vel para Temperatura de B�lbo �mido Natural. os valores n�o mudam para ambas as f�rmulas.
	float tg = 		(float) 0.3; 	//vari�vel para Temperatura de Globo - sem carga solar.
	float tg_sum =	(float) 0.2; 	//vari�vel para Temperatura de Globo - com carga solar.
	float tbs = 	(float) 0.1; 	//vari�vel para Temperatura de B�lbo Seco.
		
//Vari�veis para Entrada de dados relacionados ao equipamento
		float tbn_user1, tg_user1, tbs_user1, IBUTG1;
		float tbn_user2, tg_user2, tbs_user2, IBUTG2;
		
//Defini��o de Leitura dos dados para Temperatura
		Scanner temperatura = new Scanner(System.in);		

//Entrada dos Dados para Temperatura Trabalho
		System.out.println("Digite os dados da Teperatura de B�lbo �mido:"); 				//Inserindo dados TBS
			tbn_user1 = temperatura.nextFloat();
				
		System.out.println("Digite os dados de da Temperatura de Globo:"); 					//Inserindo dados TG
			tg_user1 = temperatura.nextFloat();
				
		System.out.println("Digite os dados da Temperatura de B�lbo Seco:"); 				//Inserindo dados TBN
			tbs_user1 = temperatura.nextFloat();
			
//Entrada dos Dados para Temperatura Descanso
		System.out.println("Digite os dados de Descanso da Teperatura de B�lbo �mido:"); 	//Inserindo dados TBS
			tbn_user2 = temperatura.nextFloat();
					
		System.out.println("Digite os dados de Descanso da Temperatura de Globo:"); 		//Inserindo dados TG
			tg_user2 = temperatura.nextFloat();
					
		System.out.println("Digite os dados de Descanso da Temperatura de B�lbo Seco:"); 	//Inserindo dados TBN
			tbs_user2 = temperatura.nextFloat();
							
			
//Aqui o c�lculo ser� realizado para temperatura
		/*IBUTG*/ IBUTG1 = tbn_user1 * tbn + tg_user1 * tg;
		/*IBUTG*/ IBUTG2 = tbn_user2 * tbn + tg_user2 * tg;
		//*IBUTG*/ soma_externo = tbn_user * tbn + tbs_user * tbs + tg_user * tg_sum;
		
//Sa�da dos Dados registrados e somados para Temperatura
		System.out.println("O c�lculo IBUTG de Trabalho �: " + IBUTG1 +" �C");
		System.out.println("O c�lculo IBUTG de Descanso �: " + IBUTG2 +" �C");
		//System.out.println("O c�lculo IBUTG para Ambiente Externo �: " + soma_externo+" �C");
			
		
//Vari�veis fixas para Metabolismo.
		int hour_work = 60;	//Hora trabalhada - Equivalente a 1 Hora

// Vari�veis para Entrada de dados relacionados ao trabalho
		int time_work, time_sleep, meta_work, meta_sleep, soma_meta, Kcal_h;
		
//Defini��o de leitura dos dados para Metabolismo	
		Scanner metabolismo = new Scanner(System.in);
	
//Entrada de Dados para Metabolismo
		System.out.println("Digite os dados para Metabolismo de Trabalho:");
			meta_work = metabolismo.nextInt();
			
		System.out.println("Digite os dados para Metabolismo de Descanso:");
			meta_sleep = metabolismo.nextInt();
		
		System.out.println("Digite o Tempo de Trabalho:");
			time_work = metabolismo.nextInt();
				
		System.out.println("Digite o Tempo de Descanso:");
			time_sleep = metabolismo.nextInt();
			
//Aqui ser� realizado o c�lculo para metabolismo
		soma_meta = meta_work * time_work + meta_sleep * time_sleep;
		Kcal_h = soma_meta / hour_work ;
		
//Sa�da dos Dados registrados e somados para Temperatura
		System.out.println("O resultado do c�lculo Metabolismo �: " + Kcal_h +" Kcal/h");
		System.out.println("O c�lculo IBUTG de Trabalho �: " + IBUTG1 +" �C");
		System.out.println("O c�lculo IBUTG de Descanso �: " + IBUTG2 +" �C");
		
//V�ri�vel para C�lculo IBUTG M�dio
		float IBUTG_medio, IBUTG_final;
		
//Aqui ser� realizado o c�lculo para IBUTG M�dio
		IBUTG_medio = IBUTG1 * time_work + IBUTG2 * time_sleep;
		IBUTG_final = IBUTG_medio / hour_work;
		
//Sa�da dos Dados Final.
		System.out.println("O Resutado para Metabolismo �: " + Kcal_h + " Kcal/h");
		System.out.println("O Resultado para IBUTG M�dio �: " + IBUTG_final + " �C");
	}
}

/* Refer�ncias:
 
 * https://www.youtube.com/watch?v=P8j6MsKzxHs
 	Acesso em 20 de Julho de 2023;
 
 * https://segurancadotrabalhoacz.com.br/calculo-do-ibutg/
 	Acesso em 20 de Julho de 2023;
 
 */
