package java_basics.aula20;

// Guardar 4 notas bimestrais de 30 alunos
public class Matrizes01 {
    public static void main(String[] args) {

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

        // Output dos valores
        for(int i=0; i<notasAlunos.length; i++){
           // System.out.println(notasAlunos[i][i]);
            // for aninhado
            for (int j=0; j<notasAlunos[i].length; j++){
                System.out.println(notasAlunos[i][j] + " ");
            }
            System.out.println();
        }

        // Mudança de valor de uma célula da matriz
        notasAlunos[1][3]= 10;

        System.out.println();

        for(int i=0; i<notasAlunos.length; i++){
            // System.out.println(notasAlunos[i][i]);
            // for aninhado
            for (int j=0; j<notasAlunos[i].length; j++){
                System.out.println(notasAlunos[i][j] + " ");
            }
            System.out.println();
        }

        // Calculando a média de cada aluno
        System.out.println("calculando a média de cada aluno");

        double soma;
        for(int i=0; i<notasAlunos.length; i++) {
            soma = 0;
            for(int j=0; j<notasAlunos.length; j++) {
                soma += notasAlunos[i][j];
            }
            System.out.println("Média do aluno " + i + " é = " + (soma/4));
        }
    }
}
