//Gerente é um Funcionario, ou seja, Gerente herda de Funcionario,
// Gerente tambem assina o contrato Autenticacao.

public class Gerente extends Funcionario implements Autenticacao{

    private Autenticador autenticador;

    public Gerente(){
        this.autenticador = new Autenticador();
    }

    @Override
    public double getBonificacao() {
        System.out.println("Chamando Bonificacao do Gerente...");
        return super.getSalario();
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