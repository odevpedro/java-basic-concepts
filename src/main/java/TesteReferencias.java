public class TesteReferencias {
    public static void main(String[] args) {
        //Já que o gerente é um funcionario podemos
        Funcionario gerente = new Gerente();
        gerente.setNome("Pedro");
        System.out.println(gerente.getNome());

        //gerente.autentica(222);


        Gerente g1 = new Gerente();
        g1.setNome("Paulo");
        System.out.println(g1.getNome());
        g1.setSalario(999999);

        Funcionario f = new Funcionario();
        f.setSalario(2000.0);

        EditorVideo ev = new EditorVideo();
        ev.setSalario(2500.0);


        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(f);
        controle.registra(ev);

        System.out.println(controle.getSoma());
    }
}
