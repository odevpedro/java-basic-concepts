package Banco;

public class TesteContas {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(15, 87);
        cc.deposita(100.0);

        ContaPoupanca cp = new ContaPoupanca(45,78);
        cc.deposita(200.0);


        cc.transfere(10, cp);
        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());


    }
}
