package java_basics.aula13.src;

public class OperadoresAritmeticos {

    public static void main(String[]args){

        int resultado = 1 + 2;
        System.out.println(resultado);

        resultado = resultado - 1;
        System.out.println(resultado);

        resultado = resultado * 2;
        System.out.println(resultado);

        resultado = resultado + 8;
        System.out.println(resultado);

        resultado = resultado / 2;
        System.out.println(resultado);


        resultado = resultado % 7;
        System.out.println(resultado);

        String primeroNome = "Esta é";
        String segundoNome = " uma String concatenada\n";
        String terceiroNome = primeroNome + segundoNome;
        System.out.println(terceiroNome);

        int num = 5;
        System.out.println(num++);
        // mesma coisa que
        // System.out.println(num++);
        // num = num + 1;
        // num += 1;

        System.out.println(++num);
        // mesma coisa que
        // num += 1;
        // System.out.println(num++);

        System.out.println(num--);
        System.out.println(--num);

    }
}
