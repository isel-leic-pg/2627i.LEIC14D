fun main() {
    print("Introduza um numero de 1 a 5: ")
    val numero = readln().trim().toInt()

    if (numero < 1 || numero > 5)
        println("numero invalido!!")

    when (numero) {
        1 -> println("1")
        2 -> println("2\n1")
        3 -> println("3\n2\n 1")
        4 -> println("4\n3\n 2 \n 1")
        5 -> println("5\n4\n3\n2\n 1")
    }
}