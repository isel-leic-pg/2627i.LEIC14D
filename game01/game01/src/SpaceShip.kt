import pt.isel.canvas.Canvas

// SpaceShip(x,y=
//   (x,y) - Topo esquerdo da nave

data class SpaceShip(
  val x: Int = (GAME_WIDTH-SHIP_WIDTH)/2,
  val y: Int = SHIP_Y-SHIP_HEIGHT/2
)


// Desenhar a própria spaceship no canvas
fun SpaceShip.draw( cv: Canvas){
  cv.drawRect(x, y, SHIP_WIDTH, SHIP_HEIGHT,  SHIP_COLOR)
  cv.drawRect(x + SHIP_WIDTH/2-SHIP_POINTER_WIDTH/2,
              y - SHIP_POINTER_HEIGHT,
             SHIP_POINTER_WIDTH,  SHIP_POINTER_HEIGHT, SHIP_POINTER_COLOR)

}

// So posso mover a nave se:
//   1. Se com o deslocamento dx nao ficar antes da posicao 0
//   2. Se com o deslocamento final direito da nave nao ficar fora do ecran
fun SpaceShip.move(dx: Int): SpaceShip {
    // Verificar que nao ultrapassa a margem esquera
    if (x+dx<0)
        return SpaceShip(0)

    // Verificar se não ultrapassa a margem direita
    if (x+SHIP_WIDTH+dx>=GAME_WIDTH)
        return SpaceShip(GAME_WIDTH-SHIP_WIDTH)

    // Caso geral, anda dx
    return SpaceShip(x+dx)
}

