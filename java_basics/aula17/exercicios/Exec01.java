package java_basics.aula17.exercicios;

import java.util.Scanner;

public class Exec01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean notaValida = false;

        do{
            System.out.println("Digite uma nota: ");
            int nota = sc.nextInt();

            if(nota >=0 && nota <=10) {
                notaValida = true;
                System.out.println("Você digitou: " + nota);
            } else {
                System.out.println("Nota inválida, digite novamente.");
            }
        } while (!notaValida);


    }
}
