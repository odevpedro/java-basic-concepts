package Banco;

public class ContaCorrente extends Conta{
    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    //sobre escrita de método
    @Override
    public boolean saca(double valor) {
        double valorASacar = valor + 0.2;
        return super.saca(valorASacar);
    }
}
