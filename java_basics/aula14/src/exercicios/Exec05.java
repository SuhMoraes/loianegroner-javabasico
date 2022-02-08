package java_basics.aula14.src.exercicios;

import java.util.Scanner;

public class Exec05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota 1 do aluno: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a nota 2 do aluno: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2 ) / 2;

        if (media == 10) {
            System.out.println("Aprovado com Distinção");
        } else if (media >= 7 ) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        }
    }

