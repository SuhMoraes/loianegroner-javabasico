package java_basics.aula13.src.exerciciosaula13;

import java.util.Locale;
import java.util.Scanner;

public class Exec08 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));

        Scanner sc = new Scanner(System.in);

        System.out.print("Quanto você ganha por hora: R$ ");
        double qtoGanhaHora = sc.nextDouble();

        System.out.print("Quanto você trabalha por dia: ");
        double horaTrabalhada = sc.nextDouble();

        double salario = horaTrabalhada *qtoGanhaHora;

        System.out.println("Seu salário será: R$" + salario);

    }
}
