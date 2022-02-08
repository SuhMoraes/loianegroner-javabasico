package java_basics.aula14.src.exercicios;

import java.util.Scanner;

public class Exec01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double num1 = sc.nextDouble();

        System.out.println("Digite outro número: ");
        double num2 = sc.nextDouble();

        if (num1 > num2 ){
            System.out.println("O num1 é maior: " +num1);
        } else {
            System.out.println("O num2 é maior: " +num2);
        }

    }
}
