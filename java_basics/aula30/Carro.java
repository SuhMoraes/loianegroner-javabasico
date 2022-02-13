package java_basics.aula30;

public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustível;


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


    double obterAutonomia(){
        System.out.println("Método obterAutonomia foi chamado.");
        return this.consumoCombustível * this.capCombustivel;
    }

    double calcularCombustivel(double km){
        double qtdCombustível = km/consumoCombustível;

        return qtdCombustível; // Não dá para colocar this pois a variavel é local.
    }

}

