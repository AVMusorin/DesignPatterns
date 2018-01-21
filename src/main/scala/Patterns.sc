//import AbstractFactory._
//
//def abstract_factory_runner(factory: AbstractFactoryMain): Unit = {
// new Client(factory)
//}
//
//abstract_factory_runner(new ConcreteFactory)
//
//import Builder._
//
//def builder_runner(): Robot = {
// val director: Director = new Director(new SamsungRobotBuilder())
// director.buildRobot()
//}
//
//val r: Robot = builder_runner()
//
//r.leg

import FactoryMethod._

def factory_method_runner(value: String) = {
 if (value.equals("Apple")) {
  val appleBuilder: RobotBuilder = new AppleRobotBuilder()
  val appleRobot: Robot = appleBuilder.createRobot()
  appleRobot.action()
 } else if (value.equals("Samsung")){
  val samsungBuilder: RobotBuilder = new SamsungRobotBuilder()
  val samsungRobot: Robot = samsungBuilder.createRobot()
  samsungRobot.action()
 } else {
  println("Should be Samsung or Apple")
 }
}
factory_method_runner("Apple")
