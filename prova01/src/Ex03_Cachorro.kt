// Exercício 3 - Integrantes: Danilo Augusto Plusek e Mateus Enrico Codognotto

// Importa a classe Animal
import kotlin.random.Random

// Definição da classe Cachorro, que herda de Animal
class Cachorro(nome: String, idade: Int) : Animal(nome, idade, "latido", num_patas = 4) {
    // Implementação do método fazerSom para Cachorro
    override fun fazerSom() {
        println("O cachorro $nome deu um $som!")
    }

    // Método específico para Cachorro
    fun abanarRabo() {
        println("$nome está abanando o rabo.")
    }
}