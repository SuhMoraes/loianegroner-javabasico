package java_basics.aula46.exercicios;


public class Circulo extends Figura2D{

    private double raio;

    public Circulo(String nome, String cor, double raio) {
        super(nome, cor);
        this.raio = raio;
    }

    public Circulo() {

    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public Circulo(String nome, String cor) {
        super(nome, cor);
    }

    @Override
    public double calcularArea() {
        return (raio * raio) * Math.PI;
    }
}
