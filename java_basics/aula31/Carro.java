package java_basics.aula31;

 public class Carro {
    private String marca;
    private String modelo;
    protected int numPassageiros;
    protected double capCombustivel;
    protected double consumoCombustível;


    public Carro() {
    }

    public Carro(String marca, String modelo, int numPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        System.out.println("Chamando o coonstrutor com 3 parâmetros");
    }

    public Carro(String marca, String modelo) {
        this("Fiat", "Ducato", 10);
        System.out.println("Chamando o construtor com 2 parâmeros");
    }

    void exibirAutonomia(){
        System.out.println("A autonmia do carro é: " + this.capCombustivel * this.consumoCombustível);
    }
}
