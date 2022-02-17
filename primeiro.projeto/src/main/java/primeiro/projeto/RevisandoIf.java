package primeiro.projeto;

public class RevisandoIf {
	
	public static void main(String[] args) {
		
		int mediaPassar = 9;
		int nota1 = 5;
		int nota2 = 2;
		int nota3 = 5;
		int media = (nota1 + nota2 + nota3)/3;
		
		if(media >= mediaPassar) {
			
			System.out.println("Parabens voce passou de ano, com a media " + media);	
		}else {
			
			System.out.println("Infelismente voce não passou de ano, sua media foi " + media);
		}
		
	}

}
