fun main() {

    val e1 = DataEndereco("rua 1", "cidade 1")
    val e2 = DataEndereco("rua 1", "cidade 1")
    val e3 = e1.copy()


    println(e1.rua)
    println(e1.hashCode())
    println(e1.equals(e2))


}

fun endereco(endereco: Endereco){}

class Endereco(val rua: String, val cidade: String){
    override fun toString():String{
        return "Endereco: rua: ${this.rua} - cidade: ${this.cidade} "
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }

    override fun equals(other: Any?):Boolean{
        return (other is Endereco) && (this.rua == other.rua && this.cidade == other.cidade)
    }
}
data class DataEndereco(val rua: String, val cidade: String)