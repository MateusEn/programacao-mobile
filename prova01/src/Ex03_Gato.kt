// Exercício 3 - Integrantes: Danilo Augusto Plusek e Mateus Enrico Codognotto

// Importa a classe Animal
import kotlin.random.Random

// Definição da classe Gato, que herda de Animal
class Gato(nome: String, idade: Int) : Animal(nome, idade, "miado", num_patas = 4) {
    // Implementação do método fazerSom para Gato
    override fun fazerSom() {
        println("O gato $nome deu um $som!")
    }

    // Método específico para Gato
    fun afiarUnhas() {
        println("$nome está afiando as unhas.")
    }
}