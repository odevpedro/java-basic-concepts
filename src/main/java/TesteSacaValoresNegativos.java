public class TesteSacaValoresNegativos {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.deposita(1);
        conta.saca(200); //aqui devolve como um boolean false

        //acessando o saldo atraves de um método
        System.out.println(conta.getSaldo());


    }
}
