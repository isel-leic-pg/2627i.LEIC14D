import pt.isel.canvas.*





fun main(){
    var game = Game(
        Area(-9999),
        listOf<Shot>(),
        SpaceShip(),
        false
    )
    onStart {
        val canvas = Canvas(GAME_WIDTH, GAME_HEIGHT, BLACK)
        canvas.drawYLine()
        // Desenhar a nave
        game.ship.draw(canvas)

        canvas.onMouseMove { me ->
            println("$me")
            val new_ship = game.ship.move(2)
            canvas.erase()
            game = game.copy(ship=new_ship)

            game.ship.draw(canvas)
        }

    }

}

fun Canvas.drawYLine(){
    drawLine(0, SHIP_Y, GAME_WIDTH-1, SHIP_Y,  YELLOW, 1)
}

