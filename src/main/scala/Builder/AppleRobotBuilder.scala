package Builder


class AppleRobotBuilder extends RobotBuilder {
  /*
   Конструирует и собирает вместе части продукта последством реализации интерфеса Builder
   Определяет создаваемое представление и следит за ним
   Предоставляет интерфейс для доступа к продукту
   */

  override def buildHead(): RobotBuilder = {
    robot.setHead("AppleHead")
    this
  }
  override def buildHand():RobotBuilder = {
    robot.setHand("AppleHand")
    this
  }
  override def buildLeg(): RobotBuilder = {
    robot.setLeg("AppleHand")
    this
  }
}
