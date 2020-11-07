package java.verbosidade;

import java.dataobjects.DadosPessoais;
import java.dataobjects.Pessoa;
import java.nullables.JavaNullables;
import java.strings.JavaStrings;

public class JavaVerbosidade {
    public static void main(String[] args) {
        DadosPessoais dadosPessoais = new DadosPessoais("123.456.789-00");
        Pessoa pessoa = new Pessoa(dadosPessoais);

        pessoa.getDadosPessoais().setEmail("renan@exemplo.com");
        System.out.println(pessoa.getDadosPessoais().getEmail());

        String corpo = JavaStrings.personalizacaoIncrivel(pessoa,
            "Segue esse spam aqui de uma newsletter da qual você não lembra de ter se cadastrado. \n" +
                    "Atenciosamente,\n" +
                    "Literalmente qualquer empresa");

        JavaNullables.enviarEmail(pessoa, "Exemplo Kotlin vs Java", corpo);
    }
}
