public class Designer extends Funcionario{

    @Override
    public double getBonificacao() {
        System.out.println("Chamando método de bonificação do usuário");
        return 200;

        //garatimos que o filho tenha implementação
    }
}
