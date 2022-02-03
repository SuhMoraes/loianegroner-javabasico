package java_basics.aula13.src.exerciciosaula13;

import java.util.Scanner;

public class Exec12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Altura: ");
        double altura = sc.nextDouble();

        double result =  (72.2 * altura) - 58;

        System.out.println("O seu peso ideal é: "  + result);
    }
}
