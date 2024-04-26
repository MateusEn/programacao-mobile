/*
    Ex05 - Crie uma classe Tarefa que represente uma tarefa a ser realizada com atributos como título,
    descrição, data de vencimento e prioridade. Crie uma classe GerenciadorDeTarefas que gerencie
    uma lista de tarefas. Implemente métodos para adicionar, remover, buscar, marcar como concluída e
    listar tarefas por data de vencimento.

    Equipe: Danilo Augusto Plusek e Mateus Enrico Codognotto
*/

class GerenciadorDeTarefas {
    private val listaTarefas = mutableListOf<Tarefa>()
    // Função para adicionar tarefas
    fun adicionarTarefa() {
        // Entrada dos dados para criação da tarefa
        println("Digite o título da tarefa:")
        val titulo = readLine() ?: ""

        println("Digite a descrição da tarefa:")
        val descricao = readLine() ?: ""

        println("Digite a data de vencimento (formato: dd-mm-yyyy):")
        val dataVencimento = readLine() ?: ""

        println("Digite a prioridade (BAIXA, MEDIA ou ALTA):")
        val prioridadeStr = readLine() ?: ""
        val prioridade = try {
            Prioridade.valueOf(prioridadeStr.toUpperCase())
        } catch (e: IllegalArgumentException) {
            Prioridade.BAIXA
        }// Aqui, caso a entrada seja inválida, será definido automaticamente a prioridade baixa para a tarefa

        // Vai pegar as informções enviadas pelo usuário e criar a tarefa com tais informações, adicionando
        // ela na lista de tarefas
        val tarefa = Tarefa(titulo, descricao, dataVencimento, prioridade)
        listaTarefas.add(tarefa)
        println("Tarefa adicionada com sucesso!")
    }
    // Função para remover tarefas
    fun removerTarefa() {
        println("Digite o título da tarefa que deseja remover:")
        val titulo = readLine() ?: ""

        val tarefaRemovida = listaTarefas.find { it.titulo == titulo }
        if (tarefaRemovida != null) {
            listaTarefas.remove(tarefaRemovida)
            println("Tarefa '${tarefaRemovida.titulo}' foi removida!")
        } else {
            println("Tarefa não encontrada.")
        }
    }
    // Função para buscar uma tarefa existente
    fun buscarTarefa() {
        println("Digite o título da tarefa que deseja buscar:")
        val titulo = readLine() ?: ""

        val tarefaEncontrada = listaTarefas.find { it.titulo == titulo }
        if (tarefaEncontrada != null) {
            println("Tarefa encontrada:")
            println("Título: ${tarefaEncontrada.titulo}")
            println("Descrição: ${tarefaEncontrada.descricao}")
            println("Data de vencimento: ${tarefaEncontrada.dataVencimento}")
            println("Prioridade: ${tarefaEncontrada.prioridade}")
        } else {
            println("Tarefa não encontrada.")
        }
    }
    // Função para marcar uma tarefa como concluida
    fun marcarConcluidaTarefa() {
        println("Digite o título da tarefa que deseja marcar como concluída:")
        val titulo = readLine() ?: ""

        val tarefa = listaTarefas.find { it.titulo == titulo }
        if (tarefa != null) {
            tarefa.concluida = true
            println("Tarefa '${tarefa.titulo}' marcada como concluída.")
        } else {
            println("Tarefa não encontrada.")
        }
    }
    // Função para ordenar tarefas por data de vencimento
    fun listTarefaVencimento() {
        val tarefasOrdenadas = listaTarefas.sortedBy { it.dataVencimento }
        if (tarefasOrdenadas.isNotEmpty()) {
            println("Tarefas ordenadas por data de vencimento:")
            tarefasOrdenadas.forEach { tarefa ->
                println("${tarefa.titulo} - ${tarefa.dataVencimento}")
            }
        } else {
            println("Nenhuma tarefa encontrada.")
        }
    }
}