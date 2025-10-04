package src.raices

import kotlin.math.sqrt

class Raices(val a: Double, val b: Double, val c: Double) {

    fun getDiscriminante(): Double {
        return (b * b) - (4 * a * c)
    }

    fun tieneRaices(): Boolean {
        return getDiscriminante() >= 0
    }

    fun tieneRaiz(): Boolean {
        return getDiscriminante() == 0.0
    }

    fun obtenerRaices() {
        if (tieneRaices()) {
            val discriminante = getDiscriminante()
            val solucion1 = (-b + sqrt(discriminante)) / (2 * a)
            val solucion2 = (-b - sqrt(discriminante)) / (2 * a)
            println("Solución 1: $solucion1")
            println("Solución 2: $solucion2")
        }
    }

    fun obtenerRaiz() {
        if (tieneRaiz()) {
            val solucion = -b / (2 * a)
            println("Única solución: $solucion")
        }
    }

    fun calcular() {
        if (tieneRaiz()) {
            obtenerRaiz()
        } else if (tieneRaices()) {
            obtenerRaices()
        } else {
            println("La ecuación no tiene soluciones reales.")
        }
    }
}

fun main() {
    println("--- Caso 1: Dos soluciones (1x^2 - 5x + 6) ---")
    val ecuacion1 = Raices(1.0, -5.0, 6.0)
    ecuacion1.calcular()

    println("\n--- Caso 2: Una solución (1x^2 - 4x + 4) ---")
    val ecuacion2 = Raices(1.0, -4.0, 4.0)
    ecuacion2.calcular()

    println("\n--- Caso 3: Sin soluciones reales (5x^2 + 2x + 1) ---")
    val ecuacion3 = Raices(5.0, 2.0, 1.0)
    ecuacion3.calcular()
}