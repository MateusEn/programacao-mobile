/*
    Ex05 - Crie uma classe Tarefa que represente uma tarefa a ser realizada com atributos como título,
    descrição, data de vencimento e prioridade. Crie uma classe GerenciadorDeTarefas que gerencie
    uma lista de tarefas. Implemente métodos para adicionar, remover, buscar, marcar como concluída e
    listar tarefas por data de vencimento.

    Equipe: Danilo Augusto Plusek e Mateus Enrico Codognotto
*/

fun main() {
    val gerenciador = GerenciadorDeTarefas()
// Enquanto funcionando, mostra todas as opções possíveis do que fazer
    while (true) {
        println("\nEscolha uma opção:")
        println("1- Adicionar tarefa")
        println("2- Buscar tarefa")
        println("3- Marcar tarefa como concluída")
        println("4- Listar tarefas por data de vencimento")
        println("5- Remover tarefa")
        println("6- Sair")

        val opcao = readLine()?.toIntOrNull() ?: 0
// O que será executado baseado na escolha anterior
        when (opcao) {
            1 -> {
                println("Adicionar tarefa:")
                gerenciador.adicionarTarefa()
            }
            2 -> {
                println("Buscar tarefa:")
                gerenciador.buscarTarefa()
            }
            3 -> {
                println("Marcar tarefa como concluída:")
                gerenciador.marcarConcluidaTarefa()
            }
            4 -> {
                println("Listar tarefas por data de vencimento:")
                gerenciador.listTarefaVencimento()
            }
            5 -> {
                println("Remover tarefa:")
                gerenciador.removerTarefa()
            }
            6 -> {
                println("Saindo do programa.")
                break
            }
            else -> println("Opção inválida. Tente novamente.")
        }
    }
}