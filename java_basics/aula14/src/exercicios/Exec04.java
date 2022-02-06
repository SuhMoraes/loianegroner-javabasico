package java_basics.aula14.src.exercicios;

import java.util.Scanner;

public class Exec04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("É consoante ou vogal?");
        System.out.println("Digte uma letra: ");
        String letra = sc.nextLine();

        char vogal[] = {'a', 'e', 'i', 'o', 'u'};

        if(letra.equals(vogal)) {
            System.out.println("É vogal");
        } else {
            System.out.println("Consoante");
        }
    }
}
