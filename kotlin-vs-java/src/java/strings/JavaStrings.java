package java.strings;

import java.dataobjects.Pessoa;

public class JavaStrings {
    public static String personalizacaoIncrivel(Pessoa pessoa, String corpo) {
        return "Bom dia, " + pessoa.getNome() + "\n" + corpo;
    }
}
