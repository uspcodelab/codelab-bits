package java.dataobjects;

import java.util.ArrayList;
import java.util.List;

public class EmailObj {
    private String assunto;
    private String corpo;
    private String remetente;
    private final List<String> recipientes;

    public EmailObj(String assunto, String corpo, String remetente) {
        this.assunto = assunto;
        this.corpo = corpo;
        this.remetente = remetente;
        this.recipientes = new ArrayList<String>();
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getCorpo() {
        return corpo;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }

    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public List<String> getRecipientes() {
        return recipientes;
    }
}
