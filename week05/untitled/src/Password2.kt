// Lê uma password e verifica se é boa ou fraca.
// Uma password é boa se tiver pelo menos 6 caracteres,
// 2 letras e 1 algarismo.

// isLetter verifica se um carácter é uma letra.
// isDigit verifica se um carácter é um algarismo.
// countLetters2 conta as letras da password.
// countDigits2 conta os algarismos da password.

// Apresenta no ecrã se a password é boa ou fraca.

fun main() {
    val pass = readln().trim()
    val letters = countLetters2(pass)
    val digits = countDigits2(pass)
    val type =
        if (pass.length>=6 && letters>=2 && digits >=1) "Boa" else "Fraca"
    println("A password é $type")
}

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

fun isDigit(c: Char) = c in '0'..'9'

fun countLetters2(w: String): Int {
    var counter = 0
    for(c in w)
        if (isLetter(c)) counter++
    return counter
}

fun countDigits2(w: String): Int {
    var counter = 0
    for(c in w)
        if (isDigit(c)) counter++
    return counter
}