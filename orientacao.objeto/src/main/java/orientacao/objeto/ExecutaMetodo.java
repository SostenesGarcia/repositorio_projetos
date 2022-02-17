package orientacao.objeto;

public class ExecutaMetodo {

	public static void main(String[] args) {
		
		MetodoVazio caracteristicas = new MetodoVazio();
		MetodoRetorno retorno = new MetodoRetorno();
		MetodoAtributo atributo = new MetodoAtributo();
	   
		//atributo.digiteSeuNome("Sostenes");
        //atributo.digiteSeuPeso(85.6);
        //atributo.informeDados(39, "Sostenes");
        atributo.consultarDados(40, "Roberto");
	}
	

}
