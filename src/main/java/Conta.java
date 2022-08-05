

public class Conta {
   private double saldo; //declaramos um atributo como privado, para encapsular
    private int agencia;
    private int numero;
     private Cliente titular;


     Conta(int numero, int agencia){
          //O construtor restringe a criação de objetos exigindo determinados atributos
         this.agencia = agencia;
         this.numero = numero;
         System.out.println("Estou criando uma conta" + this.numero);
     }

    //métodos
    public void deposita(double valor){
        this.saldo += valor;
    }


    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(Conta destino, double valor){
        if (this.saldo >= valor){
            saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    public double getSaldo(){
        return saldo;
    }

public int getNumero(){
        return this.numero = numero;
    }

    public int setNumero(int numero){
        return this.numero = numero;
    }


    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public Cliente getTitular() {
        return titular;
    }
}
