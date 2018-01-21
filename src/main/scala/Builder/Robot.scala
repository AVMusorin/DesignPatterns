package Builder


class Robot {
  /*
   Представляет сложный конструируемый объект.
   ConcreteBuilder строит внутреннее представление
   продукта и определяет процесс его сборки

   Включает классы, которые определяют составные части,
   в том числе интерфейсы для сборки конечного результата из частей
   */
  var head: String = ""
  var hand: String = ""
  var leg: String = ""

  def setHead(value: String): Unit = {this.head = value}

  def setHand(value: String): Unit = {this.hand = value}

  def setLeg(value: String): Unit = {this.leg = value}

  override def toString(): String = {
    "Head: " + this.head + ";" +
    "Hand: " + this.hand + ";" +
    "Leg: " + this.leg
  }
}

