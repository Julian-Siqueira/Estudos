package devandroid.julian.aprendendokotlindozero


fun somar( numero1: Int, numero2: Int = 0, numero3: Int = 0 ): Int{
    return numero1 + numero2 + numero3
}

fun main() {

    //somar(10, numero3 = 10)
    println(somar(10, 5, numero3 = 2))

}