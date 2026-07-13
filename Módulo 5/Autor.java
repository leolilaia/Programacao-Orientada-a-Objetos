package Model;

public class Autor extends Pessoa {
    private String nacionalidade;
    private Livro[] obrasPublicadas;
    private boolean ehUsuario;
    
    private EstrategiaPublicacao estrategia; 
    
    public Autor(String nome, String nacionalidade, boolean ehUsuario) {
        super(nome);
        this.nacionalidade = nacionalidade;
        this.ehUsuario = ehUsuario;
    }

    public void setEstrategia(EstrategiaPublicacao estrategia) {
        this.estrategia = estrategia;
    }

    public void publicar() {
        if (this.estrategia != null) {
            this.estrategia.publicar();
        } else {
            System.out.println("Nenhuma estratégia de publicação foi definida!");
        }
    }

    public String getNacionalidade() { return nacionalidade; }
    public Livro[] getObrasPublicadas() { return obrasPublicadas; }
    public boolean isEhUsuario() { return ehUsuario; }
}