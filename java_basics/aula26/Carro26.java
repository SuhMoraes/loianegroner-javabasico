package java_basics.aula26;

public class Carro26 {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustível;

    void exibirAutonomia(){
        System.out.println("A autonomia do carro "+ modelo +" é: " + capCombustivel * consumoCombustível + " km");
    }

    double obterAutonomia(){

        System.out.println("Método obterAutonomia foi chamado.");

        return capCombustivel * consumoCombustível;
    }
}
