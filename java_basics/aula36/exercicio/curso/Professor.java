package java_basics.aula36.exercicio.curso;

public class Professor {
     private String nomeProf;
     private String departamento;
     private String email;

    public Professor() {
    }

    public Professor(String nomeProf, String departamento, String email) {
        this.nomeProf = nomeProf;
        this.departamento = departamento;
        this.email = email;
    }

    public Professor(String nomeProf) {
    }

    public String getNomeProf() {
        return nomeProf;
    }

    public void setNomeProf(String nomeProf) {
        this.nomeProf = nomeProf;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
