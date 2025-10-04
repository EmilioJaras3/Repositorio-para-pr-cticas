package miligramo

fun main() {
    println("Introduce la cantidad en miligramos para la poción multijugos:")

    val miligramos = readLine()?.toIntOrNull()

    if (miligramos != null) {
        if (miligramos > 100) {
            println("¡Felicidades, es una buena poción multijugos!")
        } else {
            println("La poción es mediocre, sangre sucia inmunda.")
        }
    } else {
        println("Entrada no válida. Por favor, introduce un número entero.")
    }
}