fun main() {

    // Map
    // chave, valor


    val map1 = mapOf(Pair("chave","valor"),Pair("chave","valor"))
    val map2 = mutableMapOf(Pair("chave","valor"),Pair("chave","valor"))

    println(map1)

    map2["Brasil"] = "Brasilia"
    println(map2)

    map2.remove("Brasil")
    println(map2)

    println(map1.keys)
    println(map1.values)

    println(map1.containsKey("chave"))

    map2.clear()
    println(map2.size)

    val config = mapOf(
        "URL" to "www.google.com"
    )
}