fun mySumDigits(num: Int): Int{
    var soma=0
    var n = num
    while(n!=0){
        soma += n%10
        n /=10
    }
    return soma
}

fun Int.sumDigits() : Int{
    var soma=0
    var n = this
    while(n!=0){
        soma += n%10
        n /=10
    }
    return soma
}


fun main(){
    var valor = 0
    do{
        print("Um valor: ")
        valor = readln().trim().toInt()
        println("A soma dos digitos de $valor --> ${mySumDigits(valor)}")
        println("A soma dos digitos de $valor --> ${valor.sumDigits()}")
    }
    while (valor!=0)
}