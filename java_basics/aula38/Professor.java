package java_basics.aula38;

public class Professor extends Pessoa {

    private double salario;
    private String nomeCurso;

    public Professor(double salario, String nomeCurso) {
        this.salario = salario;
        this.nomeCurso = nomeCurso;
    }

    public Professor() {

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double calcSalarioLiquido(){
        return 0;
    }
}
