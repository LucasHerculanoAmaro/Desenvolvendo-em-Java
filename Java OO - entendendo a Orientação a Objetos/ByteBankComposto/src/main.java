
public class main {

	public static void main(String[] args) {
		
		Cliente paulo = new Cliente();
		
		paulo.nome = "Paulo Silveira";
		paulo.cpf = "123.456.789.00";
		paulo.profissao = "programador";
		
		Conta contaPaulo = new Conta();
		contaPaulo.deposita(100);
		
		contaPaulo.titular = paulo;
		
		System.out.println(contaPaulo.titular.nome);
		
	}
	
	
}
