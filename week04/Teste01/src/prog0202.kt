fun main(){
    println("Introduza dois números:")
    val num1 = readln().trim().toInt()
    val num2 = readln().trim().toInt()
    if (num1>num2)
        println("Máximo entre $num1 e $num2 = $num1")
    else
        println("Máximo entre $num1 e $num2 = $num2")
}


