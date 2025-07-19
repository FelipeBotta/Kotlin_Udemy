// exemplo com abstract
abstract class Funcionario {
    abstract fun calculaBonus(): Float
}

class Gerente : Funcionario() {
    override fun calculaBonus(): Float {
        return 5000F

    }
}

class Analista : Funcionario() {
    override fun calculaBonus(): Float {
        return 3000F
    }

}

fun imprimeValorBonus(funcionario: Funcionario) {
    println(funcionario.calculaBonus())

}



fun main() {
    imprimeValorBonus(Analista())
    imprimeValorBonus(Gerente())

}


// exemplo com interface

interface Professor{
    fun calculaNota():Float
}

class Matematica: Professor{
    override fun calculaNota(): Float {
        return 10F
    }
}

class Fisica: Professor{
    override fun calculaNota(): Float {
        return 9F
    }
}

fun imprimeNota(professor: Professor){
    println(professor.calculaNota())
}