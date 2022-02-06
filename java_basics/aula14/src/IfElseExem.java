package java_basics.aula14.src;

import java.util.Scanner;

public class IfElseExem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      // barato <= 10
      // 10 < valor < 15 - pedir desconto
      // 15 <= valor 17 - pesquisar mais
        // >= 17 - muito caro

        System.out.println("Entre com o preo do item");
        double valor = sc.nextDouble();

        if(valor <= 10){
            System.out.println("Está barto, pode comprar!");
        } else if (valor < 10 && valor < 15 ) {
            System.out.println(" Pedir desconto");
        } else if (valor > 15 && valor < 17){
            System.out.println("Pode pesquisar mais");
        } else {
            System.out.println("Está muito caro");
        }
    }
}
