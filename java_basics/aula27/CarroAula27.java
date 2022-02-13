package java_basics.aula27;

public class CarroAula27 {

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


    double calculaCombustivel( double km){

        double qtdCombustivel = km/consumoCombustível;

        return qtdCombustivel;
    }
}
