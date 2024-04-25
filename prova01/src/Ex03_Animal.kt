// Exercício 3 - Integrantes: Danilo Augusto Plusek e Mateus Enrico Codognotto

// Definição da classe abstrata Animal
abstract class Animal(val nome: String, val idade: Int, val som: String, val num_patas: Int) { //Função bônus: num_patas
    // Método abstrato que será implementado pelas subclasses
    abstract fun fazerSom()
}
