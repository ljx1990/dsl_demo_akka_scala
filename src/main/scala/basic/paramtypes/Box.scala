package basic.paramtypes

/**
  * Created by Administrator on 2017/1/9 0009.
  */
abstract class Box[+F<:Fruit] {
  def fruit:F
  def contains(aFruit:Fruit) = fruit.name.equals(aFruit.name)
}

class OrangeBox(orange:Orange) extends Box[Orange]{
  def fruit = orange;
}

class AppleBox(apple:Apple) extends Box[Apple]{
  def fruit = apple
}

class BoxUse{
  var fruitBox:Box[Fruit]  =  new AppleBox(new Apple)
  var fruit:Fruit = fruitBox.fruit
}
