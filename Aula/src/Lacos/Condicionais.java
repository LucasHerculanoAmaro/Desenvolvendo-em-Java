package Lacos;

import java.util.Scanner;

public class Condicionais {

	public static void main(String[] args) {
	
//		Declarando o m�todo Scanner - Pega a informa��o
		Scanner leia = new Scanner(System.in);
		
//		Nome do pokemon
		int pokemon;
		
//		Coletar os dados
		System.out.println("Escolha: "
						 + "\n1 - Charmander"
						 + "\n2 - Bulbasaur"
						 + "\n3 - Squirtle.");
		
//		Atribuindo valor a vari�vel
		pokemon = leia.nextInt();
		
		if (pokemon == 1) {
			System.out.println("Seu pokemon agora � o Charmander");
		} else if (pokemon == 2) {
			System.out.println("Seu pokemon agora � o Bulbasaur");
		} else if (pokemon == 3) {
			System.out.println("Seu pokemon agora � o Squirtle");
		} else {
			System.out.println("voc� n�o digitou um n�mero correto");
		}
			
	}
	
}
