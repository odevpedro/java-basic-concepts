public class Teste {
    public static void main(String[] args) {
        FuncionarioTeste funcionario = new FuncionarioTeste();

        //nossa instância de funcinário receberá a bonificação de acordo com seu tipo:
        funcionario.setSalario(3000);
        System.out.println(funcionario.getBonificacao());

        //funcionario já nasce com tipo padrão
        System.out.println(funcionario.getBonificacao());


        //Gerente

        FuncionarioTeste gerente = new FuncionarioTeste();
        gerente.setTipo(1); //informo o tipo do funcionário

        gerente.setSalario(5000);
        System.out.println(gerente.getBonificacao());

        //Diretor
        FuncionarioTeste diretor = new FuncionarioTeste();
        diretor.setTipo(2); //informo o tipo do funcionário
        diretor.setSalario(8000);
        System.out.println(diretor.getBonificacao());


    }
}
