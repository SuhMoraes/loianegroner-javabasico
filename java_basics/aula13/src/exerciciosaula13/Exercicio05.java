package java_basics.aula13.src.exerciciosaula13;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args){
        Locale.setDefault(new Locale("pt", "BR"));

        Scanner sc = new Scanner(System.in);

        System.out.println("==== Convertendo Metro em Centímetros ====");
        System.out.println(" ");

        System.out.print("Tamanho em Metros: ");
        double mt = sc.nextDouble();

        double cm = mt * 100;

        System.out.println("Resultado da conversão de " + mt + "m, será de: " + cm + "cm");
    }
}
