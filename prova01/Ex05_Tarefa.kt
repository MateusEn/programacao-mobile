/*
    Ex05 - Crie uma classe Tarefa que represente uma tarefa a ser realizada com atributos como título,
    descrição, data de vencimento e prioridade. Crie uma classe GerenciadorDeTarefas que gerencie
    uma lista de tarefas. Implemente métodos para adicionar, remover, buscar, marcar como concluída e
    listar tarefas por data de vencimento.

    Equipe: Danilo Augusto Plusek e Mateus Enrico Codognotto
*/
// Definição da classe Tarefa
data class Tarefa(
    val titulo: String,
    val descricao: String,
    val dataVencimento: String,
    val prioridade: Prioridade
) {
    var concluida: Boolean = false
}

enum class Prioridade {
    BAIXA, MEDIA, ALTA
}