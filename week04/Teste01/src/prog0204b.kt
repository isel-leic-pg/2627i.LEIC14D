fun main() {
    print("Introduza um char: ")
    val ch = readln().trim()[0]   // 1º char introduzido

    when (ch) {
        'a','e','i','o','u',
        'A','E','I','O','U'-> println("'$ch' e uma vogal")
        else -> println("'$ch' nao e uma vogal")
    }
}