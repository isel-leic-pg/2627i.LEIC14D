import pt.isel.canvas.*

const val WIDTH = 700
const val HEIGHT = 500
const val SHIP_LINE =  450

const val SHIP_WIDTH = 250
const val SHIP_HEIGHT = 210
const val SHIP_COLOR = GREEN



fun main()
{
    var myGame = Game(Area(0), emptyList(),
                     SpaceShip((WIDTH-SHIP_WIDTH)/2), false)
    onStart {
        val canvas = Canvas(WIDTH, HEIGHT, BLACK)
        canvas.drawLine(0,SHIP_LINE, // (x1,y1)
                         WIDTH-1, SHIP_LINE, // (x2,y2)
                        YELLOW, 2)
        // draw the ship
        canvas.drawRect(myGame.ship.x, SHIP_LINE - SHIP_HEIGHT/2, SHIP_WIDTH, SHIP_HEIGHT, SHIP_COLOR)
        canvas.onTimeProgress(100){
            canvas.erase()
            myGame = myGame.copy(ship = SpaceShip(myGame.ship.x+20))
            canvas.drawRect(myGame.ship.x, SHIP_LINE - SHIP_HEIGHT/2, SHIP_WIDTH, SHIP_HEIGHT, RED)
            myGame
        }
    }


    onFinish {

    }
}