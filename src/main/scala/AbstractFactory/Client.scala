package AbstractFactory

class Client(factory: AbstractFactoryMain) {
  /*
  Клиент пользуется исключительно интерфейсами, которые объявлены в классах:
  AbstractFactory & AbstractProduct
   */
  val product = factory.createProduct
  println(product.action)
}
