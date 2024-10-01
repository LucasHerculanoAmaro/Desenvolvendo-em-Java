package MatrizesVetores;

public class Exercicio {

	public static void main(String[] args) {
		
//		Primeira Matriz 
		int[][] matrizA = {
				{1, 2, 3}, 		// L = 0
				{4, 5, 6}		// L = 1
		};
		
//		Segunda Matriz
		int[][] matrizB = {
				{7, 8, 9},		// L = 0
				{10, 11, 12} 	// L = 1
		};
		
//		Terceira Matriz
		int[][] matrizC = new int[2][3];
		
//		Soma das matrizes
		for (int linha = 0; linha < matrizA.length; linha++) {
			
			for (int coluna = 0; coluna < matrizA[linha].length; coluna++) {
				
				matrizC[linha][coluna] = 
						matrizA[linha][coluna] + matrizB[linha][coluna];
				
			}
			
		}
		
		for (int linha = 0; linha < matrizC.length; linha++) {
			
			for (int coluna = 0; coluna < matrizC[linha].length; coluna++) {
				
				System.out.println(
						"Posição [" + linha + "][" + coluna + "] = "
						+ matrizC[linha][coluna]
						
						);
				
			}
			
		}
			
		
		
		
	}
	
}
