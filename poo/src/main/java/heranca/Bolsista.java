package heranca;
public class Bolsista extends Pessoa {
  private float bolsa;
  
  public void renovarBolsa(){
      System.out.println("Renovando bolsa de " + this.nome);   
  }
  public void pagarMensalidade(){
      System.out.println(this.nome + "é bolsista pagamento feito");
  }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    void setMatricula(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  
}

