package Scanner;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		
		String nome;
		String opiniao;
		
//		Classe  nome = novo m�todo(par�metros)
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um nome: ");
		nome = leia.next();
		
		System.out.println("Qual � a sua opini�o sobre " + nome + "?");
		opiniao = leia.next(); 
		
		System.out.println(nome + " � " + opiniao);
	}
	
	
	
}
