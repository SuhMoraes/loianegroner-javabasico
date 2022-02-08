package java_basics.aula14.src.exercicios;

import java.util.Scanner;

public class Exec06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 3 números: ");
        int num1 =sc.nextInt();;

        System.out.println("Digite um numero");
        int num2 =sc.nextInt();;

        System.out.println("Digite um numero");
        int num3  =sc.nextInt();;

        if (num1 > num2 && num2 > num3 ) {
            System.out.println("O num1 é maior");
        } else if ( num2 > num1 && num2 > num3) {
            System.out.println(" O num2 é maior");
        } else {
            System.out.println("O num3 é o maior");
        }
    }
}
