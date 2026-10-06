fun main() {
    print("Introduza um nº inteiro: ")
    val valor = readln().trim().toInt()

    val res = if (valor % 2 == 0) "par" else "impar"
    println("O valor introduzido [$valor] é $res")
}