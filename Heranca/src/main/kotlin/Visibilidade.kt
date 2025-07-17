class Visibilidade {
     protected var str: String = ""
     protected fun abc(){}

    // Nested - interna
    private inner class Teste(){
        var id: Int = 0

        fun teste(){}

    }

}


fun main() {



}

// Nested é uma classe interna que naturalmente não consegue acessar os atributos
// da classe mãe, porém se acrescentado o inner antes do class fica possível
// acessar os atributos da classe mãe mesmo dentro da nested
// a classe mãe pode acessar a nested independentemente da inner