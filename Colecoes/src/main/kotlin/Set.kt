fun main() {

    // Set (não permite valor duplicado)

    val set1 = setOf<Int>(10, 20, 20, 30)
    val set2 = mutableSetOf<Int>(10, 20, 20, 30)


    println(set2)

    println(set2.size)
    println(set2.add(100))
    println(set2.contains(10))

    (set2)
    set2.clear()
    println(set2)



}