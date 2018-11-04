package com.github.dunnololda.pacman.components.subjects.pacman

import com.github.dunnololda.pacman.common.Symbols._
import com.github.dunnololda.pacman.components.map.Tile
import com.github.dunnololda.pacman.components.subjects.SubjectCharAware

/**
  * TODO
  *
  * @author aborunov
  */
trait PacmanCharAware extends SubjectCharAware {
  val tile: Tile = PACMAN
}
