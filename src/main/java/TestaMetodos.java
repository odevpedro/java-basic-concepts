public class TestaMetodos {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.saldo = 100;
        System.out.println(conta.saldo);

        conta.deposita(15);
        System.out.println(conta.saldo);


        conta.saca(15);
        System.out.println(conta.saldo);


        boolean conseguiuRetirar = conta.saca(20);
        System.out.println(conseguiuRetirar);


        //instanciando conta para fazer a transferencia
        Conta contaDaMarcela = new Conta();
        contaDaMarcela.saldo = 3000;

        contaDaMarcela.transfere(conta, 1000);
        System.out.println(contaDaMarcela.saldo);

        //consultando a conta na qual o dinheiro foi depositado
        System.out.println(conta.saldo);


        //também seria possivel passar  meu método como boolean

        if (contaDaMarcela.transfere(conta,  100)){
            System.out.println("transferencia feita com sucesso");
        } else {
            System.out.println("Faltou dinheiro");
        }


        //alocando o sucesso da tranferencia em uma variavel
        boolean sucessoTransferencia = contaDaMarcela.transfere(conta, 10);
        if (sucessoTransferencia){
            System.out.println("dinheiro transferido com sucesso");
        } else {
            System.out.println("faltou dinheiro");
        }



        System.out.println(contaDaMarcela.titular);



    }
}
