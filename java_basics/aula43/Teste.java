package java_basics.aula43;

public class Teste {
    public static void main(String[] args){
        Aluno aluno = new Aluno();

        aluno.setCurso("Análise e Desenvolvimento de Sistemas");
        double[] notas = {10, 8, 7, 9};
        aluno.setNotas(notas);

         System.out.println(aluno);

         String s1 = "abcde";
         String s2 = "abcde";

        System.out.println(s1.equals(s2));

        Aluno aluno2 = new Aluno();
        aluno2.setCurso("Análise e Desenvolvimento de Sistemas");
        double[] notas2 = {10, 8, 7, 9};
        aluno2.setNotas(notas2);

        System.out.println(aluno == aluno2); // Estamos comparando referência na memória
        System.out.println(aluno.equals(aluno2)); // Comparando igualdade de atributos

    }
}
