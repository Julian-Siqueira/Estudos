package devandroid.julian.aprendendokotlindozero

class Pessoa(nome: String, idade: Int){

    init {
        println("nome: $nome idade: $idade")
        println("Init Executado...")
    }

    constructor(nome:String): this(nome, idade=0){
        println("Construtor Secundario")
    }



}

fun main() {

    val julian = Pessoa("Julian")

}