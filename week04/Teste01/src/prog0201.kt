fun main() {
    print("Introduza um nº inteiro: ")
    val valor = readln().trim().toInt()

    if (valor % 2 == 0)
        println("$valor e' par")
    else
        println("$valor e' impar")
}