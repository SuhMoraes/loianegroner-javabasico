package java_basics.aula14.src.exercicios;

import java.util.Scanner;


public class Exec03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o Genero: ");
        char genero = sc.nextLine().toUpperCase().charAt(0);

        switch (genero){
            case 'F':
                System.out.println("F - Feminino");
                break;
            case 'M':
                System.out.println("M - Masculino");
                break;
            default:
                System.out.println("Genero inválido");


        }

    }
}
