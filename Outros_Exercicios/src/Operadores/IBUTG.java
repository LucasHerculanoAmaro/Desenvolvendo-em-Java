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

//Variáveis fixas para Temperatura - valores não sofrem alteração.
	float tbn = 	(float) 0.7;	//variável para Temperatura de Búlbo Úmido Natural. os valores não mudam para ambas as fórmulas.
	float tg = 		(float) 0.3; 	//variável para Temperatura de Globo - sem carga solar.
	float tg_sum =	(float) 0.2; 	//variável para Temperatura de Globo - com carga solar.
	float tbs = 	(float) 0.1; 	//variável para Temperatura de Búlbo Seco.
		
//Variáveis para Entrada de dados relacionados ao equipamento
		float tbn_user1, tg_user1, tbs_user1, IBUTG1;
		float tbn_user2, tg_user2, tbs_user2, IBUTG2;
		
//Definição de Leitura dos dados para Temperatura
		Scanner temperatura = new Scanner(System.in);		

//Entrada dos Dados para Temperatura Trabalho
		System.out.println("Digite os dados da Teperatura de Búlbo Úmido:"); 				//Inserindo dados TBS
			tbn_user1 = temperatura.nextFloat();
				
		System.out.println("Digite os dados de da Temperatura de Globo:"); 					//Inserindo dados TG
			tg_user1 = temperatura.nextFloat();
				
		System.out.println("Digite os dados da Temperatura de Búlbo Seco:"); 				//Inserindo dados TBN
			tbs_user1 = temperatura.nextFloat();
			
//Entrada dos Dados para Temperatura Descanso
		System.out.println("Digite os dados de Descanso da Teperatura de Búlbo Úmido:"); 	//Inserindo dados TBS
			tbn_user2 = temperatura.nextFloat();
					
		System.out.println("Digite os dados de Descanso da Temperatura de Globo:"); 		//Inserindo dados TG
			tg_user2 = temperatura.nextFloat();
					
		System.out.println("Digite os dados de Descanso da Temperatura de Búlbo Seco:"); 	//Inserindo dados TBN
			tbs_user2 = temperatura.nextFloat();
							
			
//Aqui o cálculo será realizado para temperatura
		/*IBUTG*/ IBUTG1 = tbn_user1 * tbn + tg_user1 * tg;
		/*IBUTG*/ IBUTG2 = tbn_user2 * tbn + tg_user2 * tg;
		//*IBUTG*/ soma_externo = tbn_user * tbn + tbs_user * tbs + tg_user * tg_sum;
		
//Saída dos Dados registrados e somados para Temperatura
		System.out.println("O cálculo IBUTG de Trabalho é: " + IBUTG1 +" ºC");
		System.out.println("O cálculo IBUTG de Descanso é: " + IBUTG2 +" ºC");
		//System.out.println("O cálculo IBUTG para Ambiente Externo é: " + soma_externo+" ºC");
			
		
//Variáveis fixas para Metabolismo.
		int hour_work = 60;	//Hora trabalhada - Equivalente a 1 Hora

// Variáveis para Entrada de dados relacionados ao trabalho
		int time_work, time_sleep, meta_work, meta_sleep, soma_meta, Kcal_h;
		
//Definição de leitura dos dados para Metabolismo	
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
			
//Aqui será realizado o cálculo para metabolismo
		soma_meta = meta_work * time_work + meta_sleep * time_sleep;
		Kcal_h = soma_meta / hour_work ;
		
//Saída dos Dados registrados e somados para Temperatura
		System.out.println("O resultado do cálculo Metabolismo é: " + Kcal_h +" Kcal/h");
		System.out.println("O cálculo IBUTG de Trabalho é: " + IBUTG1 +" ºC");
		System.out.println("O cálculo IBUTG de Descanso é: " + IBUTG2 +" ºC");
		
//Váriável para Cálculo IBUTG Médio
		float IBUTG_medio, IBUTG_final;
		
//Aqui será realizado o cálculo para IBUTG Médio
		IBUTG_medio = IBUTG1 * time_work + IBUTG2 * time_sleep;
		IBUTG_final = IBUTG_medio / hour_work;
		
//Saída dos Dados Final.
		System.out.println("O Resutado para Metabolismo é: " + Kcal_h + " Kcal/h");
		System.out.println("O Resultado para IBUTG Mádio é: " + IBUTG_final + " ºC");
	}
}

/* Referências:
 
 * https://www.youtube.com/watch?v=P8j6MsKzxHs
 	Acesso em 20 de Julho de 2023;
 
 * https://segurancadotrabalhoacz.com.br/calculo-do-ibutg/
 	Acesso em 20 de Julho de 2023;
 
 */
