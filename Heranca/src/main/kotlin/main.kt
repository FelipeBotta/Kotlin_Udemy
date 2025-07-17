import sealed.Result
import java.util.InputMismatchException

fun main() {
    val microfone = Microfone("Guelri",500F)
    val computado = Computador("Lenovo", 5000F, "Cinza").instalarSoftware()

    Result

}

// override e overload
// sobrescrita e sobrecarga

class Computador(marca:String, preco:Float, var cor:String) : Eletronico(marca,preco) {

    override fun ligar() {
        super.ligar()
        println("Carregar o sistema operacional")
    }

    fun instalarSoftware(){
        super.ligar()
        println("Instalando...")
        println("Instalado.")
        super.desligar()
    }

}

class Microfone(marca:String, preco: Float) :Eletronico (marca,preco) {
    fun gravar(){}
}

open class Eletronico(var marca: String, var preco:Float){

    private var correnteEletrica = false
    open fun ligar(){
        correnteEletrica = true
    }
    fun desligar(){
        correnteEletrica = false
    }

}
// assinatura
fun abc(){}
fun abc(str: String){}
fun abc(str: Int){}