package java_basics.aula36.exercicio.curso;

import javax.swing.*;
import java.util.Scanner;

public class TesteCurso {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a categoria do seu ensino: ");
        String nome = sc.nextLine();

        System.out.println("Horário do curso: ");
        String horario = sc.nextLine();

        System.out.println("Digite o nome do professor: ");
        String nomeProf = sc.nextLine();

        System.out.println("Digite o departamento: ");
        String dp = sc.nextLine();


        Curso curso = new Curso(nome);
        curso.setNome(nome);
        curso.setHorario(horario);

        Professor professor = new Professor();
        professor.setNomeProf(nomeProf);
        professor.setDepartamento(dp);


        Aluno[] alunos = new Aluno[5];
        for(int i=0; i<5; i++) {
            System.out.println("Aluno: " + (i+1));
            Aluno a = new Aluno();

            System.out.println("Digite o nome do aluno: ");
            nome = sc.nextLine();
            a.setNome(nome);

            System.out.println("Digita a nota de Português: ");
            double nota1 = sc.nextDouble();
            a.setNota1(nota1);

            System.out.println("Digita a nota de Matemárica: ");
            double nota2 = sc.nextDouble();
            a.setNota2(nota2);

            System.out.println("Digita a nota de Ciência: ");
            double nota3 = sc.nextDouble();
            a.setNota3(nota3);

            System.out.println("Digita a nota de História: ");
            double nota4 = sc.nextDouble();
            a.setNota4(nota4);

            double media = (nota1 + nota2 + nota3 + nota4) / 4;
            System.out.println(media);
            if(media > 7 ){
                System.out.println("Aluno aprovado");
            } else {
                System.out.println("Aluno reprovado");
            }
            a.setMedia(media);

            Aluno aluno = new Aluno();
            aluno.setNome(nome);
            aluno.setMedia(media);

            alunos[i] = aluno;


        }

        curso.setAlunos(alunos);

        // System.out.println(curso.obter);


    }
}
