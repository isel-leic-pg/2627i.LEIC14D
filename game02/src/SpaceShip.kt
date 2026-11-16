import pt.isel.canvas.*

// Ship - Constantes
const val SHIP_Y =  450

const val SHIP_WIDTH = 50
const val SHIP_HEIGHT = 10
const val SHIP_COLOR = GREEN

const val SHIP_GUN_WIDTH = 4
const val SHIP_GUN_HEIGHT = 5
const val SHIP_GUN_COLOR = YELLOW

//n (x,y) são o topo do canto esquerdo da nava
data class SpaceShip(
    val x: Int = (GAME_WIDTH-SHIP_WIDTH)/2,
    val y:Int = SHIP_Y-SHIP_HEIGHT/2
)

fun SpaceShip.draw(canvas: Canvas) {
    canvas.drawLine(0,SHIP_Y, // (x1,y1)
        GAME_WIDTH-1, SHIP_Y, // (x2,y2)
        YELLOW, 1)

    canvas.drawRect(x, y, SHIP_WIDTH, SHIP_HEIGHT, SHIP_COLOR)
    canvas.drawRect(x+SHIP_WIDTH/2-SHIP_GUN_WIDTH/2, y-SHIP_GUN_HEIGHT, SHIP_GUN_WIDTH, SHIP_GUN_HEIGHT, SHIP_GUN_COLOR)

}

fun SpaceShip.move(dx: Int): SpaceShip {
    var newX = x + dx
    if (newX < 0) newX = 0
    if (newX+SHIP_WIDTH>=GAME_WIDTH) newX = GAME_WIDTH-SHIP_WIDTH
    return SpaceShip(newX, y)
   return this
}