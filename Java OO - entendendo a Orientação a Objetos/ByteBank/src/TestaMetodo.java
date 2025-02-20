
public class TestaMetodo {

	public static void main(String[] args) {
		
		Conta contaPaulo = new Conta();
		
		contaPaulo.saldo = 100;
		
		contaPaulo.deposita(50);
		
		System.out.println(contaPaulo.saldo);
		
		contaPaulo.saca(20);
		
		boolean conseguiuRetirar = contaPaulo.saca(50);
		
		System.out.println(contaPaulo.saldo);
		System.out.println("Conseguiu retirar: " + conseguiuRetirar);
		
		Conta contaMarcela = new Conta();
		
		contaMarcela.deposita(1000);
		
		contaMarcela.transfere(300, contaPaulo);
		
		boolean sucessoTransferencia = contaMarcela.transfere(3000, contaPaulo);
		
		if(sucessoTransferencia) {
			System.out.println("Transaferencia realizada com sucesso!");
		} else {
			System.out.println("Saldo insuficiente...");
		}
		
		System.out.println(contaMarcela.saldo);
		System.out.println(contaPaulo.saldo);
		
	}
	
}
