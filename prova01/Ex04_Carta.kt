/*
    Ex04 - Crie uma classe Carta que represente uma carta de baralho com atributos como naipe e valor. Crie
    uma classe Baralhoque represente um baralho de cartas completo. Implemente métodos para
    embaralhar o baralho, distribuir cartas. Entregue 5 cartas para um Jogador que vai verificar se as
    cartas possuem combinações vencedoras.

    Equipe: Danilo Augusto Plusek e Mateus Enrico Codognotto
*/

// Classe da carta
class Carta(val naipe: String, val valor: String) {
    override fun toString(): String {
        return "$valor$naipe"
    }
}