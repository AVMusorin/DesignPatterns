import AbstractFactory._

def abstract_factory_runner(factory: AbstractFactoryMain): Unit = {
 new Client(factory)
}

abstract_factory_runner(new ConcreteFactory)

import Builder._

def builder_runner(): Robot = {
 val director: Director = new Director(new SamsungRobotBuilder())
 director.buildRobot()
}

val r: Robot = builder_runner()

r.leg