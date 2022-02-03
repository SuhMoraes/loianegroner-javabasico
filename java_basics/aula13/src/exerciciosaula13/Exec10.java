package java_basics.aula13.src.exerciciosaula13;

import java.util.Scanner;

public class Exec10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Qual é a temperatura em Celsius: ");
        double c = sc.nextDouble();

        double convertFarenheit = (c * 9/5) + 32;

        System.out.printf("A temperatura de °C " + c + " é igual a " + convertFarenheit + "°F");


    }
}
