package primeiro.projeto;

public class ElseIfe {
	
	public static void main(String[] args) {
		
		boolean dinheiro = false;
		boolean credito = false;
		boolean boleto = false;
		int preco = 10000;
		
		System.out.println("*****************************");	
		System.out.println("*******E2E TREINAMENTOS******");
		System.out.println("*****************************");
		
		if(dinheiro){
			int desconto = 600;
			preco = preco - desconto;
			
			System.out.println("Parabens pela compra do carro no valor R$ " + preco);
			
		}else if (credito){
			int jurus = 200;
			preco = preco + jurus;
			
			System.out.println("Parabens pela compra do carro no valor R$ " + preco);
			
		}else if (boleto){
			int jurus = 600;
			preco = preco + jurus;
			
			System.out.println("Parabens pela compra do carro no valor R$ " + preco);
		
	}else {
		System.out.println("Opção de pagamento não disponivel");
		
	}
		
	}
	
}
