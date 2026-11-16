import pt.isel.canvas.*
const val SHOT_WIDTH = 4
const val SHOT_HEIGHT = 7

const val SHOT_ALIEN_COLOR = RED
const val SHOT_SHIP_COLOR = WHITE

const val SHOT_MIN_SPEED = 1
const val SHOT_MAX_SPEED = 4

data class Shot(
    val x: Int = (0..GAME_WIDTH-1-SHOT_WIDTH).random(),
    val y: Int = 0,
    val color : Int = SHOT_ALIEN_COLOR,
    val speed: Int = (SHOT_MIN_SPEED..SHOT_MAX_SPEED).random()
)

fun Shot.draw(canvas: Canvas){
    canvas.drawRect(x,y,SHOT_WIDTH, SHOT_HEIGHT, color)
}

fun Shot.move(): Shot{
    return copy(y=y+speed)
}