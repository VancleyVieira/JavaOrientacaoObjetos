public class TesteGerente {

    public static void main(String[] args){

        Gerente gerente = new Gerente();

        gerente.setNome("Vancley");
        gerente.setCpf("1234567");
        gerente.setSalario(5000.00);


        System.out.println("Gerente: "+gerente.getNome());
        System.out.println("CPF: "+gerente.getCpf());
        System.out.println("Salario: "+gerente.getSalario());

        gerente.setSenha(1);
        boolean autentica = gerente.autentica(1);

        System.out.println(autentica);

        System.out.println(gerente.getBonificacao());

    }
}
