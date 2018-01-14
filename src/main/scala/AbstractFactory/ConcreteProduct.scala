package AbstractFactory

class ConcreteProduct extends AbstractProduct {
  /*
  Конкретный продукт, определяет объект продукт, создаваемый соответсвующей
  конкретной фабрикой
   */
  def action(): String = "Конкретный продукт - событие"
}
