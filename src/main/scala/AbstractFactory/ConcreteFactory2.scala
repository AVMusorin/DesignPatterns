package AbstractFactory

class ConcreteFactory2 extends AbstractFactoryMain {
   /*
    Конкретная фабрика, реализующая операции, создающие конкретные объекты продукты
   */

  override def createProduct(): AbstractProduct = new ConcreteProduct2
}
