package dev.insideyou
package play3
package usecase2

object BusinessLogic:
  lazy val make: Boundary =
    new:
      override lazy val currentTime =
        ZIO.succeed(java.time.LocalTime.now.nn)
