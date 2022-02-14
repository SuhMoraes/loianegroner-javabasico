package java_basics.aula33.exercicios;

public class TesteLampada {
    public static void main(String[] args) {

        Lampada lampada = new Lampada();
        lampada.setMarca("Reluz");
        lampada.setTipoDeLampada("Fluorescente");
        lampada.setVoltagem(127);
        lampada.setWattsPotencia(100);
        lampada.ligar();

        System.out.println(lampada.getMarca());
        System.out.println(lampada.getTipoDeLampada());
        System.out.println(lampada.getVoltagem());
        System.out.println(lampada.isLigada());
    }
}
