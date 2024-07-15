package devandroid.julian.aprendendokotlindozero


// aguardando_aprovacao
// pedido_realizado, pagamento_confirmando
// pedido_enviado, pedido_entregue
enum class StatusPedido {
    AGUARDANDO_APROVACAO,// 0
    PEDIDO_REALIZADO,// 1
    PAGAMENTO_CONFIRMADO,// 2
    PEDIDO_ENVIANDO,// 3
    PEDIDO_ENTREGUE
}

class Pedido(
    var total: Double = 0.0,
    var itens: String = "",
    var statusPedido: StatusPedido = StatusPedido.AGUARDANDO_APROVACAO
) {

}

fun main() {

    // Tela de compras
    val pedido = Pedido(125.90, "Livro, Caderno", StatusPedido.PAGAMENTO_CONFIRMADO)


    //Pagamento com cartão
    //pedido.statusPedido = StatusPedido.PEDIDO_REALIZADO

    // Transportadora
    //pedido.statusPedido = StatusPedido.PEDIDO_ENVIANDO
    println( "StatusPedido: ${StatusPedido.AGUARDANDO_APROVACAO.ordinal}" )

    //Histórico de compras
    if ( pedido.statusPedido == StatusPedido.PEDIDO_REALIZADO ){
        println("O seu pedido foi REALIZADO")
    }else if( pedido.statusPedido == StatusPedido.PEDIDO_ENVIANDO ){
        println("O seu pedido foi ENVIADO")
    }else if( pedido.statusPedido == StatusPedido.PAGAMENTO_CONFIRMADO ){
        println("O seu pagamento foi CONFIRMADO")
    }

}