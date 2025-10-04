package src.`ejercicio suiper sayayin`

fun main() {
    val N = 6

    if (N <= 0) {
        println("Inserta un número positivo")
    } else {
        println("Con ciclo for:")
        val numerosParesFor = mutableListOf<String>()
        for (i in 1..N) {
            if (i % 2 == 0) {
                numerosParesFor.add(i.toString())
            }
        }
        println(numerosParesFor.joinToString(", "))

        println()

        println("Con ciclo while:")
        val numerosParesWhile = mutableListOf<String>()
        var i = 1
        while (i <= N) {
            if (i % 2 == 0) {
                numerosParesWhile.add(i.toString())
            }
            i++
        }
        println(numerosParesWhile.joinToString(", "))
    }
}