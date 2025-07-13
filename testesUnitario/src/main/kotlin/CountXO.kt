import java.lang.IndexOutOfBoundsException

fun countXO(str: String): Boolean{
    val texto = str.lowercase()
    var countX = 0
    var countO = 0

    var length = texto.length
    while (length > 0){
        if(texto[length - 1] == 'x'){
            countX++
        }
        if (texto[length -1] == 'o'){
            countO++
        }
        length--
    }
    return (countX == countO && countO !=0)
}

fun abc(){
    throw IndexOutOfBoundsException()
}

