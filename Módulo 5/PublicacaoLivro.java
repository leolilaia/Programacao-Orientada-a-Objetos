package Model;

public class PublicacaoLivro implements EstrategiaPublicacao {
    @Override
    public void publicar() {
        System.out.println("Publicando livro...");
    }
}