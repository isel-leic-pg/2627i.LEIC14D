fun main(){
    print("Introduza a idade: ")
    val idade = readln().toInt()

    // se idade <0 entao big problem
    if (idade<0)
        println("Idade invalida!!!")
    else {
        println("A idade é $idade")
        println("No proximo ano terá ${idade + 1}")
    }
}