public class TestaAutenticacao {
    public static void main(String[] args){

        Administrador administrador = new Administrador();
        administrador.setSenha(1111);

        Gerente gerente = new Gerente();
        gerente.setSenha(2222);

        Cliente cliente = new Cliente();
        cliente.setSenha(333);

        SistemaInterno sistemaInterno = new SistemaInterno();
        sistemaInterno.autentica(administrador);
        sistemaInterno.autentica(gerente);
        sistemaInterno.autentica(cliente);
    }
}
