package java_basics.aula33;

public class TesteCalculadora {
    public static void main(String[] args) {

        MinhaCalculadora calc = new MinhaCalculadora();

        int soma1 = calc.soma(2,5);
        System.out.println(soma1);

        int soma2 = calc.soma(10,11,90);
        System.out.println(soma2);

        double soma3 = calc.soma(2.5, 5.9);
        System.out.println(soma3);
    }
}
