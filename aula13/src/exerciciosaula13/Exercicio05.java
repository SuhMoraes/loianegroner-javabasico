package exerciciosaula13;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Convertendo Metros em Centímetros ====");
        System.out.println(" ");

        System.out.print("Tamanho em Centímetros: ");
        int centimetros = sc.nextInt();

        int metrosResult = centimetros / 100;

        System.out.print("Resultado da conversão de " + centimetros + "Cm, será de: " + metrosResult + " Mt");
    }
}
