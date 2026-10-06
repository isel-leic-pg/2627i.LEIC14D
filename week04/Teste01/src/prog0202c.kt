fun main(){
    println("Introduza dois números:")
    val num1 = readln().trim().toInt()
    val num2 = readln().trim().toInt()
    println("Máximo entre $num1 e $num2 = ${if (num1 > num2) num1 else num2}")
}
