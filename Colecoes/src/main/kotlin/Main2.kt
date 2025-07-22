fun main() {

    val dados = listaDeDados()

    // any, count, filter, first e last
    // any verifica se a lista possui algum elemento
    // count retorna a quantidade de itens dentro da lista
    // filter cria um retorno através de um escopo de função (utilizar it. para abrir
    // as opções para utilizar o filtro

    println(dados.filter { it.calorias > 500 })
    println(dados.any { it.calorias > 500 })
    println(dados.count { it.calorias > 500 })

    dados.first() // corre o risco de quebrar se a lista estiver vazia
    dados.firstOrNull() // evita que quebre o código caso esteja nulo
    dados.first { it.calorias > 500 } // utlizando o escopo de função

    dados.last() // corre o risco de quebrar se a lista estiver vazia
    dados.lastOrNull() // evita que quebre o código caso esteja nulo
    dados.last { it.calorias > 500 } // utlizando o escopo de função

    // sum, sumOf
    listOf(1,2,3).sum()
    dados.sumOf { it.calorias }

    val abc = dados.filter { it.calorias > 500 }.sumOf { it.calorias }

    // max, min deprecated (depreciado, existe alguma funcionalidade que a substitui)
    listOf(1,2,3).max()
    listOf(1,2,3).min()

    // a funcinalidade que substitui o max e min
    listOf(1,2,3).maxOrNull() 
    listOf(1,2,3).minOrNull()

    dados.maxOf { it.calorias } // vai retornar a maior caloria
    dados.minOf { it.calorias }

    dados.maxByOrNull { it.calorias } // vai retornar toda a receita

}

data class Receita(val nome: String, val calorias:Int, val ingredientes: List<Ingrediente> = listOf())
data class Ingrediente(val nome: String, val quantidade: Int)

/**
 * Retorna lista de dados
 * */
private fun listaDeDados(): List<Receita> {
    return listOf(
        Receita(
            "Lasanha", 1200,
            listOf(
                Ingrediente("Presunto", 5),
                Ingrediente("Queijo", 10),
                Ingrediente("Molho de tomate", 2),
                Ingrediente("Manjerição", 3)
            )
        ),
        Receita("Panqueca", 500),
        Receita("Omelete", 200),
        Receita("Parmegiana", 700),
        Receita("Sopa de feijão", 300),
        Receita(
            "Hamburguer", 2000,
            listOf(
                Ingrediente("Pão", 1),
                Ingrediente("Hamburguer", 3),
                Ingrediente("Queijo", 1),
                Ingrediente("Catupiry", 1),
                Ingrediente("Bacon", 3),
                Ingrediente("Alface", 1),
                Ingrediente("Tomate", 1)
            )
        )
    )
}