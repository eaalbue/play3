package dev.insideyou
package play3
package usecase2

final class Controller(
  boundary: Boundary
)(using
  ControllerComponents
) extends FancyController:
  lazy val refresh2 =
    Action.zio:
      boundary.currentTime.map(time => Ok(views.html.refresh(time)))
