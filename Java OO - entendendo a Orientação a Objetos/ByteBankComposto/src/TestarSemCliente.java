
public class TestarSemCliente {

	public static void main(String[] args) {
		
		Conta contaMarcela = new Conta();
		System.out.println(contaMarcela.getSaldo());
		
		contaMarcela.titular = new Cliente();
		System.out.println(contaMarcela.titular);
		
		contaMarcela.titular.nome = "Marcela";
		System.out.println(contaMarcela.titular.nome);
		
	}
	
}
