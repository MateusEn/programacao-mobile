// Exercício 4 - Integrantes: Danilo Augusto Plusek e Mateus Enrico Codognotto


class Baralho {
    private val naipes = listOf("♠️", "♥️", "♦️", "♣️")
    private val valores = listOf("A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K")
    private val cartas = mutableListOf<Carta>()

//     Adicionando cartas ao baralho
    init {
        for (naipe in naipes) {
            for (valor in valores) {
                cartas.add(Carta(naipe, valor))
            }
        }
    }

//    Função para embaralhar o baralho
    fun embaralhar() {
        cartas.shuffle()
    }
//    Função para distribuir cartas ao jogador
    fun distribuir(): List<Carta> {
        return cartas.take(5)
    }
}