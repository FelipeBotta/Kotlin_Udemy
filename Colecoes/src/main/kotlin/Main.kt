fun main() {

    // imutavel
    val list1 = listOf("ssd", 1, 2, 3, 4, 5, 6, 7, 8)
    val list2 = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8)

    // mutavel
    var list3 = mutableListOf<Int>(1, 2, 3, 4, 5)

    println(list3.contains(2))
    println(list3.size)
    list3.add(0, 100)
    println(list3)

    println(list3.removeFirst())
    println(list3)


}