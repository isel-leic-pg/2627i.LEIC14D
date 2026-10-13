// Lê uma password e verifica se é boa ou fraca.
// Para ser boa, deve ter pelo menos 6 caracteres,
// 2 letras, 1 algarismo e 1 letra maiúscula.

// A variável fx armazena uma referência para uma função
// que recebe um carácter e devolve um valor Boolean.
// A mesma variável é utilizada para referenciar diferentes
// funções: isLetter, isDigit e isUpperCase.

// A função count é chamada três vezes para contar,
// respetivamente, as letras, os algarismos e as maiúsculas.

// No final, apresenta se a password é boa ou fraca.

fun main() {
    val pass = readln().trim()
    var fx: (Char)->Boolean = ::isLetter
    val letters = count(pass, fx)
    fx = ::isDigit
    val digits = count(pass, fx)
    fx = ::isUpperCase
    val capitals = count(pass, fx )
    val type =
        if (
            pass.length>=6 &&
            letters>=2 &&
            digits >=1 &&
            capitals >=1
        ) "Boa" else "Fraca"
    println("A password é $type")
}

