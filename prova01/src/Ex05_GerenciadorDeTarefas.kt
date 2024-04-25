// Exercício 5 - Integrantes: Danilo Augusto Plusek e Mateus Enrico Codognotto

class GerenciadorDeTarefas {
    private val listaTarefas = mutableListOf<Tarefa>()

    fun adicionarTarefa() {
        println("Digite o título da tarefa:")
        val titulo = readLine() ?: ""

        println("Digite a descrição da tarefa:")
        val descricao = readLine() ?: ""

        println("Digite a data de vencimento (formato: yyyy-MM-dd):")
        val dataVencimento = readLine() ?: ""

        println("Digite a prioridade (BAIXA, MEDIA ou ALTA):")
        val prioridadeStr = readLine() ?: ""
        val prioridade = try {
            Prioridade.valueOf(prioridadeStr.toUpperCase())
        } catch (e: IllegalArgumentException) {
            Prioridade.BAIXA
        }

        val tarefa = Tarefa(titulo, descricao, dataVencimento, prioridade)
        listaTarefas.add(tarefa)
        println("Tarefa adicionada com sucesso!")
    }

    fun listarTarefasPorDataVencimento() {
        TODO("Not yet implemented")
    }

    // Implemente os outros métodos conforme necessário
}