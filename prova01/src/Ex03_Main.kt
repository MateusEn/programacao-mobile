// Exercício 3 - Integrantes: Danilo Augusto Plusek e Mateus Enrico Codognotto

// Importa as classes Animal, Cachorro, Gato e Passaro
import kotlin.random.Random

fun main() {
    // Cria uma lista de animais
    val animais = listOf(
        Cachorro("Rex", 5),
        Gato("Mimi", 3),
        Passaro("Piu", 2)
    )

    // Itera sobre a lista de animais e exibe informações sobre cada um
    for (animal in animais) {
        // Exibe informações gerais sobre o animal
        println("Nome: ${animal.nome}, Idade: ${animal.idade}, Som: ${animal.som}, Número de patas: ${animal.num_patas}")
        // Chama o método fazerSom do animal
        animal.fazerSom()
        // Verifica o tipo do animal e chama seus métodos respectivos
        when (animal) {
            is Cachorro -> animal.abanarRabo()
            is Gato -> animal.afiarUnhas()
            is Passaro -> animal.voar()
        }
        // Linha em branco
        println()
    }
}