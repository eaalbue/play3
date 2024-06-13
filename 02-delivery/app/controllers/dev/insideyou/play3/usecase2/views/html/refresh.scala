package dev.insideyou
package play3
package usecase2
package views
package html

import java.time.LocalTime

def refresh(time: LocalTime): String =
  time.rendered
