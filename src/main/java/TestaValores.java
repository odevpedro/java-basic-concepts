public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(45,57);
        Conta conta2 = new Conta(45,57);
        System.out.println(conta.getAgencia());
        System.out.println(conta2.getAgencia());

        //Imprimindo o total de contas
        //Métodos de instância e métodos estáticos
        System.out.println(Conta.getTotal());
    }
}
