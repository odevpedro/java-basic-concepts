public class ControleBonificacao {
    private double soma;

    public void registra(Gerente g1){
        double boni = g1.getBonificacao();
        this.soma = this.soma + boni;

    }
    //Método para registrar especificamente os funcinarios
    public void registra(Funcionario f) {
        double boni = f.getBonificacao();
        this.soma = this.soma + boni;
    }

    //Método para registrar especificamente os funcinarios
    public void registra(EditorVideo ev) {
        double boni = ev.getBonificacao();
        this.soma = this.soma + boni;
    }

    public double getSoma(){
        return soma;

    }
}
