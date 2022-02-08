package java_basics.aula19;

// Armazenar a temperatura diária por um ano
public class Arrays {
    public static void main(String[] args) {
//
//        double tempDia001 = 31.2;
//        double tempDia002 = 25.5;
//        double tempDia003 = 28.8;
//        double tempDia004 = 27.9;
//        double tempDia005 = 32.0;
//        double tempDia006 = 31.1;
//        double tempDia007 = 31.5
// Solução para armazenar uma lista de dados -> ARRAY

         double[] temperaturas = new double[365];
         temperaturas[0] = 25.5;
         temperaturas[1] = 11.5;
         temperaturas[2] = 38.8;
         temperaturas[3] = 22.7;
         temperaturas[4] = 10.0;

        System.out.println("O valor da temperatura do dia 3 é: " + temperaturas[2]);

        System.out.println("O tamanho do array: " + temperaturas.length);

        System.out.println("Valores do  array: ");

        for( int i = 0; i<temperaturas.length; i++){
            System.out.println("O valor da temperatura do dia: " + (i+1) + " é: " + temperaturas[i]);
        }

        // For Melhorado
        for (double temp: temperaturas){
            System.out.println(temp);
        }



    }
}
