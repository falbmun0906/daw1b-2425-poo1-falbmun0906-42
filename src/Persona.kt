class Persona(var peso: Double, var altura: Double) {
    fun calcularIMC() : Double = peso * altura

    var nombre: String? = ""
    constructor(nombre: String, peso: Double, altura: Double) : this(peso, altura) {
        this.nombre = nombre
    }

    override fun toString(): String {
        return "Nombre: $nombre, Peso: $peso, Altura: $altura, IMC: ${"%.2f".format (calcularIMC())}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Persona) return false

        return this.nombre == other.nombre && this.peso == other.peso && this.altura == other.altura
    }
}