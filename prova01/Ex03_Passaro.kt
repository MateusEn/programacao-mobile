/*
    Ex03 - Crie uma classe abstrata Animal com atributos como nome, idade e som. Crie classes derivadas de
    Animal para representar diferentes tipos de animais, como cachorro, gato e pássaro. Implemente
    métodos específicos para cada tipo de animal, como latir, miar e cantar. Utilize herança e
    polimorfismo para criar uma lista de animais e exibir informações sobre cada um deles.

    Equipe: Danilo Augusto Plusek e Mateus Enrico Codognotto
*/

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