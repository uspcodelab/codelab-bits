package java.nullables;

import com.sun.istack.internal.Nullable;

import java.dataobjects.DadosPessoais;
import java.dataobjects.EmailObj;
import java.dataobjects.Pessoa;

public class JavaNullables {
    public static void enviarEmail(@Nullable Pessoa pessoa, @Nullable String assunto, @Nullable String texto) {
        if (pessoa != null && assunto != null && texto != null) {
            DadosPessoais dadosPessoais = pessoa.getDadosPessoais();

            if (dadosPessoais != null) {
                String emailDestino = dadosPessoais.getEmail();

                EmailObj mensagem = new EmailObj(assunto, texto, "codelab-bits@exemplo.com");
                mensagem.getRecipientes().add(emailDestino);
                // Prossegue com o envio do e-mail
            }
        }
    }
}