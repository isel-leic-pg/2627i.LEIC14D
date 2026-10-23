fun main() {
    val frutas = listOf("banana", "maçã", "laranja", "kiwi", "morango", "pera", "ananás", "uva")
// Para mostrar chars acentuados e cedilhas na consola

    System.setOut(
        java.io.PrintStream(System.out, true, "UTF-8")
    )

    // resolva aqui as alíneas seguintes
    // a.
    frutas.forEach {print("${it.uppercase()} ")} ; println()

    // b.
    println(frutas.filter { it.length>5 })

    // c
    println(frutas.map { it.length })

    // d
    println(frutas.filter { it.startsWith("m") || it.startsWith("M") })
    println(frutas.filter { it.lowercase().startsWith("m") })


    // e. Indique quantas frutas contêm a letra a.
    println( frutas.filter { it.contains("a") })
    println(frutas.count { it.contains("a") })

}