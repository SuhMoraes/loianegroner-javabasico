package java_basics.aula25;

public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustível;

    void exibirAutonomia(){
        System.out.println("A autonomia do carro "+ modelo +" é: " + capCombustivel * consumoCombustível + " km");
    }
}
