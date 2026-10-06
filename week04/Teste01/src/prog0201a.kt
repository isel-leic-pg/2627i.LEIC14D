fun main() {
    print("Introduza um nº inteiro: ")
    val valor = readln().toInt()

    if (valor % 2 == 0)
        println("$valor e' par")
    else
        println("$valor e' impar")
    val res = if (valor % 2 == 0) "par" else "impar"
    println("$valor e' $res")

    println("$valor e' " + if (valor % 2 == 0) "par" else "impar")
}