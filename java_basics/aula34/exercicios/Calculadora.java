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
}
