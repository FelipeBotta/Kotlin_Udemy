fun banco(conta:String, digito:String,tipoConta:String):String{

    var tamanhoConta = conta.length
    var tamanhoDigito = digito.length

    if(tamanhoConta != 6){
        return "Conta Inválida !"
    }

    if (tamanhoDigito < 2){
        return "Digito Inválido !"
    }

    if (tamanhoDigito == 2 && tipoConta == "Fisica"){
        return "Bem vindo à sua Conta Física"

    }

    return if (tamanhoDigito == 3 && tipoConta == "Corporativa"){
        "Bem vindo à sua Conta Corporativa"
    } else{
        "Tente Novamente !"
    }


}