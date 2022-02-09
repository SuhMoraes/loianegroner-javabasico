package java_basics.aula20;

import java.util.Scanner;

public class MatrizesIrregular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o número de pessoas que serão entrevistadas: ");
        int numEntrevistados = sc.nextInt();

        String[][] nomeFilhos = new String[numEntrevistados][];

        for(int i=0; i<nomeFilhos.length; i++) {

            System.out.println("Entre com a quantidade de filhos");
            int qtdFilhos = sc.nextInt();

            nomeFilhos[i] = new String[qtdFilhos];

            for (int j=0; j<nomeFilhos[i].length;j++) {

                System.out.println("Digite o nome do filho " + (j+1));

                nomeFilhos[i][j] = sc.next();
            }
        }
        for(int i=0; i<nomeFilhos.length; i++) {
            System.out.println("Pessoa " + i + " tem " + nomeFilhos[i].length + " filhos");

            for (int j=0; j<nomeFilhos[i].length;j++) {
                System.out.println(nomeFilhos[i][j]);
            }
        }
    }
}
