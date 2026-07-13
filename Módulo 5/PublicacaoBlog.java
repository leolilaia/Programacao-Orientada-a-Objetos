package Model;

public class PublicacaoBlog implements EstrategiaPublicacao {
    @Override
    public void publicar() {
        System.out.println("Publicando no blog...");
    }
}