package java_basics.aula34.exercicios;

public class Calculadora {

    public static double somar(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtrair(double num1, double num2){
        return num1 - num2;
    }

    public static double multiplicar(double num1, double num2){
        return num1 * num2;
    }

    public static double dividir(double num1, double num2){
        return num1 / num2;
    }

    public static double potencia(double num1, double num2){
       // return Math.pow(num1, num2); OUU
        double total = num1;
        for(int i =0; i<num2; i++){
            total *= num1;
        }
        return total;
    }

    // 5! = 5 * 4 * 3 * 2 * 1 = 120;
    public static int fatorial(int num) {
        if ( num == 0 ){
            return 1;
        }

        int total = 1;
        for(int i=num; i>1; i--){
            total *= i;
        }
        return total;
    }
}
