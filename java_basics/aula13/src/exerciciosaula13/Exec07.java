package java_basics.aula13.src.exerciciosaula13;

import java.util.Scanner;

public class Exec07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Lado do quadrado: ");
        double lado = sc.nextDouble();

       // area = lado * lado;// OU
        double area = Math.pow(lado, 2);

        System.out.println("O tamamho total da área do quadrado é: " + area);
        System.out.println("O Dobro da área do quadrado é: " + (area * 2));
    }
}
