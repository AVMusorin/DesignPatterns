package FactoryMethod

class AppleRobotBuilder extends RobotBuilder {
  override def createRobot: Robot = {
    new AppleRobot()
  }
}
