public class ReferenciasVsObjetos {
    public static void main(String[] args){
        Conta primeiraConta = new Conta();
        primeiraConta.setNumero(100);



        //duas referencias para um mesmo lugar em memoria
        Conta segundaConta = primeiraConta;
        System.out.println(segundaConta);


        // a variavel conta não presenta um objeto conta e sim aponta para uma conta
        System.out.println("Valor do saldo da primeira conta:" + primeiraConta.getSaldo());
        System.out.println("valor do saldo da segunda conta: " + segundaConta.getSaldo());

        //adicionando 100 no saldo da segunda conta faz com que os mesmos 100 sejam adicionados na primeira conta
        segundaConta.deposita(100);
        System.out.println(segundaConta.getSaldo());
        System.out.println(primeiraConta.getSaldo());

        //verificando se a primeira conta é a mesma que a segunda
        if (primeiraConta == segundaConta){
            System.out.println("são a mesma conta");
        } else {
            System.out.println("Contas diferentes");
        }

        //referencias diferentes aponstando para o mesmo enderço
        System.out.println(primeiraConta);
        System.out.println(segundaConta);


    }
}
