public class CriarConta {
    public static void main(String[] args){
        Conta primeiraConta = new Conta(654,866);
        primeiraConta.deposita(200);
        System.out.println(primeiraConta.getSaldo());

        //adicionando mais saldo na primeira conta
        primeiraConta.deposita(200);
        System.out.println(primeiraConta.getSaldo());

        //instanciando uma nova conta
        Conta segundaConta = new Conta(65,5);
        segundaConta.deposita(200);
        System.out.println(segundaConta.getSaldo());

        //adicionando mais saldo na primeira conta
        segundaConta.deposita(500);
        System.out.println(segundaConta.getSaldo());

        System.out.println("saldo da primeira conta" + primeiraConta.getNumero());
        System.out.println("saldo da segunda conta" + segundaConta.getSaldo());

        //Acessando atributos zerados
        System.out.println(primeiraConta.getAgencia());
        System.out.println(primeiraConta.getNumero());
        System.out.println(primeiraConta.getTitular());

        //verificando se a primeira conta é a mesma que a segunda
        if (primeiraConta == segundaConta){
            System.out.println("são a mesma conta");
        } else {
            System.out.println("Contas diferentes");
        }

        //referencias diferentes para endereços diferentes
        System.out.println(primeiraConta);
        System.out.println(segundaConta);


    }
}
