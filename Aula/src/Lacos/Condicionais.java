package Lacos;

import java.util.Scanner;

public class Condicionais {

	public static void main(String[] args) {
	
//		Declarando o método Scanner - Pega a informação
		Scanner leia = new Scanner(System.in);
		
//		Nome do pokemon
		int pokemon;
		
//		Coletar os dados
		System.out.println("Escolha: "
						 + "\n1 - Charmander"
						 + "\n2 - Bulbasaur"
						 + "\n3 - Squirtle.");
		
//		Atribuindo valor a variável
		pokemon = leia.nextInt();
		
		if (pokemon == 1) {
			System.out.println("Seu pokemon agora é o Charmander");
		} else if (pokemon == 2) {
			System.out.println("Seu pokemon agora é o Bulbasaur");
		} else if (pokemon == 3) {
			System.out.println("Seu pokemon agora é o Squirtle");
		} else {
			System.out.println("você não digitou um número correto");
		}
			
	}
	
}
