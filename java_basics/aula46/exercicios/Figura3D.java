package java_basics.aula46.exercicios;

public abstract class Figura3D extends FiguraGeometrica implements  DimensaoSuperficial, DimensaoVolumetrica{
    public Figura3D(String nome, String cor) {
        super(nome, cor);
    }

    public Figura3D() {

    }
}
