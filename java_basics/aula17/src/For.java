package java_basics.aula17.src;

public class For {

    public static void main(String[] args){

        // FOR Normal
        System.out.println("Incremento");
        for (int i = 0; i <=  5; i++){
            System.out.println("i tem valor: " + i);
        }

        System.out.println("");
        System.out.println("Decremento");
        // Decremento -> Quando for decrementar , colocar o >=
        for (int i = 5; i >= 0; i--){
            System.out.println("i tem valor: " + i);
        }


    }
}
