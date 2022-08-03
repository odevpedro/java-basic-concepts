public class TestaContaSemCliente {
    public static void main(String[] args) {
        Conta contaDaMarcela = new Conta();

        contaDaMarcela.titular = new Cliente();
        contaDaMarcela.titular.nome = "Marcela";
        System.out.println(contaDaMarcela.titular.nome);

        //Temos NullPointerException quando tentamos acessar a propriedade de um objeto que não foi inicializado
        Conta contaDoMarcos = new Conta();
        //tento acessar o estado nome de um objeto que ainda não foi iniciado
        System.out.println(contaDoMarcos.titular.nome);
    }
}
