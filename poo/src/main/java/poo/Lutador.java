package poo;
public class Lutador {
    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;
    //Metodos Publicos
    public void apresentar(){
        System.out.println("----------------------------------------------------------");
        System.out.println("Chegou a hora! apresentamos! o lutador " + this.getNome());
        System.out.println("Diretamente do " + this.getNacionalidade());
        System.out.println("Com " + this.getIdade() + " anos e " + this.getAltura() + " de Altura");
        System.out.println("Pesando " + this.getPeso() + "kg");
        System.out.println(this.getVitorias() + " Vitorias");
        System.out.println(this.getDerrotas() + " derrotas e ");
        System.out.println(this.getEmpates() + " Empates"); 
        System.out.println("----------------------------------------------------------");
    }
    public void status(){
        System.out.println(this.getNome() + " � um peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " vezes");
        System.out.println("Perdeu " + this.getDerrotas() + " vezes");
        System.out.println("Emapatou " + this.getEmpates() + " vezes");
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }
    public void perderLuta(){  
       this.setDerrotas(this.getDerrotas()+1); 
    }
    public void empatarLuta(){
     this.setEmpates(this.getEmpates()+1);   
    }
    //Metodos Especiais

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
       if (this.peso < 52.2){
           this.categoria = "Ivalido";
       }else if(this.peso <= 70.3){
           this.categoria = "Leve";
       }else if(this.peso <= 83.9   ){
            this.categoria = "M�dio";
       }else if(this.peso <= 120.2){
           this.categoria = "Pesado";
       }else {
           this.categoria = "Ivalido";
       }
       
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    
}