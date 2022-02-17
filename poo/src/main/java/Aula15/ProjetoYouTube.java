package Aula15;
public class ProjetoYouTube {
    public static void main(String[] args) {
     Videos v[] = new Videos[3];
     v[0] = new Videos("Aula 1 de POO");
     v[1] = new Videos("Aula 1 de PHP");
     v[2] = new Videos("Aula 1 de HTML");
     
     Gafanhoto[] g = new Gafanhoto[2];
      g[0] = new Gafanhoto("Jubileu", 22, "M", "Juba");
      g[1] = new Gafanhoto("Cleusa", 29, "F", "creusita");
       
      Visualizacao vis = new Visualizacao(g[0], v[2]);
      System.out.println(vis.toString());
      
        System.out.println("Videios\n------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("\nGafanhotos\n------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());
    }
    
}