public class TestaBanco{
    public static void main(String[] args) {
        //Criando o cliente
        Cliente paulo = new Cliente();
        paulo.setNome("Paulo");
        paulo.setCpf("10319428100");
        paulo.setProffisao("Programador");

        Cliente paula = new Cliente();

        //Criando a Conta
        Conta contaDoPaulo = new Conta(16,8);
        contaDoPaulo.deposita(100);

        //Acessando o atributo profisão através do titular que compõe a conta
        contaDoPaulo.setTitular(paulo);
        System.out.println(contaDoPaulo.getTitular().getProffisao());
        System.out.println(contaDoPaulo.getTitular().getNome());
        System.out.println(contaDoPaulo.getTitular().getNome());





    }
}
