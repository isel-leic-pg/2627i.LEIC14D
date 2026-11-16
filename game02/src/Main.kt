import pt.isel.canvas.*
import javax.swing.text.html.CSS.Attribute.BACKGROUND_COLOR


fun main()
{
    var myGame = Game(Area(),listOf<Shot>(),SpaceShip(), false)

    onStart {
        val canvas = Canvas(
            myGame.area.width,
            myGame.area.height,
            GAME_BACKGROUND_COLOR
        )
        myGame.draw(canvas)

        canvas.onTimeProgress(GAME_TICK){
            canvas.erase()

            myGame = myGame.copy(ship = myGame.ship.move(1))
            myGame.draw(canvas)

            myGame = myGame.copy(alienShots = myGame.alienShots + Shot())
            }
    }


    onFinish {

    }
}