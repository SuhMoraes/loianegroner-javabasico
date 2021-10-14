public class BreakGoto {

    public static void main(String[] args) {

        for (int i=0; i<=4; i++){
            rotulo1: { //--> Serve para identificar o código
                rotulo2: {
                    rotulo3: {
                        if ( i == 1 ) {
                            break rotulo1;
                        }
                        if ( i == 2 ){
                            break rotulo2;
                        }
                        if ( i == 3 ) {
                            break rotulo3;
                        }
                        System.out.println("rotulo3");
                    }
                    System.out.println("rotulo2");
                }
                System.out.println("rotulo1");
            }
            System.out.println("Valor de i: " + i);
        }
        System.out.println("Saiu do Loop");
    }
}
