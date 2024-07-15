package devandroid.julian.aprendendokotlindozero

open class Animal {//Classe pai, super classe
    var cor = ""
    var tamanho = ""//Pequeno, médio e grande porte
    var peso = 0.0

    open fun correr(){// Método em linha
        println("Correr como um ")
        /*
        *
        *
        * */
    }
    fun dormir(){// Método em linha
        println("Dormir")
    }
}

class Cao : Animal() {//Subclasse ou classe filha
fun latir() = println("Latir")
    override fun correr(){
        super.correr()
        println("cão de 4 patas")
        /*
        * várias linhas de código
        * */
    }
}

class Passaro : Animal() {
    fun voar() = println("Voar")
    override fun correr(){
        super.correr()
        println("pássaro de 2 perninhas")
    }
}


fun main() {

    val cao = Cao()
    cao.correr()
    //cao.latir()

    val passaro = Passaro()
    passaro.correr()
    //passaro.voar()

}