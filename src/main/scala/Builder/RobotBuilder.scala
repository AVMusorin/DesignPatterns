package Builder

abstract class RobotBuilder {
  /*
  Задает абстрактный класс для создания частей объекта Product
   */

  val robot: Robot = new Robot()

  def buildHead(): RobotBuilder
  def buildHand(): RobotBuilder
  def buildLeg(): RobotBuilder


  def build(): Robot = this.robot
}
