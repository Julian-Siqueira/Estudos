package devandroid.julian.aprendendokotlindozero

//Abstração
// Pessoa: cpf, nome, endereço,
// Cachorro: nome, raça, peso, porte,

class Jogador {

    var kart        = ""
    var pneu        = ""
    var planador    = ""

    fun acelerar( aceleracao: Int = 0 ){
        println("acelerar na velocidade: $aceleracao ")
    }

    /*fun retornarPoder(): String {
        return "Casco vermelho"
    }*/

    fun retornarPoder(): String = "Casco vermelho"

}

fun main() {

    val jogador = Jogador()
    //jogador.kart = "Kart do Mario"
    //jogador.acelerar( aceleracao = 80 )
    val poder = jogador.retornarPoder()
    println( poder )
    //println( jogador.kart )



}