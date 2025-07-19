// a diferença entre a interface e o abstract é que dentro da interface não pode
// armazenar estado (valor, por exemplo pode ter uma string mas ela não pode conter valor)
// já na abstract é possivel colocar uma string = "" sem problemas
interface Selvagem {
    fun atacar()
}


abstract class Mamifero(var nome: String){
    abstract fun falar()

    fun acordar(){
        println("Acordei")
    }
     fun dormir(){
         println("Dormi...")
     }
}

class Cachorro(nome:String):Mamifero(nome), Selvagem{
    override fun falar(){
        println("Au Au")
    }
    override fun atacar(){
        println("${nome} ataca o animal que se aproximou")
    }

}
class Gato(nome:String):Mamifero(nome){
    override fun falar() {
        println("Miau")
    }
}



fun main() {

    val c: Cachorro = Cachorro("Flora")
    val g: Gato = Gato("Cat")

    c.acordar()
    c.falar()
    c.atacar()
    c.dormir()

    g.acordar()
    g.falar()
    g.dormir()

}
