public class TestaFuncionario {
    public static void main(String[] args) {

        Funcionario nico = new Funcionario();
        nico.setSalario(2600);
        nico.setNome("Nico steppat");
        nico.setCpf("324234");

        System.out.println(nico.getNome());
        System.out.println(nico.getBonificacao());


    }

}
