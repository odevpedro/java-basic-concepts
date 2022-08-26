public class Gerente extends FuncionarioAutenticavel { //Gerente herda o estado e o comportamento contido em Funcionário


   public double getBonificacao() {
       System.out.println("Chamando o método bonificacao do GERENTE");
       return super.getSalario();
    }
}
