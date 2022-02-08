package java_basics.aula17.src;

public class For03 {

    public static void main(String[] args) {

        // FOR com partes ausentes --> NÃO É COMUM
        int count = 0;
        for (; count < 10; ){
            System.out.println("valor de count: " + count);
            count += 2;
        }

        // ==
        System.out.println(" ");

        for (int cont = 0; cont < 10; cont += 2){
            System.out.println("valor de cont: " + cont);
        }
    }
}
