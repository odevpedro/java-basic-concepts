public class TestaBanco{
    public static void main(String[] args) {
        //Criando o cliente
        Cliente paulo = new Cliente();
        paulo.nome = "Paulo";
        paulo.cpf = "10319428100";
        paulo.proffisao = "Programador";

        Cliente paula = new Cliente();

        //Criando a Conta
        Conta contaDoPaulo = new Conta();
        contaDoPaulo.deposita(100);

        //Acessando o atributo proffisão através do titular que compõe a conta
        contaDoPaulo.titular = paulo;
        System.out.println(contaDoPaulo.titular.proffisao);
        System.out.println(contaDoPaulo.titular.nome);
        System.out.println(contaDoPaulo.titular.cpf);





    }
}
