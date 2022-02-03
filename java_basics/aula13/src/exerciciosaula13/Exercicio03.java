package java_basics.aula13.src.exerciciosaula13;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero1 = sc.nextInt();

        System.out.print("Digite outro numero: ");
        int numero2 = sc.nextInt();

        int result = numero1 + numero2;
        System.out.print("A soma de " + numero1  + " e " + numero2  + " é: " + result);
    }
}
