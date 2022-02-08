package java_basics.aula14.src.exercicios;

import java.util.Scanner;

public class Exec04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("É consoante ou vogal?");
        System.out.println("Digte uma letra: ");
        String letra = sc.nextLine();

        switch (letra){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
                System.out.println("Vogal");
                break;
            default:
                System.out.println("Consoante.");
        }
    }
}
