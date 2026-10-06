fun main() {
    print("Valor? ")
    val value = readln().toInt()
    if (value == 0)
        println("O valor é zero.")
    else
        if (value > 0)
            println("$value é positivo.") // Semelhante à seguinte
        else
            println("$value é negativo.") // Semelhante à anterior
}
