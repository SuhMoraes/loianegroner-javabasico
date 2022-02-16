package java_basics.aula39;

public class Aluno extends Pessoa {

    private String curso;
    private double[] notas;

    public void verificarAcesso(){
        this.nomeVisibilidade = "Acessor";
    }

    public Aluno() {
        super();
    }

    public Aluno(String nome, String endereco, String telefone, String cpf, String curso, double[] notas) {
        super(nome, endereco, telefone, cpf);
        this.curso = curso;
        this.notas = notas;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
}
