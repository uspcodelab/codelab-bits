package kotlin.strings

import kotlin.dataobjects.Pessoa

fun personalizacaoIncrivel(pessoa: Pessoa, corpo: String) : String {
    return "Bom dia, ${pessoa.nome} \n $corpo"
}