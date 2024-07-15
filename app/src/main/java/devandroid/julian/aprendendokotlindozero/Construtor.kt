package devandroid.julian.aprendendokotlindozero

//Construtor primário
class Usuario1 (
     nome: String = "",
     sobrenome: String = ""
) {

    /*var nome: String = ""
    var sobrenome: String = ""*/

    init {//Iniciliazar
        /*this.nome = nome
        this.sobrenome = sobrenome*/
        println("Objeto inicializado")
        println("nome: $nome sobrenome: $sobrenome")
    }

    //Construtor secundário
    constructor(nome: String): this(nome, "") {
        println("Construtor secundário")
    }

}

fun main() {

    val usuario = Usuario1("Julian", "Siqueira")
    //usuario.nome = "Jamilton"

}