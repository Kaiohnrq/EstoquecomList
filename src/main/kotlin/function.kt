val itens = mutableListOf<String>("Playstation 4", "Playstation 5")

fun addItem(){
    println("Digite o produto que deseja adicionar: ")
    val produto = readln()

    if(produto != ""){
        itens.add(produto)
        println("Produto $produto adicionado com sucesso!")
        println()
        println("Deseja adicionar outro produto?")
        println("1 - Sim!")
        println("2 - Não! Voltar ao menu")
        val resp = readln().toInt()

        if(resp == 1){
            addItem()
        } else if(resp == 2){
            exibeMenu()
        } else {
            println("Opção selecionada invalida!")
        }

    } else{
        println("Produto invalido!")
        println()
    }

}

fun removeItem(){
    while(true){
        println("Digite um produto para remover: ")
        val produto = readln()

        if(itens.contains(produto)){
            itens.remove(produto)
            println("Produto $produto removido!")
            break
        } else {
            println("Produto não existe! ")
        }
    }

}

fun alteraItem(){
    println("Digite um produto que deseja atualizar o nome: ")
    val produto = readln()

    if(itens.contains(produto)){
        val posicao = itens.indexOf(produto)
        println("Digite o novo nome do produto: ")
        itens[posicao] = readln()
    } else {
        println("Produto não existe")
    }

}

fun exibeItem(){
    println()
    println("Produtos em estoque: $itens")
    println()
}

fun exibeMenu(){
    while (true) {
        println("1 - Adicionar item ao estoque: ")
        println("2 - Remover item do estoque: ")
        println("3 - Atualizar item no estoque: ")
        println("4 - Mostrar itens no estoque: ")
        println("5 - Sair: ")
        println()
        println("Opção: ")

        when (readln().toInt()) {
            1 -> addItem()
            2 -> removeItem()
            3 -> alteraItem()
            4 -> exibeItem()
            5 -> break
            else -> println("Opção selecionada inválida! \n")

        }
    }
}

