package java_basics.aula13.src.exerciciosaula13;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exec11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num1 = sc.nextInt();

        System.out.println("Digite outro número inteiro: ");
        int num2 =sc.nextInt();


        System.out.println("Digite um número real: ");
        double real = sc.nextDouble();

        double result1 = (num1 * 2) * (num2 / 2);
        System.out.println("1° Resultado: " + result1);

        double result2 = (num1 * 3) + 3;
        System.out.println("2° Resultado: " + result2);

        double result3 = Math.pow(real,3);
        System.out.println("3° Resultado: " + result3);
    }
}
