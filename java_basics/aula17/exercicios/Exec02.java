package java_basics.aula17.exercicios;

import java.util.Scanner;

public class Exec02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isDiferent = false;
        String userName;
        String password;

        do{
            System.out.println("Digite o nome de usuário: ");
            userName = sc.nextLine();

            System.out.println("Digite a sua senha: ");
            password = sc.nextLine();

            if(userName.equalsIgnoreCase(password) ) {
               System.out.println("Nome são iguais, digite novamente");
            } else {
                isDiferent = true;
                System.out.println("Senha e usuários válidos");
            }

        } while (!isDiferent);

    }
}
