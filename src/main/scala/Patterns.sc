import AbstractFactory._
def abstract_factory_runner(factory: AbstractFactoryMain): Unit = {
 new Client(factory)
}

abstract_factory_runner(new ConcreteFactory)