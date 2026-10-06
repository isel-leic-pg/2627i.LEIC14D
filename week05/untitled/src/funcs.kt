fun max2(a: Int, b: Int) : Int{
    if (a >= b)
        return a
    else
        return b
}

fun max3(a: Int, b: Int, c: Int) : Int{
  return max2(max2(a,b),c)
}

fun main() {
    print("Introd um valor: ")
    val n = readln().trim().toInt()

    print("Introd outro valor: ")
    val m = readln().trim().toInt()

    val maior = max2(n, m)

    println("O maior entre $n e $m --> $maior")

}