package encapsulamento;

public class TestaGetSet {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo");
		
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Vendedor de frango");
		
		Cliente titular = conta.getTitular();
		titular.setProfissao("Vendedor de arroz");
		
		System.out.println(titular);
		System.out.println(paulo);
		
		
	}
	
}
