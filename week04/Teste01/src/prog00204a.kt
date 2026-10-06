fun main(){
    print("Introduza um char: ")
    val ch = readln().trim()[0]   // 1º char introduzido

    if (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ||
        ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        println("'$ch' e uma vogal")
    else
        println("'$ch' nao e uma vogal")
}


