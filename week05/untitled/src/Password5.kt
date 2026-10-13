// Lê uma password e verifica se é boa ou fraca.
// Para ser boa, deve ter pelo menos 6 caracteres,
// 2 letras, 1 algarismo e 1 letra maiúscula.

// Utiliza a função count com lambdas para contar
// as letras maiúsculas, os algarismos e as letras.
// A propriedade it representa o carácter a analisar.

// No final, verifica se a password satisfaz todos
// os critérios e apresenta o resultado no ecrã.

fun main() {
    val pass = readln().trim()
    val capitals = count(pass, { c -> c in 'A'..'Z' } )
    val digits = count(pass) { it in '0'..'9' }
    val letters = count(pass) {
        it in 'a'..'z' || it in 'A'..'Z'
    }
    val type =
        if (
            pass.length>=6 &&
            letters>=2 &&
            digits >=1 &&
            capitals >=1
        ) "Boa" else "Fraca"
    println("A password é $type")
}


