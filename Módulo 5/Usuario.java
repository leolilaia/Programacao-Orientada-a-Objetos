package Model;

public class Usuario extends Pessoa implements Publicavel {
    private int idade;
    private Emprestimo[] historicoEmprestimos;

    public Usuario(String nome, int idade) {
        super(nome);
        this.idade = idade;
    }

    public int getIdade() { return idade; }
    public Emprestimo[] getHistoricoEmprestimo() { return historicoEmprestimos; }

    @Override
    public void publicar() {
        System.out.println("Usuário publicando...");
    }
}