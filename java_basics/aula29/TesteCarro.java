package java_basics.aula29;

public class TesteCarro {
    public static void main(String[] args) {

        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustível = 0.2;

        Carro gol = new Carro("Volks", "Gol G5", 5, 50, 10);

        System.out.println(gol.numPassageiros);
        System.out.println(gol.capCombustivel);
    }
}
