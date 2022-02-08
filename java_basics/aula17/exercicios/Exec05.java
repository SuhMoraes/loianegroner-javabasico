package java_basics.aula17.exercicios;

import java.util.Scanner;

public class Exec05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         double popA;
         double popB;
         double taxaA;
         double taxaB;

         boolean valido = false;

         do{
             System.out.println("Informe com a população A: ");
             popA = sc.nextDouble();

             if(popA > 0) {
                 valido = true;
             } else {
                 System.out.println("População A precisa ser maior que 0.");
             }
         } while (!valido);

         valido = false;
         do {
             System.out.println("Informe a população B: ");
             popB = sc.nextDouble();

             if( popB>0){
                 valido = true;
             } else {
                 System.out.println("População B precisa ser maior que 0");
             }

         } while (!valido);

        valido = false;
        do {

            System.out.println("Entre com a taxa de crescimento da população A:");
            taxaA = sc.nextDouble();

            if (taxaA > 0){
                valido = true;
            } else {
                System.out.println("Taxa de crescimento A precisa ser maior que 0.");
            }

        } while (!valido);


        valido = false;
        do {

            System.out.println("Entre com a taxa de crescimento da população B:");
            taxaB = sc.nextDouble();

            if (taxaB > 0){
                valido = true;
            } else {
                System.out.println("Taxa de crescimento B precisa ser maior que 0.");
            }

        } while (!valido);

        int count = 0;

        while (popA < popB) {

            popA +=(popA/100) * taxaA;
            popB +=(popB/100) * taxaB;
            count++;
        }
        System.out.println("População A: " + popA);
        System.out.println("População b: " + popB);
        System.out.println("Qtd anos:  " + count);
    }
}
