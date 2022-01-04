//Contrato de autenticacao
    //Quem assina este contrato, precisa implementar:
        //setSenha;
        //autentica;
public abstract interface Autenticacao {

    public void setSenha(int senha);

    public boolean autentica(int senha);
}
