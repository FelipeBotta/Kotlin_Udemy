fun endereco(rua:String,cidade:String,estado:String,cep:String = ""){

}

//Só pode existir um vararg na função e é obrigatório que ele seja o último parametro

fun media(vararg n:Float):Float{
    var soma = 0F
    for (i in n){
        soma += i
    }
    return soma / n.size
}

fun calculaJuros():Nothing{
    throw Exception()
}

fun testeAny(vararg  abc:Any):Float{
    var soma1 = 0F
    for(i in abc){
        when(i){
            is Int -> println("Int")
            is Float -> println("Float")
        }
    }
    return soma1
}

fun main() {
    endereco("rua",estado = "estado", cidade = "cidade")
    println(media(1F,2F,4F))

}