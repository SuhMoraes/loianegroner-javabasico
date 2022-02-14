package java_basics.aula33.exercicios;

public class Lampada {

    private String marca;
    private String tipoDeLampada;
    private int wattsPotencia;
    private int voltagem;
    private boolean ligada;

    public Lampada() {
    }

    public Lampada(String marca, String tipoDeLampada, int wattsPotencia, int voltagem, boolean ligada) {
        this.marca = marca;
        this.tipoDeLampada = tipoDeLampada;
        this.wattsPotencia = wattsPotencia;
        this.voltagem = voltagem;
        this.ligada = ligada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoDeLampada() {
        return tipoDeLampada;
    }

    public void setTipoDeLampada(String tipoDeLampada) {
        this.tipoDeLampada = tipoDeLampada;
    }

    public int getWattsPotencia() {
        return wattsPotencia;
    }

    public void setWattsPotencia(int wattsPotencia) {
        this.wattsPotencia = wattsPotencia;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public void ligar(){
        setLigada(true);
    }

    public void desligar(){
        setLigada(false);
    }

    public void mostrarEstado(){
        if (isLigada()) {
            System.out.println("A lampada está ligada");
        } else {
            System.out.println("Lampada está desligada");
        }
    }



}
