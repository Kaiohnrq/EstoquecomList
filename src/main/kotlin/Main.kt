fun main() {
    //Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
    //trabalhar com Collection do tipo List do Kotlin para manipular os dados desse estoque, o
    //programa deverá atender as seguintes funcionalidades:
    //
    //Armazenar dados da List
    //Remover dados da list;
    //Atualizar dados da list.
    //Apresentar todos os dados da list.
    while (true) {
        println("1 - Adicionar item ao estoque: ")
        println("2 - Remover item do estoque: ")
        println("3 - Atualizar item no estoque: ")
        println("4 - Mostrar itens no estoque: ")
        println("5 - Sair: ")
        println()
        println("Opção: ")

        when (readln().toInt()) {
            1 -> {
                println("Digite um produto para adicionar")
                val produto = readln()
                addItem(produto)
            }
            2 -> removeItem()
            3 -> alteraItem()
            4 -> exibeItem()
            5 -> break
            else -> println("Opção selecionada inválida! \n")

        }
    }
}
