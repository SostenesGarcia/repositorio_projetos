package encapsulamento;

public class Caixa {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente();
		
		System.out.println("Antes do setSaldo " + cc.getSaldo());
			
		cc.setSaldo(100.0);
		
		System.out.println("Depois do setSaldo " + cc.getSaldo());
			
		}
		
	}


