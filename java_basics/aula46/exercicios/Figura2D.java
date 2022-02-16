package java_basics.aula46.exercicios;

public abstract class Figura2D extends FiguraGeometrica implements  DimensaoSuperficial{

    public Figura2D(String nome, String cor) {
        super(nome, cor);
    }

    public Figura2D() {
        super();
    }
}
