package java_basics.aula34.exercicios;

import java.util.Scanner;

public class Exec03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        do {
            System.out.println("Entre com um número positivo");
            num = sc.nextInt();

            if (num < 0){
                System.out.println("Número inválido, entre novamente");
            }
        } while (num < 0);

        System.out.println(Calculadora.fatorial(num));
    }
}
