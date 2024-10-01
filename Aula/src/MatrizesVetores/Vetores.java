package MatrizesVetores;

public class Vetores {

	public static void main(String[] args) {
		
/*
 	Vetores:
 	
 	A = {1, 2, 3, 4, 5}
 	B[] = {a, b, c, d, e}
 	
 	posição 0  1  2  3  4
 	C[] =  {1, 2, 3, 4, 5}
  
  	Variável = {	Lista (String, Integer)	} 
 */		
//		posição    0  1  2  3  4
		int a[] = {1, 2, 3, 4, 5};
		
		System.out.println("Primeiro exercício: " + a[3] + "\n");
		
		for (
//				Variável de Inicialização	Variável de condição	Contador
				int i = 0; 					i < a.length; 					i++
				
				) {
			System.out.println("contei: " + a[i]);
		}
		
	}	
}
