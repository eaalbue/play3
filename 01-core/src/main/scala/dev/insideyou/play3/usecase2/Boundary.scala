package dev.insideyou
package play3
package usecase2

import java.time.LocalTime

trait Boundary:
  def currentTime: UIO[LocalTime]
