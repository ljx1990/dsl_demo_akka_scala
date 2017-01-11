package basic.monoid

/**
  * Created by Administrator on 2017/1/11 0011.
  */
class Monoid01 {



}

object Monoid01 extends App{

  trait Monoid[T]{
    def op(m1:T,m2:T):T
    val identity:T
  }

  case class StringMoid() extends Monoid[String]{
    override def op(m1: String, m2: String): String = m1+m2
    override val identity: String = ""
  }

  //抽象类型A
  val stringMoid = StringMoid()
  //恒等值（identity）
  println(stringMoid.op(stringMoid.identity,"John"))
  //二元结合性函数（binary associative function）
  println(stringMoid.op("John","Hunt"))

  //Monoid和折叠
  List("A","B","C").foldLeft("")(_+_)
  List("A","B","c").foldLeft(stringMoid.identity)(stringMoid.op)



}


