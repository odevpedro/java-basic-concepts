public class TestaMetodos {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.saldo = 100;
        System.out.println(conta.saldo);

        conta.deposita(15);
        System.out.println(conta.saldo);


        conta.saca(10);
        System.out.println(conta.saldo);


        boolean conseguiuRetirar = conta.saca(20);
        System.out.println(conseguiuRetirar);



    }
}
