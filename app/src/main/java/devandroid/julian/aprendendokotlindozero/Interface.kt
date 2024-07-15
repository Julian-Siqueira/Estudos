package devandroid.julian.aprendendokotlindozero

interface Presidenciavel {
    fun candidatarSe(cargo: String)
}

abstract class Pessoa1 {
    fun comer() = println("comer")
    //abstract fun candidatarSe()
}

class DesenvolvedorAndroid : Pessoa1(){
    fun programar() = println("programar")
}
class DesenvolvedorWeb : Pessoa1() {
    fun programar() = println("programar")
}
class Jornalista : Pessoa1(), Presidenciavel {
    fun escreverNoticia() = println("Escrever notícia")
    override fun candidatarSe(cargo: String) {
        println("Candidatar-se como $cargo")
    }
}
class FuncionarioPublico : Pessoa1(), Presidenciavel {
    override fun candidatarSe(cargo: String) {
        println("Candidatar-se como $cargo")
    }
}


fun main() {

    val desenvolvedorAndroid = DesenvolvedorAndroid()
    desenvolvedorAndroid.comer()

    println("--------")

    val jornalista = Jornalista()
    jornalista.comer()
    jornalista.candidatarSe("Presidente")

    val fPublico = FuncionarioPublico()
    fPublico.candidatarSe("Gerente")

}