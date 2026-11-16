import pt.isel.canvas.*
data class Game(
    val area: Area,
    val alienShots: List<Shot>,
    val ship: SpaceShip,
    val over: Boolean
)

fun Game.draw(canvas: Canvas){
    ship.draw(canvas)
    alienShots.forEach { shot ->
        shot.draw(canvas) }
}