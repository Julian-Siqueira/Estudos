package devandroid.julian.aprendendokotlindozero

class Carro2(
    var modelo: String = "",
    var velocidade: Int = 0
) {

    companion object {
        const val VELOCIDADE_MAX_PERMITIDA = 120
        fun exibirMensagemVelocidadeMaxima(){
            println("A velocidade máxima é: $VELOCIDADE_MAX_PERMITIDA")
        }
    }

    fun exibirInformacoes(){
        println("Informações: $modelo e $velocidade")
    }

}

class Usuario2 {

    companion object{
        fun verificarUsuarioLogado(): Boolean {
            //Verificação
            return true
        }
    }

}

fun main() {

    val retorno = Usuario2.verificarUsuarioLogado()
    println("usuario logado: $retorno")



    //Criando uma instância ou objeto
    println("Velocidade máxima: ${Carro2.VELOCIDADE_MAX_PERMITIDA}")
    Carro2.exibirMensagemVelocidadeMaxima()

    val fusca = Carro2("Fusca", 100)
    fusca.exibirInformacoes()


    val ferrari = Carro2("Ferrari", 200)
    ferrari.exibirInformacoes()

    println("PI: ${Math.PI}")

}