package exerciciosaula13;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Convertendo Metro em Centímetros ====");
        System.out.println(" ");

        System.out.print("Tamanho em Mt: ");
        double mt = sc.nextInt();

        double cm = mt * 100;

        System.out.print("Resultado da conversão de " + mt + "m, será de: " + cm + " cm");
    }
}
