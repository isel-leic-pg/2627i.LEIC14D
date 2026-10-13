fun readLetter(validLetters: String ): Char {
    while( true ) {
        val line = readln().trim()
        if ( line.length > 0 ) { // Se não for linha vazia
            val letter = line[0].uppercaseChar()
            if ( letter in validLetters ) return letter
        }
    }
}
fun main() {
    println("Pense num numero entre 0 e 15")
    var range = 0..15
    do {
        val middle = (range.last + range.first) / 2
        print("$range: O numero e' maior que $middle ? (S/N) ")
        range = if (readLetter("SN") == 'S' ) (middle + 1)..range.last
        else range.first..middle
    }while ( range.count() > 1 )
    println("O numero e' ${ range.first }")
}
