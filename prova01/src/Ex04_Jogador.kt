// Exercício 4 - Integrantes: Danilo Augusto Plusek e Mateus Enrico Codognotto

class Jogador(val nome: String) {
    fun verificarCombinacoes(cartas: List<Carta>) {
        val valores = cartas.groupBy { it.valor }

        // Verificar pares
        val pares = valores.filterValues { it.size == 2 }
        if (pares.isNotEmpty()) {
            println("Pares encontrados:")
            pares.keys.forEach { valor ->
                val cartasDoPar = cartas.filter { it.valor == valor }
                println("${cartasDoPar.joinToString(" + ") { "${it.naipe}${it.valor}" }}")
            }
        } else {
            println("Nenhum par encontrado.")
        }

        // Verificar trincas
        val trincas = valores.filterValues { it.size == 3 }
        if (trincas.isNotEmpty()) {
            println("Trincas encontradas:")
            trincas.keys.forEach { valor ->
                val cartasDaTrinca = cartas.filter { it.valor == valor }
                println("${cartasDaTrinca.joinToString(" + ") { "${it.naipe}${it.valor}" }}")
            }
        } else {
            println("Nenhuma trinca encontrada.")
        }

        // Verificar full house
        if (pares.isNotEmpty() && trincas.isNotEmpty()) {
            println("Full house encontrado!")
            val cartasDoFullHouse = cartas.filter { it.valor in pares.keys + trincas.keys }
            println("${cartasDoFullHouse.joinToString(" + ") { "${it.naipe}${it.valor}" }}")
        } else {
            println("Nenhum full house encontrado.")
        }

        // Verificar flush
        val naipes = cartas.map { it.naipe }.toSet()
        if (naipes.size == 1) {
            println("Flush encontrado!")
            println(cartas.joinToString(" + ") { "${it.naipe}${it.valor}" })
        } else {
            println("Nenhum flush encontrado.")
        }
    }
}

// Exemplo de uso:
fun main() {
    val cartas = listOf(
        Carta("♠️", "A"),
        Carta("♠️", "A"),
        Carta("♠️", "A"),
        Carta("♣️", "3"),
        Carta("♥️", "3")
    )

    val jogador = Jogador("Alice")
    jogador.verificarCombinacoes(cartas)
}
//Combinações possíveis:

//Par
/*
Carta("♠️", "A"),
Carta("♠️", "A"),
Carta("♦️", "2"),
Carta("♣️", "3"),
Carta("♥️", "4")
*/

//Trinca
/*
Carta("♠️", "A"),
Carta("♠️", "A"),
Carta("♠️", "A"),
Carta("♣️", "3"),
Carta("♥️", "4")
*/

//Fullhouse
/*
Carta("♠️", "A"),
Carta("♠️", "A"),
Carta("♠️", "A"),
Carta("♣️", "3"),
Carta("♥️", "3")
*/

//Flush
/*
Carta("♠️", "A"),
Carta("♠️", "A"),
Carta("♠️", "A"),
Carta("♠️", "A"),
Carta("♠️", "A")
*/