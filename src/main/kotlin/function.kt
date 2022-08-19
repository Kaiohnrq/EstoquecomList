val itens = mutableListOf<String>("Playstation 4", "Playstation 5")

fun addItem(produto: String){
    if(produto != ""){
        itens.add(produto)
        println("Produto $produto adicionado com sucesso!")
        println()
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

