package java_basics.aula43.contabancaria;

import java.util.Scanner;

public class TesteConta {
    public static void main(String[] args) {

        // TODO Criar contas

        System.out.println("==== Conta Bancária ====");
        ContaEspecial user1 = new ContaEspecial();
        user1.setNomeCliente("Maurício");
        user1.setNumConta(123455);
        user1.setSaldo(0);
        user1.setLimite(50);
      //  user1.setDiaRendimento(16);

        user1.depositar(0);
        System.out.println(user1);

        user1.sacar(49);
        System.out.println(user1.toString());
//
//        if(user1.calcularNovoSaldo(0.5)){
//            System.out.println("Rendimento aplicado, novo saldo é de: " + user1.getSaldo());
//        } else {
//            System.out.println("Não houve rendimento");
//        }


    }
}
