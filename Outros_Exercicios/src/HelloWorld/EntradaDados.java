package HelloWorld;

import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int quantidade;
		long identificador;
		float altura; 
		double area;
		char tipo;
		String frase;
		boolean ativo;
		
		System.out.println("\nDigite um valor para a Vari�vel quantidade (int): ");
		quantidade = leia.nextInt();
		
		System.out.println("\nDigite um valor para a Vari�vel identificador (long): ");
		identificador = leia.nextLong();
		
		System.out.println("\nDigite um valor para a Vari�vel altura (float): ");
		altura = leia.nextFloat();
		
		System.out.println("\nDigite um valor para a Vari�vel area (double): ");
		area = leia.nextDouble();

		System.out.println("\nDigite um valor para a Vari�vel tipo (char): ");
		tipo = leia.next().charAt(0);
				
		System.out.println("\nDigite um valor para a Vari�vel frase (String): ");
		leia.skip("\\R?");
		frase = leia.nextLine();
		
		System.out.println("\nDigite um valor para a Vari�vel ativo (boolean): ");
		ativo = leia.nextBoolean();
		
		System.out.println("\nDados recebidos via teclado:\n");
		
		System.out.println("\nVari�vel quantidade = " + quantidade);
		System.out.println("\nVari�vel identificador = " + identificador);
		System.out.println("\nVari�vel altura = " + altura);
		System.out.println("\nVari�vel area = " + area);
		System.out.println("\nVari�vel tipo = " + tipo);
		System.out.println("\nVari�vel palavra = " + frase);
		System.out.println("\nVari�vel tamanho = " + ativo);
		
	}
	
}
