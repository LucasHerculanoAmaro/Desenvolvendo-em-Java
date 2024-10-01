package Scanner;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		
		String nome;
		String opiniao;
		
//		Classe  nome = novo método(parâmetros)
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um nome: ");
		nome = leia.next();
		
		System.out.println("Qual é a sua opinião sobre " + nome + "?");
		opiniao = leia.next(); 
		
		System.out.println(nome + " é " + opiniao);
	}
	
	
	
}
