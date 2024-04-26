/*
    Ex03 - Crie uma classe abstrata Animal com atributos como nome, idade e som. Crie classes derivadas de
    Animal para representar diferentes tipos de animais, como cachorro, gato e pássaro. Implemente
    métodos específicos para cada tipo de animal, como latir, miar e cantar. Utilize herança e
    polimorfismo para criar uma lista de animais e exibir informações sobre cada um deles.

    Equipe: Danilo Augusto Plusek e Mateus Enrico Codognotto
*/

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