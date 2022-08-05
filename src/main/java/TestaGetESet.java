public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(478,49);
        //conta.numero = 10;
        conta.setNumero(1337);

        System.out.println(conta.getNumero());

        Cliente paulo = new Cliente();
        conta.setTitular(paulo);

        paulo.setNome("Paulo Silveira");

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProffisao("programador");

        //Em duas linhas, temos o mesmo resultado
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProffisao("programador");
    }
}
