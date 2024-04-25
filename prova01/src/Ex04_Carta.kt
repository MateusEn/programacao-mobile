// Exercício 4 - Integrantes: Danilo Augusto Plusek e Mateus Enrico Codognotto

class Carta(val naipe: String, val valor: String) {
    override fun toString(): String {
        return "$valor$naipe"
    }
}