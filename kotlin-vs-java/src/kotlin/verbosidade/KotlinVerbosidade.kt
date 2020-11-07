package kotlin.verbosidade

import kotlin.dataobjects.*
import kotlin.nullables.enviarEmail
import kotlin.strings.personalizacaoIncrivel

fun main(args: Array<String>) {
    val dadosPessoais = DadosPessoais("123.456.789-00")
    val pessoa = Pessoa(dadosPessoais)

    pessoa.dadosPessoais.email = "renan@exemplo.com"
    println(pessoa.dadosPessoais.email)

    val corpo = personalizacaoIncrivel(pessoa,
            "Segue esse spam aqui de uma newsletter da qual você não lembra de ter se cadastrado. \n" +
            "Atenciosamente,\n" +
            "Literalmente qualquer empresa")

    enviarEmail(pessoa, "Exemplo Kotlin vs Java", corpo)
}