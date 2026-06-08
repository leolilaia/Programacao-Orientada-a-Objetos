package Model;
public class Autor extends Pessoa {
    private String nacionalidade;
    private Livro[] obrasPublicadas;
    private boolean ehUsuario;
    
    public Autor(String nome, String nacionalidade, boolean ehUsuario){
        super(nome);
        this.nacionalidade = nacionalidade;
        this.ehUsuario = ehUsuario;
    }
    public String getNacionalidade(){return nacionalidade;}
    public Livro[] getObrasPublicadas(){return obrasPublicadas;}
    public Livro[] getObrasPublicadasPorGenero(String genero){return null;}

    public boolean isEhUsuario() {
        return ehUsuario;
    }

}
