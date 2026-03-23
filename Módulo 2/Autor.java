public class Autor extends Pessoa {
    private String nacionalidade;
    private Livro[] obrasPublicadas;
    
    public Autor(String nome, String nacionalidade){
        super(nome);
        this.nacionalidade = nacionalidade;
    }
    public String getNacionalidade(){return nacionalidade;}
    public Livro[] getObrasPublicadas(){return obrasPublicadas;}
    public Livro[] getObrasPublicadasPorGenero(String genero){return null;}

}
