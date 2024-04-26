/*
    Ex04 - Crie uma classe Carta que represente uma carta de baralho com atributos como naipe e valor. Crie
    uma classe Baralhoque represente um baralho de cartas completo. Implemente métodos para
    embaralhar o baralho, distribuir cartas. Entregue 5 cartas para um Jogador que vai verificar se as
    cartas possuem combinações vencedoras.

    Equipe: Danilo Augusto Plusek e Mateus Enrico Codognotto
*/

fun main() {
    // Cria dois baralhos e os embaralha
    val baralho = Baralho()
    baralho.embaralhar()
    val baralho2 = Baralho()
    baralho2.embaralhar()

    // Cria dois jogadores, um chamado "Chauã", outro chamado "Danilo"
    // e distribui 5 cartas para eles
    val jogador = Jogador("Chauã")
    val cartasDoJogador = baralho.distribuir()
    val jogador2 = Jogador("Danilo")
    val cartasDoJogador2 = baralho2.distribuir()

    // Imprime as cartas do jogadores
    println("Cartas do jogador(a) ${jogador.nome}:")
    cartasDoJogador.forEach { println(it) }
    println("Cartas do jogador(a) ${jogador2.nome}:")
    cartasDoJogador2.forEach { println(it) }

    // Verifica as combinações de cartas do jogadores
    println("\nVerificação das cartas do jogador(a) ${jogador.nome}:")
    jogador.verificarCombinacoes(cartasDoJogador)
    println("\nVerificação das cartas do jogador(a) ${jogador2.nome}:")
    jogador.verificarCombinacoes(cartasDoJogador2)
}