package java_basics.aula34;

public class TesteCalculadora {
        public static void main(String[] args) {

            int soma1 = MinhaCalculadora.soma(2,5);
            System.out.println(soma1);

            int soma2 = MinhaCalculadora.soma(10,11,90);
            System.out.println(soma2);

            double soma3 = MinhaCalculadora.soma(2.5, 5.0);
            System.out.println(soma3);

           int soma2Valores = soma2Valores(258, 988);
            System.out.println(soma2Valores);
        }

        static int soma2Valores(int num1, int num2){
            return MinhaCalculadora.soma(num1, num2);
        }
}
