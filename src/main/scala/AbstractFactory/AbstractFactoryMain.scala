package AbstractFactory

abstract class AbstractFactoryMain {
  /*
    Абстрактная фабрика, которая объявляет интерфейс для операции, создающих
    абстрактные объекты - продукты
   */
  def createProduct: AbstractProduct
}
