public class CriarConta {
    public static void main(String[] args){
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);

        //adicionando mais saldo na primeira conta
        primeiraConta.saldo += 200;
        System.out.println(primeiraConta.saldo);

        //instanciando uma nova conta
        Conta segundaConta = new Conta();
        segundaConta.saldo = 200;
        System.out.println(segundaConta.saldo);

        //adicionando mais saldo na primeira conta
        segundaConta.saldo += 500;
        System.out.println(segundaConta.saldo);

        System.out.println("saldo da primeira conta" + primeiraConta.saldo);
        System.out.println("saldo da segunda conta" + segundaConta.saldo);

        //Acessando atributos zerados
        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.numero);
        System.out.println(primeiraConta.titular);

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
