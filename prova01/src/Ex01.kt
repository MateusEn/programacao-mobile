// Exercício 1 - Integrantes: Danilo Augusto Plusek e Mateus Enrico Codognotto
abstract class Ex01 {
    public abstract var entrada: Int
}

fun main() {
    println("Seja bem vindo ao Datanaitor 3000! O melhor aplicativo para selecionar meses!")
    print("Digite um número inteiro de 1 a 12: ")
    val entrada = readlnOrNull()?.toIntOrNull()
//    Entrada de dados.
    when (entrada) {
        1 -> print("Mês equivalente: Janeiro")
        2 -> print("Mês equivalente: Fevereiro")
        3 -> print("Mês equivalente: Março")
        4 -> print("Mês equivalente: Abril")
        5 -> print("Mês equivalente: Maio")
        6 -> print("Mês equivalente: Junho")
        7 -> print("Mês equivalente: Julho")
        8 -> print("Mês equivalente: Agosto")
        9 -> print("Mês equivalente: Setembro")
        10 -> print("Mês equivalente: Outubro")
        11 -> print("Mês equivalente: Novembro")
        12 -> print("Mês equivalente: Dezembro")
//        Mensagens para cada número digitado.
        null -> print("Campo Vazio!")
//        Mensagem bônus caso campo não seja preenchido.
        else -> {
            print("Entrada invalida! :(")
        }
    }
}