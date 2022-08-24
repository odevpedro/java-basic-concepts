public class Gerente extends Funcionario { //Gerente herda o estado e o comportamento contido em Funcionário
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

   public double getBonificacao() {
       System.out.println("Chamando o método bonificacao do GERENTE");
       return super.getSalario();
    }
}
