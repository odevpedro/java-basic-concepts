public class TesteSistema {
    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setSenha(222);

        SistemaInterno sistemaInterno = new SistemaInterno();
        sistemaInterno.autentica(g);
    }
}
