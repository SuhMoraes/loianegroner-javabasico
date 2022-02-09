package java_basics.aula20.exercicios;

import java.util.Random;

public class Exec01 {
    public static void main(String[] args) {

        int[][] numerosAleatorios = new int[4][4];

        Random numerosRadom = new Random();

        for (int i=0; i<numerosAleatorios.length; i++) {
            for(int j=0; j<numerosAleatorios.length; j++) {
                numerosAleatorios[i][j] =numerosRadom.nextInt(100);
            }
        }

        // Define o maior, a coluna e a linha onde ficarão os números
        int maior = 0;
        int linha =0;
        int col = 0;
        for (int i=0; i<numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios.length; j++) {
                if (numerosAleatorios[i][j]>maior) {
                    maior = numerosAleatorios[i][j];
                    linha = i;
                    col = j;
                }
            }
        }

        // Mostra os números aleatórios
        for (int i=0; i<numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios.length; j++) {
                System.out.println(numerosAleatorios[i][j] + " ");
            }
            System.out.println();
        }

        // Output
        System.out.println("Maior valor = " + maior);
        System.out.println("Linha = " + linha);
        System.out.println("Coluna = " + col);
    }
}
