
public class TestaSacaValorNegativo {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		conta.saca(101);
		
		System.out.println(conta.getSaldo());
		
	}
	
}
