package java_basics.aula25;

public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombust√≠vel;

    void exibirAutonomia(){
        System.out.println("A autonomia do carro "+ modelo +" √©: " + capCombustivel * consumoCombust√≠vel + " km");
    }
}
