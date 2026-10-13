// Lê uma password e verifica se é boa ou fraca.
// Para ser considerada boa, deve ter pelo menos 6 caracteres,
// 2 letras, 1 algarismo e 1 letra maiúscula.

// A função count conta os caracteres que satisfazem
// uma condição recebida como parâmetro.
// São utilizadas diferentes funções para verificar se um
// carácter é uma letra, um algarismo ou uma letra maiúscula.

// Apresenta no ecrã se a password é boa ou fraca.

fun main() {
    val pass = readln().trim()
    val letters = count(pass, ::isLetter)
    val digits = count(pass, ::isDigit)
    val capitals = count(pass, ::isUpperCase )
    val type =
        if (
            pass.length>=6 &&
            letters>=2 &&
            digits >=1 &&
            capitals >=1
        ) "Boa" else "Fraca"
    println("A password é $type")
}

fun isUpperCase(c: Char) = c in 'A'..'Z'

fun count(w: String, condition: (Char) -> Boolean ): Int {
    var counter = 0
    for(c in w)
        if (condition(c)) counter++
    return counter
}
