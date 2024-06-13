package dev.insideyou
package play3
package usecase2

def controller: Using[ControllerComponents, Controller] =
  Controller(
    boundary = BusinessLogic.make
  )
