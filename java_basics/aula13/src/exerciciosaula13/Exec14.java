package java_basics.aula13.src.exerciciosaula13;

import java.util.Scanner;

public class Exec14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é o tamanho do arquivo: ");
        double tamArquivo = sc.nextDouble();

        System.out.println("Qual a velocidade da internet: ");
        double velocidadeInternet = sc.nextDouble();

        double tempo = tamArquivo / velocidadeInternet;
        System.out.println("Tempo de download: " + tempo);
    }
}
