package Scanner;

import java.util.Scanner;

public class exercicio {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a;
		int b;
		
		System.out.println("Escolha um número: ");
		a = leia.nextInt();
		
		System.out.println("Escolha outro número: ");
		b = leia.nextInt();
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		
		
	}
	
}
