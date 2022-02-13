package java_basics.aula27.exercicios;

public class ContaUsuario {
    public static void main(String[] args) {

        ContaCorrente user = new ContaCorrente();
        user.numeroConta = 123456;
        user.agencia = 001;
        user.saldo = 1000;
        user.limiteSaldo = 200;
        user.saque(1200);
    }
}