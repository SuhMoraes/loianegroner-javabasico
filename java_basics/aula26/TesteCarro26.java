package java_basics.aula26;

public class TesteCarro26 {

    public static void main(String[] args) {

        Carro26 van = new Carro26();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustível = 0.2;

        Carro26 fusca = new Carro26();
        fusca.marca = "Volkswagem";
        fusca.modelo = "Fusca";
        fusca.numPassageiros = 4;
        fusca.capCombustivel = 30;
        fusca.consumoCombustível = 0.5;

        //Chamando o método
        van.exibirAutonomia();

        //Chamando um método com retorno
        van.obterAutonomia();

    }
}
