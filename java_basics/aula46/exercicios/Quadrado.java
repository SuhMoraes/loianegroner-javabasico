package java_basics.aula46.exercicios;

public class Quadrado extends Figura2D implements DimensaoSuperficial{

    private double lado;

    public Quadrado(String nome, String cor, double lado) {
        super(nome, cor);
        this.lado = lado;
    }

    public Quadrado() {
        super();
    }


    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public Quadrado(String nome, String cor) {
        super(nome, cor);
    }

    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);
    }
}
