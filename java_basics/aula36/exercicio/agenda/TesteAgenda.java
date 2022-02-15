package java_basics.aula36.exercicio.agenda;

import java.util.Scanner;

public class TesteAgenda {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome da agenda");
        String nome = sc.nextLine();

        Agenda agenda = new Agenda(nome);

        Contato[] contatos = new Contato[3];
        for (int i=0; i<3; i++){
            System.out.println("Digite as informações de contato " + (i+1));
            Contato c = new Contato();

            System.out.println("Digite o nome: ");
            nome = sc.nextLine();
            c.setNoome(nome);

            System.out.println("Digite o telefone: ");
            String telefone = sc.nextLine();
            c.setTelefone(telefone);

            System.out.println("Digite o email: ");
            String email = sc.nextLine();
            c.setEmail(email);

            contatos[i] = c;
        }

        agenda.setContatos(contatos);

        if(agenda != null) {
            System.out.println(agenda.obterInfo());
        }

    }
}
