package java_basics.aula43.contabancaria;

import java.util.Calendar;

public class ContaPoupança extends Conta{

    private double diaRendimento;

    public ContaPoupança(double diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public ContaPoupança(String nomeCliente, int numConta, double saldo, double diaRendimento) {
        super(nomeCliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public ContaPoupança() {

    }

    public double getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(double diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public boolean calcularNovoSaldo(double taxaRendimento) {
        Calendar hoje = Calendar.getInstance();

        if(diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
           // saldo += saldo * taxaRendimento;
            this.setSaldo(this.getSaldo() + (this.getSaldo() *taxaRendimento));
            return true;
        }
        return false;
    }

//    public double calcularNovoSaldo(double txRendimento){
//
//        return saldo;
//    }


    @Override
    public String toString() {
        return "ContaPoupança {" +
                " diaRendimento= " + diaRendimento +
                " Saldo: " + getSaldo() +
                "} " + super.toString();
    }
}
