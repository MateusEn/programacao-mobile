/*
    Ex04 - Crie uma classe Carta que represente uma carta de baralho com atributos como naipe e valor. Crie
    uma classe Baralhoque represente um baralho de cartas completo. Implemente métodos para
    embaralhar o baralho, distribuir cartas. Entregue 5 cartas para um Jogador que vai verificar se as
    cartas possuem combinações vencedoras.

    Equipe: Danilo Augusto Plusek e Mateus Enrico Codognotto
*/

// Classe do jogador, contém a função de verificar combinações
class Jogador(val nome: String) {
    // Função para verificar combinações
    fun verificarCombinacoes(cartas: List<Carta>) {
        val valores = cartas.groupBy { it.valor }

        // Verifica se tem pares
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

        // Verifica se tem trincas
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

        // Verifica se tem full house
        if (pares.isNotEmpty() && trincas.isNotEmpty()) {
            println("Full house encontrado!")
            val cartasDoFullHouse = cartas.filter { it.valor in pares.keys + trincas.keys }
            println("${cartasDoFullHouse.joinToString(" + ") { "${it.naipe}${it.valor}" }}")
        } else {
            println("Nenhum full house encontrado.")
        }

        // Verifica se tem flush
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

    val jogador = Jogador("Chauã")
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