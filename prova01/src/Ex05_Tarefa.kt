// Exercício 5 - Integrantes: Danilo Augusto Plusek e Mateus Enrico Codognotto

data class Tarefa(
    val titulo: String,
    val descricao: String,
    val dataVencimento: String,
    val prioridade: Prioridade
)

enum class Prioridade {
    BAIXA, MEDIA, ALTA
}