// Exercício 4 - Integrantes: Danilo Augusto Plusek e Mateus Enrico Codognotto

fun main() {
    val baralho = Baralho()
    baralho.embaralhar()

    val jogador = Jogador("Alice")
    val cartasDoJogador = baralho.distribuir()

    println("Cartas do jogador(a) ${jogador.nome}:")
    cartasDoJogador.forEach { println(it) }

    jogador.verificarCombinacoes(cartasDoJogador)
}