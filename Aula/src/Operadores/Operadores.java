package Operadores;

public class Operadores {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 10;
		boolean c = true;
		boolean d = false;
		
		System.out.println("Adi��o: " + (a + b));
		System.out.println("Subtra��o: " + (a -b));
		System.out.println("Divis�o: " + (a / b));
		System.out.println("Multiplicar: " + (a * b));
		System.out.println("Resto: " + (a % b));
		
		System.out.println("\nConcatenando duas vari�veis.");
		
		String time1 = "S�o Paulo FC";
		String time2 = "Corinthians";
		
		System.out.println(time1 + time2);
		System.out.println(time2 + time1);
		System.out.println(time1 + " � muito maior do que " + time2);
		
		System.out.println("\nOpera��es Un�rias: ");
		
		System.out.println(++a + ++a);
		System.out.println(++b + ++b);
		
		System.out.println("\n");
		System.out.println(~a);
		System.out.println(~b);
		System.out.println(!c);
		System.out.println(!d);
	}
	
}
