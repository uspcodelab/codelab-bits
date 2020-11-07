package kotlin.nullables

import kotlin.dataobjects.EmailObj
import kotlin.dataobjects.Pessoa

fun enviarEmail(pessoa: Pessoa?, assunto: String?, texto: String?) {
    val emailDestino = pessoa?.dadosPessoais?.email

    val mensagem = EmailObj(assunto?:"Sem Assunto", texto?:"", "codelab-bits@exemplo.com")
    mensagem.recipientes.add(emailDestino!!)
    // Prossegue com o envio do e-mail
}