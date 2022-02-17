package primeiro.projeto;

public class SwitchCase {

	public static void main(String[] args) {
		
		int opcao = 1;
		double valorProduto = 5.000;
		double saldoCliente = 6.000;
		
		switch(opcao) {
		
		case 1:
			System.out.println("Voce escolheu a forma de pagamento a vista");
	    if(saldoCliente >= valorProduto) {
		System.out.println("Compra realziada com sucesso");
	    }else {
	    	System.out.println("Compra negada procure seu banco");
	    }
		
		case 2:
			System.out.println("Voce escolhei a forma de pagamento no credito");
			break;
		case 3:
			System.out.println("Voce escolhei a forma de pagamento no boleto");
			break;
		default:
			System.out.println("Opção invalida");
			break;
		}
		
		

	}

}
