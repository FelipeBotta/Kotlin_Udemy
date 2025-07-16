import java.lang.Exception

class Pessoa(var nome: String, val anoNascimento: Int) {

    var doc: String? = ""

    // Executado quando a classe é instanciada
    init {
        if (anoNascimento < 0){
            throw Exception("Ano de nascimento não pode ser negativo.")
        }
    }
    init {
        println("Classe criada.")
    }

    // construtor secundário permite incluir lógica ao construtor
    constructor(nome: String, anoNascimento: Int, doc: String) : this(nome, anoNascimento) {
        println("Construtor Secundário")
        if (doc == "") {
            throw Exception()
        }
        this.doc = doc
    }

    fun acordar() {}
    fun dormir() {}


}

fun main() {

    // class - (instanciada) - objeto

    val p: Pessoa = Pessoa("Luis", 1999,"dfsdfs")

    val p2:Pessoa = Pessoa("Junior",2002)

    // With para executar diversos metodos do objeto
    with(p2){
        acordar()
        dormir()
        doc
    }

    // Instanciando dentro do With (a instancia só existe dentro do With)
    with(Pessoa("Roberto",1985)){
        acordar()
        dormir()
        doc
    }


}