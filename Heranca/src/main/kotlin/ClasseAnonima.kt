// classe anonima pode ser chamada por callback
// SAM - Single Abstract Method (Utilizar LAMBDA apenas quando tem um método)
fun interface Colaborador {
    abstract fun calculaBonus(): Float
}

fun imprimeValorBonus(colaborador: Colaborador) {
    println(colaborador.calculaBonus())

}

fun main() {
    imprimeValorBonus { 0F } // LAMBDA

    imprimeValorBonus(object : Colaborador {
        override fun calculaBonus(): Float {
            return 0F
        } // callback / função anonima
    })

}