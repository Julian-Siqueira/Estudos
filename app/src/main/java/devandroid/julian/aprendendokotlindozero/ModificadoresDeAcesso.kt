package devandroid.julian.aprendendokotlindozero

open class Carro1 {// Pai

    //var modelo = ""

    protected open fun injetarCombusticel(){
        println("Injeção do combustível")
    }

    fun acelerar(pedal: String){
        injetarCombusticel()
        println("Acelerar o carro")
    }
}

class Gol : Carro1() {//Filha
override fun injetarCombusticel(){
    super.injetarCombusticel()
    println("Injetando combustivel gol")
}
    fun acelerar(){
        println("Acelerando Gol")
    }
}

class Ferrari : Carro1() {
    override fun injetarCombusticel() {
        println("Injetando combustivel ferrari")
    }

}

fun main() {

    val gol = Gol()
    gol.acelerar()

    val ferrari =  Ferrari()
    ferrari.acelerar("Pedal Acelerar")



    /*val carro = Carro()
    carro.acelerar()*/
    //carro.acelerar()

}