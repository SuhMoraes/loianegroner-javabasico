package java_basics.aula46.exercicios;


public class Cilindro extends Figura3D{

    private double raio;
    private double altura;

    public Cilindro(String nome, String cor, double raio, double altura) {
        super(nome, cor);
        this.raio = raio;
        this.altura = altura;
    }

    public Cilindro() {

    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Cilindro(String nome, String cor) {
        super(nome, cor);
    }

    @Override
    public double calcularArea() {
        double areaBase = Math.PI *(raio*raio);
        double areaLateral = 2 * Math.PI * raio * altura;
        double areaTotal = (2*areaBase) + areaLateral;
        return areaTotal;
    }

    @Override
    public double calcularVolume() {
        return Math.PI * (raio*raio) * altura;
    }
}
