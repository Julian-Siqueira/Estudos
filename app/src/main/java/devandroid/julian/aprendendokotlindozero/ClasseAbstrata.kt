package devandroid.julian.aprendendokotlindozero

abstract class Animal1 {//Classe pai, super classe, Abstrata
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
    abstract fun dormir()
}

class Cao1 : Animal1() {//Subclasse ou classe filha, Concreta
fun latir() = println("Latir")
    override fun correr(){
        super.correr()
        println("cão de 4 patas")
        /*
        * várias linhas de código
        * */
    }

    override fun dormir() {
        println("Dormir como um cão")
    }
}

class Passaro1 : Animal1() {
    fun voar() = println("Voar")
    override fun correr(){
        super.correr()
        println("pássaro de 2 perninhas")
    }
    override fun dormir() {
        println("Dormir como um pássaro")
    }
}

fun main() {

    val cao = Cao1()
    cao.correr()
    cao.dormir()
    //cao.latir()
    /*
    val passaro = Passaro()
    passaro.correr()
    //passaro.voar()*/


}