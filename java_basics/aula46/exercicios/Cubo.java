package java_basics.aula46.exercicios;

public class Cubo extends Figura3D {

    private double lado;

    public Cubo(String nome, String cor) {
        super(nome, cor);
    }

    public Cubo() {
        super();
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return 6 * (lado *lado);
    }

    @Override
    public double calcularVolume() {
        return Math.pow(lado,3);
    }

}
