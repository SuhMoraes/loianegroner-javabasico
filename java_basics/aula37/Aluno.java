package java_basics.aula37;

public class Aluno extends Pessoa{

    private String curso;
    private String notas;

    public Aluno(String curso, String notas) {
        this.curso = curso;
        this.notas = notas;
    }

    public Aluno() {

    }


    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public double calcMedia(){
        return 0;
    }

    public boolean verificarAprovado(){
        return true;
    }
}
