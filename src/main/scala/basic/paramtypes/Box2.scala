package basic.paramtypes

/**
  * Created by Administrator on 2017/1/9 0009.
  */
class Box2[+T](fruit:T) {
  def method[U>:T](p:U) = {new Box2[U](p)}
}

object Box2{

  def main(args: Array[String]) {
    val apple: Apple = new Apple
    var box:Box2[Fruit] = new Box2[Orange](new Orange)
    box = box.method(apple)
  }
}

