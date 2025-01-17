fun main() {
    val persona1 = Persona(66.4, 1.73)
    val persona2 = Persona("Fran", 75.0, 1.80)
    val persona3 = Persona("Paco", 72.2, 1.71)

    println(persona1)
    println(persona2)
    println(persona3)

    println("\nPERSONA 1\n")

    var nombreCorrecto = false
    while (!nombreCorrecto) {
        print("Introduce el nombre de la persona 1: ")
        val nombre = readln()
        if (nombre != null && nombre != "") {
            persona1.nombre = nombre
            nombreCorrecto = true
        }
        else {
            println("ERROR: El nombre no puede estar vacío.")
        }
    }
    println("Persona: ${persona1.nombre}, Peso: ${ persona1.peso } kg, Altura: ${"%.2f".format (persona1.altura)} metros.")

    println("\nPERSONA 3\n")
    println("Peso: ${persona3.peso} kg, Altura: ${persona3.altura}, IMC: ${"%.2f".format(persona3.calcularIMC())}.")
    var alturaCorrecta = false
    while (!alturaCorrecta) {
        print("Introduce la nueva altura de la persona 3: ")
        try {
            val nuevaAltura = readln().toDouble()
            persona3.altura = nuevaAltura
            alturaCorrecta = true
        } catch (e: IllegalArgumentException) {
            println("ERROR: FORMATO NO VÁLIDO.")
        }
    }
    println("Peso: ${persona3.peso} kg, Altura: ${persona3.altura}, IMC: ${"%.2f".format(persona3.calcularIMC())}.")

    println("\nPERSONA 2\n")
    persona2.altura = persona3.altura
    println(persona2)
    println(persona3)

    if (persona2.equals(persona3)) {
        println("Las personas 2 y 3 son iguales")
    }else{
        println("Las personas 2 y 3 NO son iguales")
    }
}