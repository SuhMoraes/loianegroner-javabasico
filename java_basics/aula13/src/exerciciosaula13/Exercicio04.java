package java_basics.aula13.src.exerciciosaula13;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);

        System.out.println("===== Notas Bimestrais =====");
        System.out.println(" ");

        System.out.print("Digite a nota de Português: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a nota de Matemática: ");
        double nota2 = sc.nextDouble();

        System.out.print("Digite a nota de Ciências: ");
        double nota3 = sc.nextDouble();

        System.out.print("Digite a nota de Artes: ");
        double nota4 = sc.nextDouble();

        double result = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.print("Média é: " + result);
    }
}
