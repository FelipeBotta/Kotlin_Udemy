fun portaria(idade: Int, tipo: String, codigo: String): String {
    if (idade < 18) {
        return "Negado. Menor de Idade !"
    }

    if (tipo != "comum" && tipo != "premium" && tipo != "luxo") {
        return "Negado. Convite inválido !"
    }

    return if (tipo == "comum" && codigo.startsWith("xt")) {
        "Welcome !"
    } else if (codigo.startsWith("xl")) {
        "Welcome !"
    } else {
        "Negado. Convite inválido !"
    }
}