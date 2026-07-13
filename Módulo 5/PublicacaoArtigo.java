package Model;

public class PublicacaoArtigo implements EstrategiaPublicacao {
    @Override
    public void publicar() {
        System.out.println("Publicando artigo...");
    }
}