package java_basics.aula27.exercicios;

public class ContaCorrente {
    int numeroConta;
    int agencia;
    double saldo;
    double limiteEspecial;
    boolean statusConta;
    double limiteSaldo;

    void saque(double saque){
        if (saldo > saque){
            saldo -= saque;
            System.out.println("Saldo da conta R$" + saldo);
        } else {
            if (saque > saldo) {
                saldo -=  limiteEspecial;
                System.out.println("Saldo insuficiente");
            }
        }
    }

}
