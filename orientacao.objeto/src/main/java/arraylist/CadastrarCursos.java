package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastrarCursos {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> cursos = new ArrayList<String>();
		cursos.add("Teste UI");
		cursos.add("Teste API");
		cursos.add("Teste UNITARIOS");
		
		String opcao;
		System.out.println("Digite 1 para cadastrar um curso ou qualquer tecla para exibir lista ");
		opcao = scanner.nextLine();
		
		while(opcao.equals("1")) {
			System.out.println("Digite o curso desejado");
			String curso = scanner.nextLine();
			cursos.add(curso);
			cursos.remove(1);
			
			System.out.println("Digite 1 para cadastrar um curso ou qualquer tecla para exibir lista ");
			opcao = scanner.nextLine();
			
		}
		
		
		System.out.println("Cursos cadastrados: \n" + cursos);
		
		
	}

}
