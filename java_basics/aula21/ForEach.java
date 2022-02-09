package java_basics.aula21;

import java.util.Random;

public class ForEach {
    public static void main(String[] args) {

        int[] notas = new int[10];

        Random notasRandom = new Random();

        for (int i=0; i< notas.length; i++ ){
            notas[i] = notasRandom.nextInt(10);
        }

        for ( int i=0; i<notas.length; i++) {
            int nota = notas[i];
            System.out.println(notas[i]);
        }

        System.out.println();

        // For Each
        System.out.println("Usando o For Each");
        for (int nota: notas) {
            System.out.println("For Each : " + nota);
        }


        // Exemplo 02 -> Output de uma Matriz
        double[][] notasAlunos = new double[3][4];

        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 8;
        notasAlunos[0][2] = 9.5;
        notasAlunos[0][3] = 8;

        notasAlunos[1][0] = 10;
        notasAlunos[1][1] = 8;
        notasAlunos[1][2] = 9.5;
        notasAlunos[1][3] = 8;

        notasAlunos[2][0] = 10;
        notasAlunos[2][1] = 8;
        notasAlunos[2][2] = 9.5;
        notasAlunos[2][3] = 8;

        for (double[] notasAluno : notasAlunos){
            for (double nota: notasAluno){
            System.out.print(nota + " ");
            }
            System.out.println();
        }

    }
}
