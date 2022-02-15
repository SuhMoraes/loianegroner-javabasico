package java_basics.aula36.exercicio.agenda;

public class Contato {
    private String noome;
    private String telefone;
    private String email;

    public String getNoome() {
        return noome;
    }

    public void setNoome(String noome) {
        this.noome = noome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String obterInfo(){
        return "Nome: " + noome + ";" +
                " Telefone: " +telefone + ";" +
                " Email: " + email;
    }

}
