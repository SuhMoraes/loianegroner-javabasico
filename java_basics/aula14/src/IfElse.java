package java_basics.aula14.src;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();

        if(idade > 18){
            System.out.println("É maior de idade!");

        } else {
            System.out.println("Menor idade!");
        }
    }
}
