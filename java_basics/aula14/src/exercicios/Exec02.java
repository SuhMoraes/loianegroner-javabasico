package java_basics.aula14.src.exercicios;

import java.util.Scanner;

public class Exec02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== É Positivo ou Negativo? ===");

        System.out.println("Digite um numero: ");
        int num = sc.nextInt();

        if(num < 0){
            System.out.println("Negativo!");
        } else {
            System.out.println("Positivo!");
        }
    }
}
