package Model;

public class TesteStrategy {
    public static void main(String[] args) {
        
        Autor autor = new Autor("Machado de Assis", "Brasileira", false);

        EstrategiaPublicacao estrategiaBlog = new PublicacaoBlog();
        autor.setEstrategia(estrategiaBlog);
        autor.publicar(); 

        EstrategiaPublicacao estrategiaArtigo = new PublicacaoArtigo();
        autor.setEstrategia(estrategiaArtigo);
        autor.publicar(); 
        
    }
}