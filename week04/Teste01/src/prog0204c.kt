fun main() {
    print("Introduza um char: ")
    val ch = readln().trim()[0]   // 1º char introduzido

    if (ch in "aeiouAEIOU")
        println("'$ch' e uma vogal")
    else
        println("'$ch' nao e uma vogal")
}