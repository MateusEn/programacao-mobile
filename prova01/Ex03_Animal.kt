/*
    Ex03 - Crie uma classe abstrata Animal com atributos como nome, idade e som. Crie classes derivadas de
    Animal para representar diferentes tipos de animais, como cachorro, gato e pássaro. Implemente
    métodos específicos para cada tipo de animal, como latir, miar e cantar. Utilize herança e
    polimorfismo para criar uma lista de animais e exibir informações sobre cada um deles.

    Equipe: Danilo Augusto Plusek e Mateus Enrico Codognotto
*/

// Definição da classe abstrata Animal
abstract class Animal(val nome: String, val idade: Int, val som: String, val num_patas: Int) { //Função bônus: num_patas
    // Método abstrato que será implementado pelas subclasses
    abstract fun fazerSom()
}
