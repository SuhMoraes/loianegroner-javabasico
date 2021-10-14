package exerciciosaula13;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calcule a área do Raio");

        System.out.println("Digite o Raio: ");
        double raio = sc.nextDouble();

        double area = Math.PI * Math.pow(raio,2);

        System.out.println("A área do círculo é: " + area);


    }
}
