package java_basics.aula43.contabancaria;

public class ContaEspecial extends Conta{

    private double limite;

    public ContaEspecial(double limite) {
        this.limite = limite;
    }

    public ContaEspecial(String nomeCliente, int numConta, double saldo, double limite) {
        super(nomeCliente, numConta, saldo);
        this.limite = limite;
    }

    public ContaEspecial() {

    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public double sacar(double valor) {

        double saldoComLimite = this.getSaldo() + limite;
        if((saldoComLimite-valor) >= 0){
            this.setSaldo(this.getSaldo()-valor);
            return getSaldo();
        }
        return getSaldo();
    }

    @Override
    public String toString() {
        return "ContaEspecial{" +
                "limite=" + limite +
                "} " + super.toString();
    }
}
