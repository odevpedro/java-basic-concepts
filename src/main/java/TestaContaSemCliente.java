public class TestaContaSemCliente {
    public static void main(String[] args) {
        Conta contaDaMarcela = new Conta(45,57);

        Cliente marcela = new Cliente();
        marcela.setNome("marcela");
        contaDaMarcela.setTitular(marcela);
        System.out.println(contaDaMarcela.getTitular());

        System.out.println(contaDaMarcela.getTitular().getNome());

        //Temos NullPointerException quando tentamos acessar a propriedade de um objeto que não foi inicializado
        Conta contaDoMarcos = new Conta(498,87);
        //tento acessar o estado nome de um objeto que ainda não foi iniciado
        //System.out.println(contaDoMarcos.titular.nome);
    }
}
