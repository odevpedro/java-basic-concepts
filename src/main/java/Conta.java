public class Conta {
    double saldo;
    int agencia;
    int numero;
    String titular;


    //métodos

    public void deposita(double valor){
        this.saldo = saldo + valor;
    }

}
