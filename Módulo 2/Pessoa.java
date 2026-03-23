public class Pessoa{
    private String nome;
    private Livro[] livros;
    public Pessoa(String nome){
        this.nome = nome;
    }
    public String getNome(){return nome;}
    public Livro[]getLivro(){return livros;}
};