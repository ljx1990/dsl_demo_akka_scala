package basic.paramtypes

/**
  * Created by Administrator on 2017/1/9 0009.
  */
abstract class Fruit {
  def name :String
}
class Orange extends Fruit{
  def name = "Orange"
}

class Apple extends Fruit{
  def name = "apple"
}

abstract class Box{
  def fruit:Fruit
  def contains(aFruit:Fruit) = fruit.name.equals(aFruit.name)
}

class OrangeBox(orange:Orange) extends Box{
  def fruit:Orange = orange
}

class AppleBox(apple:Apple) extends Box{
  def fruit:Apple  = apple
}
