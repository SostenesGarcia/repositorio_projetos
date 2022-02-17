package primeiro.projeto;

public class Habilitacao {

	public static void main(String[] args) {
		
		
	     String nome = "Sostenes";
	     int idade = 18;
	     int idadePermitida = 18;
	     boolean emancipado = false;
	     
	     if(idade >= idadePermitida || emancipado) {
	    	System.out.println("Voce pode tirar sua habilitacão " + nome); 
 	 
	     }else {
	    	 
	    	 System.out.println("Voce não pode tirar sua habilitacão " + nome); 
	     }
			

	}

}
