// Exercício 3 - Integrantes: Danilo Augusto Plusek e Mateus Enrico Codognotto

// Importa a classe Animal
import kotlin.random.Random

// Definição da classe Passaro, que herda de Animal
class Passaro(nome: String, idade: Int) : Animal(nome, idade, "canto", num_patas = 2) {
    // Implementação do método fazerSom para Passaro
    override fun fazerSom() {
        println("O pássaro $nome tem um lindo $som!")
    }

    // Método específico para Passaro
    fun voar() {
        println("$nome está voando.")
    }
}