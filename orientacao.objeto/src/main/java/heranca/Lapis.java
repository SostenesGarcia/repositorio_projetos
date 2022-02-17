package heranca;
public class Lapis{
    public String modelo;
    private float ponta;
    private boolean apontado;
    private String cor;
    
    public Lapis(String m, String c, float p){
        this.modelo = m;
        this.cor = c;
        this.setPonta(p);
        this.tampar();
        
    }
    
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public float getPonta(){
        return this.ponta;
}
    public void setPonta(float p){
        this.ponta = p;
}
    public void tampar(){
        this.apontado = false;
    }
    public void destampar(){
        this.apontado = false;
    }
    public void status(){
        System.out.println("Sobre o Lapis:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Apontando: " + this.apontado);
    }
}