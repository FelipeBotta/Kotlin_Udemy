class GetterAndSetter {

    private var nome: String = ""
        get() {
            println("")
            return field
        }
        set(value) {
            println("")
            field = value
        }

    fun abc(){
        println(nome)
    }
}

fun main() {
    //GetterAndSetter().nome
}