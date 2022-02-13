package java_basics.aula27;

public class TesteCarroAula27 {
    public static void main(String[] args) {

        CarroAula27 van = new CarroAula27();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustível = 0.2;

        CarroAula27 fusca = new CarroAula27();
        fusca.marca = "Volkswagem";
        fusca.modelo = "Fusca";
        fusca.numPassageiros = 4;
        fusca.capCombustivel = 30;
        fusca.consumoCombustível = 0.5;

        //Chamando o método
        van.exibirAutonomia();

        //Chamando um método com retorno
        van.obterAutonomia();

        // Chamando o método com retorno e parametro/arguemnto
        double qtdCombustivel10 = van.calculaCombustivel(10);
        System.out.println("O Consumo de combustível/Km é: " + qtdCombustivel10);





    }
}
