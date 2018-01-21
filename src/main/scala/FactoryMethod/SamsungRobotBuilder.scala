package FactoryMethod

class SamsungRobotBuilder extends RobotBuilder {
  override def createRobot: Robot = {
    new SamsungRobot()
  }
}
