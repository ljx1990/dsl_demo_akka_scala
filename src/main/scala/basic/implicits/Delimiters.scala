package basic.implicits

/**
  * 隐式参数
  */
object Delimiters2 extends App{

  case class Delimiters(left:String,right:String)

  def quote(what:String)(implicit delimis:Delimiters) = delimis.left+what+delimis.right

  implicit val quoteDelimiters = new Delimiters("<<",">>")

  println( quote("lvjx"))


  def smaller[T](a:T,b:T)(implicit order:T =>Ordered[T]) = if(a<b) a else b

  println( smaller(40, 2))
}
