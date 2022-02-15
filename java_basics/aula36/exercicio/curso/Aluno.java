package java_basics.aula36.exercicio.curso;

public class Aluno {

    private String nome;
    private int matricula;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    private double media;

    public Aluno() {
    }

   public Aluno(String nome, int matricula, double nota1, double nota2, double nota3, double nota4, double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public double getMedia() {

        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String obterInfo(){
        return "Nome: " + nome + ";" +
                " Matricula: " + matricula + ";" +
                " Media: " + media;
    }
}
