package java_basics.aula13.src.exerciciosaula13;

import java.util.Scanner;

public class Exec09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Qual é a temperatura em Farenheit:  ");
        double f = sc.nextDouble();

        double convertCelsius =  5 * (f-32) / 9;

        System.out.printf("A conversão de Farenheit para Celsius " + convertCelsius + "°C");



    }
}
