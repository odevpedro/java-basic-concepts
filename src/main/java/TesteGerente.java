public class TesteGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();

        //O meu objeto gerente tem todos os métodos definidos na classe mãe
        gerente.setNome("Pedro");
        System.out.println(gerente.getNome());
        gerente.setCpf("823.103.194-29");
        System.out.println(gerente.getCpf());
        gerente.setSalario(10000);
        System.out.println(gerente.getSalario());

        gerente.setSenha(123);
        boolean autenticou = gerente.autentica(123); //método vindo apenas do gerente
        System.out.println(autenticou);

        System.out.println(gerente.getBonificacao()); //Temos uma bonificação especifica para cada Funcionario
    }
}
