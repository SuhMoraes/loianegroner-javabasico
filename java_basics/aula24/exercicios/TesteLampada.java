package java_basics.aula24.exercicios;

public class TesteLampada {

    public static void main(String[] args) {
        Lampada lampadaRes = new Lampada();
        lampadaRes.marca = "Ligth";
        lampadaRes.tipoDeLampada = "Fluorescente";
        lampadaRes.voltagem = 127 ;
        lampadaRes.wattsPotencia = 10;

        System.out.println(lampadaRes.marca);
        System.out.println(lampadaRes.tipoDeLampada);
        System.out.println(lampadaRes.wattsPotencia);
        System.out.println();

        Lampada lampadaInd = new Lampada();
        lampadaInd.marca = " Ligth Industry";
        lampadaInd.tipoDeLampada = "Led";
        lampadaInd.voltagem = 220 ;
        lampadaInd.wattsPotencia = 100;

        System.out.println(lampadaInd.voltagem);
        System.out.println(lampadaInd.wattsPotencia);
        System.out.println(lampadaInd.marca);
        System.out.println();


        Lampada lampadaAuto = new Lampada();
        lampadaAuto.marca = "AutoXenon";
        lampadaAuto.tipoDeLampada = "Xenon";
        lampadaAuto.voltagem = 10 ;
        lampadaAuto.wattsPotencia = 55;

        System.out.println(lampadaAuto.tipoDeLampada);
        System.out.println(lampadaAuto.voltagem);
        System.out.println(lampadaAuto.marca);
        System.out.println();

        Lampada lampadaRua = new Lampada();
        lampadaRua.marca = "Street Ligth";
        lampadaRua.tipoDeLampada = "Fluorescente";
        lampadaRua.voltagem = 127 ;
        lampadaRua.wattsPotencia = 80;

        System.out.println(lampadaRua.voltagem);
        System.out.println(lampadaRua.marca);
        System.out.println(lampadaRua.wattsPotencia);
        System.out.println();
    }


}
