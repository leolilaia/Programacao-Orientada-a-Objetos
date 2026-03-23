public class Usuario extends Pessoa{
    private int idade;
    private Emprestimo[] historicoEmprestimos;
    public Usuario(String nome, int idade){
        super(nome);
        this.idade = idade;
    }
    public int getIdade(){return idade;}
    public Emprestimo[] getHistoricoEmprestimo(){return historicoEmprestimos;}
}
