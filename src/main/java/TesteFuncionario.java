public class TesteFuncionario {

    public static void main(String[] args){

        Gerente vancley = new Gerente();
        vancley.setNome("Vancley Vieira");
        vancley.setCpf("50994703864");
        vancley.setSalario(600);


        System.out.println(vancley.getNome());
        System.out.println(vancley.getBonificacao());
    }
}
