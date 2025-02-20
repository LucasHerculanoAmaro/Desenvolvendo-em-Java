package encapsulamento;

public class TestaValores {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 24226);
		
		System.out.println(conta.getAgencia());
		
		Conta conta1 = new Conta(0001, 19822);
		Conta conta2 = new Conta(0002, 48138);
		
		System.out.println(Conta.getTotal());
		
	}
	
}
