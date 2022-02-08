package java_basics.aula17.exercicios;

import java.util.Scanner;

public class Exec03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome, sexo, estadoCivil;
        boolean infoValida = false;
        int idade;
        double salario;

        do {
            System.out.println("Digite o nome: ");

            nome = sc.next();
            if (nome.length() > 3){
                infoValida = true;
            } else {
                System.out.println("Nome precisa de no mínimo 3 caracteres.");
            }
        } while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Digite a idade: ");

            idade = sc.nextInt();
            if (idade > 0 || idade < 150){
                infoValida = true;
            } else {
                System.out.println("Idade deve ser maior que 0 ou menor que 150.");
            }
        } while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Digite o salário: ");

            salario = sc.nextDouble();
            if (salario > 0){
                infoValida = true;
            } else {
                System.out.println("Salário precisa ser maior que 0.");
            }
        } while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Digite o Sexo: ");

            sexo = sc.nextLine();
            if (sexo.equalsIgnoreCase("f")||sexo.equalsIgnoreCase("m")){
                infoValida = true;
            } else {
                System.out.println("Sexo inválodo.");
            }
        } while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Digite o estado civil: ");

            estadoCivil = sc.nextLine();
            if (sexo.equalsIgnoreCase("s")
                    || sexo.equalsIgnoreCase("c" )
                    || estadoCivil.equalsIgnoreCase("v")
                    || estadoCivil.equalsIgnoreCase("d")){
                infoValida = true;
            } else {
                System.out.println("Estado civil inválido.");
            }
        } while (!infoValida);


    }
}
