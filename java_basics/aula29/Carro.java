package java_basics.aula29;

public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustível;

     Carro() {
         System.out.println("Classe Carro foi instanciada");
         numPassageiros = 4;
    }

    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustível) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustível = consumoCombustível;
    }
}
