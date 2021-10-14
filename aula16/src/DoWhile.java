public class DoWhile {

    public static void main (String[] args){

      int i = 0; // count ou cont
      int max = 10;

      System.out.println("Contando até " + max);

      while(i <= max) { //ENQUANTO: Primeira avalia a expressão -> Se for verdadeira, executa
         System.out.println("Valor de i: " + i);
         i++;

      }
        System.out.println(i); // Valor de i

        do { //FAÇA-ENQUANTO: Executa o bloco do código --> Depois PARA quando for falso
            i++;
            System.out.println("Valor de i: " + i);
        } while (i < 25 );
    }
}


