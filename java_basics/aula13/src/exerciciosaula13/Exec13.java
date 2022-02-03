package java_basics.aula13.src.exerciciosaula13;

import java.util.Scanner;

public class Exec13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor da hora trabalhada: R$");
        double valorHoraTrabalhada = sc.nextDouble();

        System.out.print("Horas trabalhadas: ");
        int horasTrabalhadas = sc.nextInt();

        double salarioBruto = valorHoraTrabalhada * horasTrabalhadas * 30;
        System.out.println("Seu salário bruto: R$" + salarioBruto);

        double descIR = salarioBruto * 11 / 100;
        System.out.println("Seu desconto Imposto de Renda (11%): R$" + descIR);

        double descInss = salarioBruto * 8 / 100;
        System.out.println("Seu desconto do INSS(8%): R$" + descInss);

        double descSind = salarioBruto * 5 / 100;
        System.out.println("Seus desconto do Sindicato(5%): R$" + descSind);

        double salarioLiquido = salarioBruto - (descInss + descIR + descSind) ;
        System.out.println("Salário Salário: R$" + salarioLiquido);

        sc.close();
    }
}
