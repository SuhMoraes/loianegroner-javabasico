package java_basics.aula27.exercicios;

public class Lampada {
    String marca;
    String tipoDeLampada;
    int wattsPotencia;
    int voltagem;
    boolean ligada;

    void ligar(){
        ligada = true;
    }

    void desligar(){
        ligada = false;
    }

    void mostrarEstado(){
        if (ligada) {
            System.out.println("A lampada está ligada");
        } else {
            System.out.println("Lampada está desligada");
        }
    }

}

