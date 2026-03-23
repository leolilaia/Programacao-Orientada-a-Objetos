public class Livro {
    private String titulo;
    private Autor autor;
    private String genero;
    private boolean disponivel = true;

    public Livro(String titulo, Autor autor, String genero){
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }
    public String getTitulo(){return titulo;}
    public Autor getAutor(){return autor;}
    public String getGenero(){return genero;}

    public Boolean isDisponivel(){
        return disponivel;
    }

    public void setDisponivel(boolean disponivel){
        this.disponivel = disponivel;
    }

    public void validarDisponibilidade(){
        if(!this.disponivel){
            System.out.println("O livro nao esta disponivel");
        } else {
            System.out.println("O livro esta disponível");
        }
    }
}
    


