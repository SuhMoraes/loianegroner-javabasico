package java_basics.aula46.exercicios;

public class Triangulo extends Figura2D implements DimensaoSuperficial{

    private double altura;
    private double base;

    public Triangulo(String nome, String cor, double altura, double base) {
        super(nome, cor);
        this.altura = altura;
        this.base = base;
    }

    public Triangulo() {

    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public Triangulo(String nome, String cor) {
        super(nome, cor);
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}
