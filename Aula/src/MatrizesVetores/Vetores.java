package MatrizesVetores;

public class Vetores {

	public static void main(String[] args) {
		
/*
 	Vetores:
 	
 	A = {1, 2, 3, 4, 5}
 	B[] = {a, b, c, d, e}
 	
 	posi��o 0  1  2  3  4
 	C[] =  {1, 2, 3, 4, 5}
  
  	Vari�vel = {	Lista (String, Integer)	} 
 */		
//		posi��o    0  1  2  3  4
		int a[] = {1, 2, 3, 4, 5};
		
		System.out.println("Primeiro exerc�cio: " + a[3] + "\n");
		
		for (
//				Vari�vel de Inicializa��o	Vari�vel de condi��o	Contador
				int i = 0; 					i < a.length; 					i++
				
				) {
			System.out.println("contei: " + a[i]);
		}
		
	}	
}
