import java.util.Scanner;

public class Break {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com um número: ");
        int num = sc.nextInt();

        System.out.print("Entre com um limte: ");
        int max = sc.nextInt();

        for ( int i = num; i <= max; i++){
            System.out.println(i);
            if (i % 7 == 0){
                System.out.println("O valor de i: " + i);
                break;
            }
        }
    }
}
