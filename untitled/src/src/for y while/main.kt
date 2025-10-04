package src.`for y while`

fun main() {
    val n = 5

    println("--- Usando ciclo for ---")
    var sumaFor = 0
    for (i in 1..n) {
        sumaFor += i
    }
    println("La suma es $sumaFor")

    println()

    println("--- Usando ciclo while ---")
    var sumaWhile = 0
    var i = 1
    while (i <= n) {
        sumaWhile += i
        i++
    }
    println("La suma es $sumaWhile")
}