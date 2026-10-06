fun drawLine(n: Int, ch: Char, addNewLine: Boolean=true) {
  var i = 1
  while (i <= n) {
    print(ch)
    i = i + 1
  }
  if (addNewLine)
    println()
}

fun drawRectangle(rows: Int, cols: Int, myChar: Char){
  var i=1
  while (i<=rows) {
    drawLine(cols, myChar)
    i++
  }
}

fun drawSquare(side: Int, myChar: Char){
  drawRectangle(side, side, myChar)
}

fun drawTopLeftTriangle(side: Int, myChar: Char){
  var i=1
  while (i<=side)
    drawLine(i++, myChar)

}

fun main(){
  drawRectangle(4,50, '*')
  drawRectangle(6,10, '?')

  drawSquare(7,'%')
  drawTopLeftTriangle(6, '$')
}