package kotlin.dataobjects

data class DadosPessoais(val cpf: String, var email: String? = null, var telefone: String? = null)
data class Pessoa(var nome: String, val dadosPessoais: DadosPessoais) {
    constructor(dadosPessoais: DadosPessoais) : this("", dadosPessoais)
}
data class EmailObj(var assunto: String, var corpo: String,
                    var remetente: String, val recipientes: MutableList<String> = ArrayList<String>())