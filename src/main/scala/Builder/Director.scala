package Builder

class Director(builder: RobotBuilder){
  /*
  Конструирует объект, пользуясь интерфейсом Builder
   */

  def buildRobot(): Robot = {
    builder.buildHead()
           .buildHand()
           .buildLeg()
           .build()
  }
}
