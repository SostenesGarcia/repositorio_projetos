package orientacao.objeto;

public class MetodoAtributo {
	
	public void digiteSeuPeso(double peso) {
		
		System.out.println("O meu peso é " + peso);
		
	}
	 public String digiteSeuNome(String nome) {
		 
		 System.out.println("O nome digitado é " + nome);
		return nome;
	 }
	 
	 public void informeDados(int idade, String nome) {
		 
		 System.out.println("O nome cadastrado é " + nome + " e a idade " + idade);
	 }
	 
	 public void consultarDados(int idade, String nome) {
		 
		 System.out.println("O Nome cadastrado foi " + nome + " idade cadastrada foi " + idade);
	 }
	 
}
