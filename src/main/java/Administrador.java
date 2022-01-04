//Administrador é um Funcionario, ou seja, Administrador herda de Funcionario,
// Administrador tambem assina o contrato Autenticacao.

public class Administrador extends Funcionario implements Autenticacao{

    private Autenticador autenticador;

    public Administrador(){
        this.autenticador = new Autenticador();
    }

    @Override
    public double getBonificacao() {
        return 50;
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
}
