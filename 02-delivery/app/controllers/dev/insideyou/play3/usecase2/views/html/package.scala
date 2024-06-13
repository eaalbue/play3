package dev.insideyou
package play3
package usecase2
package views
package html

import java.time.format.DateTimeFormatter
import java.time.LocalTime

extension (self: LocalTime)
  private def rendered: String =
    pattern.format(self)

private lazy val pattern: DateTimeFormatter =
  DateTimeFormatter.ofPattern("HH'h' mm'm' ss's' nnn'n'")
