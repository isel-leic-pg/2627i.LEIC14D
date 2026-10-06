fun main(){
    println("Introduza tres números:")
    val num1 = readln().trim().toInt()
    val num2 = readln().trim().toInt()
    val num3 = readln().trim().toInt()
    val max: Int

    if (num1>=num2 && num1>=num3)
       max = num1
    else
        if (num2>=num1 && num2>=num3)
            max = num2
        else
            max = num3

    println("Máximo entre $num1, $num2 e $num3 = $max")
}


