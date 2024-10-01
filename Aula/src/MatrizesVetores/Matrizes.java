package MatrizesVetores;

public class Matrizes {

	public static void main(String[] args) {
		
/*	
 	tipoDado[][] nomeMatriz = {

			   C  C  C				  c0 c1 c2
 			L {1, 2, 3},		L = 0 {0, 1, 2}
 			L {4, 5, 6}			L = 1 {0, 1, 2}
 			
 			matriz[L][C]
 	}
 	
 */		
	
//		int[][] matriz = {
////				 0  1  2
//				{1, 2, 3}, // L = 0
//				{4, 5, 6}  // L = 1
//		};
		
		String[][] matriz = {
//				  0   1   2
				{"a","b","c"}, // L = 0
				{"d","e","f"}, // L = 1
		};
		
		
//		Acessando o elemento da matriz
		System.out.println("Primeiro elemento da linha 1: " + matriz[0][0]);
		System.out.println("Terceiro elemento da linha 2: " + matriz[1][2]);
		
//		Iterar sobre a matriz
		
//		Externo
		for (int linha = 0; linha < matriz.length; linha++) {
			
//			Interno
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				
				System.out.println(
						"linha: " + linha + ", coluna: " + coluna + " => " + matriz[linha][coluna]);
				
			}
			
		}
		
	}
	
}
