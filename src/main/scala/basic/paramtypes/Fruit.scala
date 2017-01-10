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

abstract class Box3{
  def fruit:Fruit
  def contains(aFruit:Fruit) = fruit.name.equals(aFruit.name)
}

class OrangeBox2(orange:Orange) extends Box3{
  def fruit:Orange = orange
}

class AppleBox2(apple:Apple) extends Box3{
  def fruit:Apple  = apple
}
