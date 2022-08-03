

public class Conta {
   private double saldo; //declaramos um atributo como privado, para encapsular
    int agencia;
    int numero;
    public Cliente titular;


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

    public double pegaSaldo(){
        return saldo;
    };
}
