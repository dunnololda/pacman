package com.github.dunnololda.pacman.components.subjects
import com.github.dunnololda.pacman.components.init.InitCoordsAware
import com.github.dunnololda.pacman.components.map.MapAware
import com.github.dunnololda.pacman.components.subjects.pacman.Pacman

/**
  * TODO
  *
  * @author aborunov
  */
trait SubjectsSupport extends SubjectsAware with MapAware with InitCoordsAware {
  val pacman: Pacman = new Pacman with MapAwareImpl with InitCoordsAwareImpl
  pacman.init()
}
