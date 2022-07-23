public class Conta {
    double saldo;
    int agencia;
    int numero;
    String titular;


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
}
