package dev.insideyou
package play3
package usecase1

import java.time.LocalTime

trait Boundary:
  def currentTime: UIO[LocalTime]
