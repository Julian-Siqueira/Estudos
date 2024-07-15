package devandroid.julian.aprendendokotlindozero

fun main() {
    /*
    var nomes = arrayOf(
        "Jamilton", "Ana"
    )
    nomes[0] = "mudou"

    println( nomes[0] )

     */

    /*var numero = 1
    while ( numero <= 5 ){
        println( "Executou: $numero" )
        numero++
    }*/

    /*
    for ( numero in 3..10 ){
        println( "Executou: $numero" )
    }
    */

    val postagens = arrayOf(
        "Viagem para a praia",//0
        "Levei meu cachorro no veterinário",//1
        "Trilha com os amigos"//2
    )

    for ( (indice, postagem) in postagens.withIndex() ){
        println("$indice: $postagem")
    }
}