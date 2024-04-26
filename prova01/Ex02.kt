/*
    Ex02 - Escreva um programa que dado um inteiro positivo n, calcule e imprima o valor da seguinte soma:
    f(n) = (1/n) + (2 /n-1) + (3/n-2) + ... + (n/1)

    Equipe: Danilo Augusto Plusek e Mateus Enrico Codognotto
*/

abstract class Ex02 {
    // Variável para armazenar o número fornecido pelo usuário
    public abstract var n: Int
}

fun main() {
    // Inicializa a variável de soma
    var soma = 0.0

    // |Bônus| Loop para garantir que o usuário insira um número inteiro positivo válido
    while (true) {
        // Solicita ao usuário que insira um número inteiro positivo
        print("Digite um número inteiro positivo: ")
        // Lê a entrada do usuário e converte para um Int ou NULL
        val n = readLine()?.toIntOrNull()

        // Verifica se o valor fornecido pelo usuário é válido (não nulo e maior que zero)
        if (n != null && n > 0) {
            // Imprime a explicação do processo da série
            println("Para f($n) = ")

            // Loop para calcular e imprimir cada parte da soma
            for (i in 1 until n) {
                // Imprime a parte atual da soma
                print("$i/${n - i + 1} + ")
                // Calcula e adiciona o termo à soma
                soma += i.toDouble() / (n - i + 1)
            }

            // Última soma(sempre será o valor de n dividido por 1)
            println("$n/1")

            // Calcula e adiciona a última soma
            soma += n.toDouble()

            // Imprime o resultado da soma
            println("O valor da soma é: $soma")

            // Sai do loop, pois um número válido foi fornecido
            break
        } else {
            // Print para caso o usuário dê um valor inválido.
            println("Número inválido, insira um número inteiro positivo.")
        }
    }
}
