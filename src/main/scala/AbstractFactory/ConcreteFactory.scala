package AbstractFactory

class ConcreteFactory extends AbstractFactoryMain {
  /*
  Конкретная фабрика, реализующая операции, создающие конкретные объекты продукты
   */

  override def createProduct(): AbstractProduct = new ConcreteProduct
}
