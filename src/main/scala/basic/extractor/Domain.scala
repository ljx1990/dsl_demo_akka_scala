package basic.extractor

/**
  * Created by Administrator on 2017/1/6 0006.
  */
object Domain{
  def apply(parts:String *) :String = parts.reverse.mkString(".")
  def unapplySeq(whole:String): Option[Seq[String]] =
    Some(whole.split("\\.").reverse)


  def main(args: Array[String]) {
    println(Domain(".com","22"))
  }
}