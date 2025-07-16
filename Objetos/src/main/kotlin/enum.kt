enum class Cargo {
    DIRETOR, GERENTE

}

enum class Prioridade(val id:Int){
    BAIXA(1), MEDIA(2), ALTA(3)
}

fun calculaBonus(cargo: Cargo):Float {
    return if (cargo == Cargo.DIRETOR) {
        5000F
    } else if (cargo == Cargo.GERENTE) {
        3000F
    } else {
        2000F
    }
}

fun main() {
    calculaBonus(Cargo.GERENTE)

    for (p in Prioridade.entries){
        println(p.id)
    }
}