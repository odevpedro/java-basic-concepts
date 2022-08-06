public class Gerente extends Funcionario { //Gerente herda o estado e o comportamento contido em Funcionário
    private String nome;
    private String cpf;
    private double salario;
    private int senha;


    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha){
        if (this.senha == senha){
            return true;
        } else {
            return false;
        }
    }

//    public double getBonificacao() {
//        return this.salario = salario;
//    }
}
