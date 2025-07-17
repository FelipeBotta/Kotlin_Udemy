class Matematica {
    var id: Int = 10
    val PI = 3.1415

    companion object{
        val PI = 3.1415

        fun abc(){
            println("Sou a classe Matemática")
        }

        init {
            println("Fui chamado !")
        }
    }

    object OBJ1 {

        fun abc(){

        }

        init {
            println("Fui chamado ! OBJ1")
        }
    }
}

fun main() {

    println(Matematica.PI)
    println(Matematica.PI)
    println(Matematica.PI)
    println(Matematica.PI)

    Matematica.OBJ1.abc()

}

// object é global, instanciado apenas chamando o nome dele
// companion é dentro da classe, sendo instanciado pelo nome da classe . sua funcionalidade
// ou dado que queira ser chamado de dentro do companion