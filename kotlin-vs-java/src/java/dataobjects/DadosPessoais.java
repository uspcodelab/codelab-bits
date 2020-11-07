package java.dataobjects;

public class DadosPessoais {
    private final String cpf;
    private String email = null;
    private String telefone = null;

    public DadosPessoais(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }
}
