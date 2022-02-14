package java_basics.aula34.exercicios;

public class TesteCalculadora {

    static void imprimirTela(double num){
        System.out.println(num);
    }

    public static void main(String[] args) {

//        double soma = Calculadora.somar(2, 5);
//        System.out.println(soma);
        imprimirTela(Calculadora.somar(2, 5));

//        double subtrair = Calculadora.subtrair(2, 5);
//        System.out.println(subtrair);
        imprimirTela(Calculadora.subtrair(352, 5));

//        double multiplicar = Calculadora.multiplicar(2, 5);
//        System.out.println(multiplicar);
        imprimirTela(Calculadora.multiplicar(5,12));

//        double dividir = Calculadora.dividir(2, 5);
//        System.out.println(dividir);
        imprimirTela(Calculadora.dividir(30, 6));


//        double potencia = Calculadora.potencia(2, 5);
//        System.out.println(potencia);
        imprimirTela(Calculadora.potencia(2, 8));

    }
}
