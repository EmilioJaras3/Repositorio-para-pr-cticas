package src.uber

fun main() {
    while (true) {
        println("--- Verificador de viaje Uber ---")
        println("Introduce la distancia del conductor en kilómetros (ej. 0.4):")
        val distancia = readLine()?.toDoubleOrNull()

        println("¿El conductor está disponible? (escribe 'true' o 'false'):")
        val disponible = readLine()?.toBooleanStrictOrNull()

        if (distancia == null || disponible == null) {
            println("\nError: Datos no válidos. Inténtalo de nuevo.\n")
            continue
        }

        if (distancia <= 0.5 && disponible) {
            println("\nListo para iniciar recorrido!")
            break
        } else if (distancia <= 0.5 && !disponible) {
            println("\nConductor cercano, pero no disponible. Esperando...")
        } else if (distancia > 0.5 && disponible) {
            println("\nConductor disponible pero muy lejos, aplicarán tarifas más altas.")
        } else {
            println("\nNo hay conductores disponibles.")
        }

        println("Buscando de nuevo...\n")
    }
}