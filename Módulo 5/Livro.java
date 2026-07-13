package Model;

public class Livro implements Publicavel {
    private String titulo;
    private Autor autor;
    private String genero;
    private boolean disponivel;

    public Livro(String titulo, Autor autor, String genero, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.disponivel = disponivel;
    }

    public String getTitulo() { return titulo; }
    public Autor getAutor() { return autor; }
    public String getGenero() { return genero; }
    public boolean isDisponivel() { return disponivel; }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void validarDisponibilidade() {
        if (!this.disponivel) {
            System.out.println("O livro nao esta disponivel");
        } else {
            System.out.println("O livro esta disponível");
        }
    }

    @Override
    public void publicar() {
        System.out.println("Livro publicando...");
    }
}