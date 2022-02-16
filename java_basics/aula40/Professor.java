package java_basics.aula40;

public class Professor extends Pessoa {

    private double salario;
    private String nomeCurso;

    public void verificarAcesso(){
        this.nomeVisibilidade = "Acessor";
    }

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

    public String obterEtiquetaEndereco(){
        String s = "Endereço do Professor: ";
        s += super.getEndereco();

        return s;
    }
}
