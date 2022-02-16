package java_basics.aula43.contabancaria;

public class Conta {

    private String nomeCliente;
    private int numConta;
    private double saldo;

    public double sacar(double valor){
        if(saldo < valor) {
            System.out.println("Saque indisponível");
        } else {
            saldo -= valor;
            System.out.println("Saque efetuado com sucesso, novo saldo = " + saldo);
            return saldo;
        }
         return saldo;
    }

    public double depositar(double valor){
        saldo += valor;
        return saldo;
    }

    public Conta() {
    }

    public Conta(String nomeCliente, int numConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{ " +
                " nomeCliente= " + nomeCliente +
                " numConta= " + numConta +
                " saldo= " + saldo +
                '}';
    }
}
