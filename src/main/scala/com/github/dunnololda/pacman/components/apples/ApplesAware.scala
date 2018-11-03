package com.github.dunnololda.pacman.components.apples

import com.github.dunnololda.pacman.util.Coord

/**
  * TODO
  *
  * @author aborunov
  */
trait ApplesAware {
  def initApples(): Unit

  def appleCoords: List[Coord]

  def removeApple(i: Int): Unit
}
