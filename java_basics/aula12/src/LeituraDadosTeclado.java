import java.util.Scanner;

public class LeituraDadosTeclado {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Seu nome é: " + nome);

        System.out.print("Digite um nome: ");
        String umNome = sc.next();
        System.out.println("O nome digitado é: " + umNome);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.println("Sua idade: " + idade);

        System.out.print("Digite seu peso: ");
        double peso = sc.nextDouble();
        System.out.println("Seu peso é: " + peso);



    }
}
