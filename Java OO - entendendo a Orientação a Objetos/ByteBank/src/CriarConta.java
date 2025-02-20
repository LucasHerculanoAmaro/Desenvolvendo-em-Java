public class CriarConta {
	
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		
		primeiraConta.saldo = 200;
		
		System.out.println(primeiraConta.saldo);
		
		// Atribuindo valor à Primeira Conta
		primeiraConta.saldo += 100;
		
		System.out.println(primeiraConta.saldo);
		
		// Criando uma nova Conta
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
		
		System.out.println("Agencia primeiroa conta: " + primeiraConta.agencia);
		System.out.println("Número segunda conta: " + primeiraConta.numero);
		
		System.out.println("Agencia segunda conta: " + segundaConta.agencia);
		System.out.println("Número segunda conta: " + segundaConta.numero);
		
	}
	
}